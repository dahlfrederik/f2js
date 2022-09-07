package soft.ffjs.csv;

import com.opencsv.bean.CsvBindByPosition;

public class CSVPerson {
    @CsvBindByPosition(position = 0)
    private String firstName;

    @CsvBindByPosition(position = 1)
    private String lastName;

    @CsvBindByPosition(position = 2)
    private String email;

    @CsvBindByPosition(position = 3)
    private String ip;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "CSVPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
