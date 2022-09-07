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

        if(args.length > 0){
            String pathstr = args[1];

        }

        List<CSVPerson> list = CSVHandler.readAllLines("inputdata.csv");
        list.remove(0);

        for (CSVPerson person : list) {
            Country country = RestClient.ipToCountry(person.getIp());
            String title = RestClient.nameToGender(person.getFirstName(), country.getCountryCode());
            String flagurl = SoapClient.getFlagFromCountry(country.getCountryCode());
            String message = String.format("<b>Dear %s</b> %s %s\n<img width=\"20\", src=\"%s\"/> <br>You are invited to the party!", title, person.getFirstName(), person.getLastName(), flagurl);

            EmailHandler.createMessage(person.getEmail(), "email@company.com", "Invitation", message, new ArrayList<File>(), person.getFirstName() + person.getLastName());
        }

    }

}
