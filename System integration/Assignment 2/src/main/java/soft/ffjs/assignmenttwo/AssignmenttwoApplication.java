package soft.ffjs.assignmenttwo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.opencsv.CSVReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import soft.ffjs.csv.CSVHandler;
import soft.ffjs.csv.CSVPerson;
import soft.ffjs.email.EmailHandler;
import soft.ffjs.rest.Country;
import soft.ffjs.rest.RestClient;
import soft.ffjs.soap.SoapClient;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AssignmenttwoApplication {

    public static void main(String[] args) throws Exception {
        System.out.println("Use: First argument supplied should be .csv file with employees.");
        System.out.println("Use: Second argument supplied should folder to output .eml files to.");
        System.out.println("Use: Third argument supplied should be name of file for attachment.");
        System.out.println("If an argument isn't supplied, default values will be used:");
        System.out.println(".csv file: 'inputdata.csv' in current folder.");
        System.out.println("Output will be current folder.");
        System.out.println("'attachment.pdf' in current folder");
        System.out.println("");

        String inputfilename = "inputdata.csv";
        String outputpath = "";
        String attachment = "attachment.pdf";

        if(args.length > 0){
            System.out.println("Will use file: " + args[0]);
            inputfilename = args[0];
        }else {
            System.out.println("No input file supplied. Will use default.");
        }
        if (args.length > 1) {
            if(!args[1].endsWith("/")){
                args[1] = args[1] + "/";
            }
            System.out.println("Will output to: " + args[1]);
            outputpath = args[1];
        }else {
            System.out.println("No output file path supplied. Will use default.");
        }
        if (args.length > 2) {
            System.out.println("Will attach file: " + args[2]);
            attachment = args[2];
        }else {
            System.out.println("No filepath to attached file supplied. Will use default.");
        }

        List<CSVPerson> list = CSVHandler.readAllLines(inputfilename);
        list.remove(0);

        for (CSVPerson person : list) {
            Country country = RestClient.ipToCountry(person.getIp());
            String title = RestClient.nameToGender(person.getFirstName(), country.getCountryCode());
            String flagurl = SoapClient.getFlagFromCountry(country.getCountryCode());
            String message = String.format("<b>Dear %s</b> %s %s\n<img width=\"20\", src=\"%s\"/> <br>You are invited to the party!", title, person.getFirstName(), person.getLastName(), flagurl);

            ArrayList<File> attachments = new ArrayList<File>();
            File file = new File(attachment);
            if(file.exists()){
                attachments.add(file);
            }else {
                System.out.println("Could not attach file:" + attachment + ". File not found.");
            }
            EmailHandler.createMessage(person.getEmail(), "email@company.com", "Invitation", message, attachments, outputpath + person.getFirstName() + person.getLastName());
        }

    }

}
