import eu.bitm.NominatimReverseGeocoding.Address;
import eu.bitm.NominatimReverseGeocoding.NominatimReverseGeocodingJAPI;

public class abc {
    public static void main(String[] args) {

        NominatimReverseGeocodingJAPI nominatim1 = new NominatimReverseGeocodingJAPI();
        Address address = nominatim1.getAdress(-38.747, 178.061);
        String city = address.getCity();
        String country = address.getCountry();
        System.out.println(city);
        System.out.println(country);
    }
}
