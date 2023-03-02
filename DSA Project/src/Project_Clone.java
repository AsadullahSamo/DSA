import eu.bitm.NominatimReverseGeocoding.Address;
import eu.bitm.NominatimReverseGeocoding.NominatimReverseGeocodingJAPI;
import java.sql.*;
import java.util.ArrayList;

public class Project_Clone {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


    NominatimReverseGeocodingJAPI nominatim1 = new NominatimReverseGeocodingJAPI();
    Address address;

    String url = "jdbc:mysql://localhost:3306/dsa_pbl";       // where last jdbc is Database name in MySQL
    String uname = "root";
    String pass = "password";

    String query = "SELECT * FROM clone_earthquake2 WHERE Date LIKE '%/65%'";
        Class.forName("com.mysql.cj.jdbc.Driver");
    Connection com = DriverManager.getConnection(url, uname, pass);
    Statement st = com.createStatement();
    ResultSet rs = st.executeQuery(query);


    // Fetch the whole table
    int i = 0;
    ArrayList<String> arrayList3 = new ArrayList<>();
    ArrayList<String> arrayList5 = new ArrayList<>();
        while(rs.next()) {
        double lat = rs.getDouble("latitude");
        double lon = rs.getDouble("longitude");
        int colNum = rs.getInt("col_num");
        address = nominatim1.getAdress(lat, lon);
        String country = "", city = "";
        if(address!=null) {
            country = address.getCountry();
            city = address.getCity();
        }
//            System.out.println(country + "  " + city + " " + colNum);

//            arrayList3.add(city);
//            arrayList5.add(country);
    }     // end of while loop
        st.close();
        com.close();


//        ArrayList<String> arrayList4 = new ArrayList<>();
//
//        for (i=0; i<arrayList3.size(); i++){
//            if (!arrayList3.get(i).equals("") && !arrayList5.get(i).equals("")){
//                arrayList4.add(arrayList3.get(i) +" , "+ arrayList5.get(i)+" "+(i+1));
//            }
//        }
//
//
////        for (i=0; i<arrayList3.size(); i++){
////            System.out.println(arrayList3.get(i) + " i is  "+i+1);
////        }
////        System.out.println(arrayList3);
////        System.out.println(arrayList5);
////        System.out.println(arrayList4);
//
//        for (i=0; i<arrayList4.size(); i++){
//            System.out.println(arrayList4.get(i));
//        }

    }
}
