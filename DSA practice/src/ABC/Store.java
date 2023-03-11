package ABC;

import eu.bitm.NominatimReverseGeocoding.Address;
import eu.bitm.NominatimReverseGeocoding.NominatimReverseGeocodingJAPI;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class Store {

    public static HashMap<Integer, List<Earthquake>>[] yearlyEQs;
    static HashMap <Integer, List<Earthquake>>[] yearlyEQS = new HashMap[52];

    public void storing() throws IOException {

        NominatimReverseGeocodingJAPI n = new NominatimReverseGeocodingJAPI();

        File file = new File("E:\\DSA\\DSA Project\\src\\Databases\\Valid countries and cities.csv");

        FileWriter writer = new FileWriter("E:\\DSA\\DSA Project\\src\\Files\\temp.txt", true);

        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        br.readLine();

        List<Earthquake>[] list = new List[52];
        for (int i = 0; i < yearlyEQS.length; i++) {
            yearlyEQS[i]=new HashMap<>();
            list[i] = new ArrayList<>();
        }


        int y = 1965, L = 0;
        int j = 0, i = 0;
        while ((line = br.readLine()) != null && L<1103) {


            String[] read = line.split(",");
            long d2 = Date.parse(read[1]);
            SimpleDateFormat d = new SimpleDateFormat("yyyy");
            int year = Integer.parseInt(d.format(d2));
            double latitude = Double.parseDouble(read[3]);
            double longitude = Double.parseDouble(read[4]);
            double magnitude = Double.parseDouble(read[9]);


            if(year!=y) {
                j++;
                i++;
                y=year;
                list[i] =  new ArrayList<>();
            }

            try {
                Address address = n.getAdress(latitude, longitude);
                String city="",country="";

                if (address != null) {
                    city = address.getCity();
                    country = address.getCountry();
                    System.out.println(city+"  "+country);
                    writer.write(year+" "+magnitude+"=["+country+": "+city+"]\n");
                }

                list[i].add(new Earthquake(country, city, magnitude, year));

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            yearlyEQS[j].put(year,list[i]);
            L++;

        }

        System.out.println(yearlyEQS[0]);
        System.out.println(yearlyEQS[0].size());
        /*

        int years = 1965;
        List<Earthquake> EQs ;

        for (int i = 0; i < yearlyEQS.length; i++) {

            EQs = yearlyEQS[i].get(years);

            for (int j = 0; j < EQs.size(); j++) {
                System.out.println(EQs.get(j).getYear()+"  "+EQs.get(j).getMagnitude());
            }

            years++;
        }

*/
    }




//    public static void main(String[] args) {
//        System.out.println(yearlyEQS[0]);
//        System.out.println(yearlyEQS[0].size());
//    }
}



