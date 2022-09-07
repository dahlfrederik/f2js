package soft.ffjs.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {


    @JsonProperty("country")
    public String country;

    @JsonProperty("countryCode")
    public String countryCode;

    public Country() {

    }

    public Country(String country, String countryCode) {
        this.country = country;
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
