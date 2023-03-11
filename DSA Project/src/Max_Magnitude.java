import eu.bitm.NominatimReverseGeocoding.Address;
import eu.bitm.NominatimReverseGeocoding.NominatimReverseGeocodingJAPI;

import java.io.FileWriter;

import java.io.IOException;
import java.sql.*;
import java.util.*;

public class Max_Magnitude {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        NominatimReverseGeocodingJAPI nominatim1 = new NominatimReverseGeocodingJAPI();
        Address address;

        String url = "jdbc:mysql://localhost:3306/dsa_pbl";       // where last jdbc is Database name in MySQL
        String uname = "root";
        String pass = "asad56@mysql.com";



        ArrayList<Object> entireArrayList = new ArrayList<>();
        ArrayList<Object> countryArrayList = new ArrayList<>();

        FileWriter writer = new FileWriter("E:\\DSA\\DSA Project\\src\\Files\\Max Magnitude For Queue.txt", true);

        String country = "";
        // Blank String means "unable to geocode"
        int year = 1965;
        while(year!=2017) {
            String query = "SELECT latitude, longitude, magnitude, Date FROM earthquake WHERE Date LIKE '%"+year+"%'\n" +
                    "ORDER BY SUBSTR(Date, -4), magnitude DESC;\n";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection com = DriverManager.getConnection(url, uname, pass);
            Statement st = com.createStatement();
            ResultSet rs = st.executeQuery(query);


            while (rs.next()) {
                double lat = rs.getDouble("latitude");
                double lon = rs.getDouble("longitude");
                double mag = rs.getDouble("magnitude");
                String date = rs.getString(4);
                address = nominatim1.getAdress(lat, lon);
                if (address != null) {
                    country = address.getCountry();
                }
                entireArrayList.add(country);
                if (!country.equals("")) {
                    countryArrayList.add(country.concat(": ").concat(date));
                    writer.write(country + ": " + mag + " " + "\n");
                    year++;
                    break;
                }
            }
        }
        writer.close();

        System.out.println(entireArrayList);
        System.out.println(countryArrayList);




    }   // end of main()
}     // end of program
