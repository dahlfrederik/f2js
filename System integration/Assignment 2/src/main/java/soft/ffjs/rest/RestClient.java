package soft.ffjs.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@SpringBootApplication
public class RestClient {

    public static Country ipToCountry(String ip) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        String resourceUrl = "http://ip-api.com/json/" + ip;
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<String> response = restTemplate.exchange(resourceUrl, HttpMethod.GET, entity, String.class);
        if (response.getStatusCode() == HttpStatus.OK) {
            ObjectMapper mapper = new ObjectMapper();
            Country country = mapper.readValue(response.getBody(), Country.class);
            return country;
        } else {
            return null;
        }
    }


    public static String nameToGender(String name, String country) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        String resourceUrl = "https://api.genderize.io/?name=" + name + "&country_id=" + country;
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<String> response = restTemplate.exchange(resourceUrl, HttpMethod.GET, entity, String.class);
        if (response.getStatusCode() == HttpStatus.OK) {
            ObjectMapper mapper = new ObjectMapper();
            Person person = mapper.readValue(response.getBody(), Person.class);

            try {
                if (person.getGender().equals("male")) {
                    return "Mr.";
                } else if (person.getGender().equals("female")) {
                    return "Ms.";
                }
            } catch (NullPointerException ex) {
                return "";
            }
            return "Name not found";

        } else {
            return "ERROR";
        }
    }


}
