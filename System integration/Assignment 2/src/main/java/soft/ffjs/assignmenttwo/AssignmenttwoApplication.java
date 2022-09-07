package soft.ffjs.assignmenttwo;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import soft.ffjs.rest.RestClient;
import soft.ffjs.soap.SoapClient;

@SpringBootApplication
public class AssignmenttwoApplication {

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println(RestClient.ipToCountry("24.48.0.1"));
        System.out.println(RestClient.nameToGender("josef", "dk"));
        System.out.println(SoapClient.getFlagFromCountry("DK"));

    }

}
