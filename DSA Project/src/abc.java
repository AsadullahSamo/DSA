import eu.bitm.NominatimReverseGeocoding.Address;
import eu.bitm.NominatimReverseGeocoding.NominatimReverseGeocodingJAPI;

import java.util.ArrayList;

public class abc {
    public static void main(String[] args) {

        NominatimReverseGeocodingJAPI nominatim1 = new NominatimReverseGeocodingJAPI();
        Address address = nominatim1.getAdress(-8.619, 125.008);
        String city = address.getCity();
        String country = address.getCountry();

//        System.out.println(city);
        System.out.println(country);




    }     // end of main() method
}        //  end of program
