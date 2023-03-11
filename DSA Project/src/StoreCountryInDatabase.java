import eu.bitm.NominatimReverseGeocoding.Address;
import eu.bitm.NominatimReverseGeocoding.NominatimReverseGeocodingJAPI;
import java.sql.*;
public class StoreCountryInDatabase{
    public static void main(String[] args) throws ClassNotFoundException, SQLException{

        NominatimReverseGeocodingJAPI nominatim1 = new NominatimReverseGeocodingJAPI();
        Address address;

        String url = "jdbc:mysql://localhost:3306/dsa_pbl";       // where last jdbc is Database name in MySQL
        String uname = "root";
        String pass = "pass";


        String query = "SELECT * FROM earthquake WHERE Date LIKE '%2016%'";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection com = DriverManager.getConnection(url, uname, pass);
        Statement st = com.createStatement();
        ResultSet rs = st.executeQuery(query);
        String country = "";
        while (rs.next()) {
            double lat = rs.getDouble("latitude");
            double lon = rs.getDouble("longitude");
            String date = rs.getString("Date");
            address = nominatim1.getAdress(lat, lon);
            System.out.println(country + "  " + date);

            if (address!=null) {
                country = address.getCountry();

            }
            String update;
            if(country.contains("'")){     // if country contains '
                update = "INSERT INTO temp(Date) VALUES('" + date + "') ";
                st = com.createStatement();
                st.executeUpdate(update);
                continue;
            }          // if country is not unable to geocode
            if (!country.equals("")){
                update = "INSERT INTO temp(country, Date) VALUES('" + country + "', '" + date + "') ";
            } else {       // if unable to geocode, just insert date value
                update = "INSERT INTO temp(Date) VALUES('" + date + "') ";
            }
            st = com.createStatement();
            st.executeUpdate(update);
        }

        st.close();
        com.close();

    }      // end of main() method
}      // end of program
