package soft.ffjs.soap;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class SoapClient {

    public static String getFlagFromCountry(String countryISO) {

        CountryInfoServiceLocator locator = new CountryInfoServiceLocator();
        try {
            return locator.getCountryInfoServiceSoap().countryFlag(countryISO);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return "Country not found";
    }

}
