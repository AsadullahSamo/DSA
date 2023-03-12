import eu.bitm.NominatimReverseGeocoding.Address;
import eu.bitm.NominatimReverseGeocoding.NominatimReverseGeocodingJAPI;

public class Test {
    public static void main(String[] args) {

        NominatimReverseGeocodingJAPI nominatim1 = new NominatimReverseGeocodingJAPI();
        Address address = nominatim1.getAdress(60.949, 167.089);
        String city = address.getCity();
        String country = address.getCountry();

//        System.out.println(city);
        System.out.println(country);




    }     // end of main() method
}        //  end of program
