//import eu.bitm.NominatimReverseGeocoding.Address;
//import eu.bitm.NominatimReverseGeocoding.NominatimReverseGeocodingJAPI;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.sql.*;
//import java.util.ArrayList;
//
//public class StoreCountryAndCityInFile {
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//
//
//        NominatimReverseGeocodingJAPI nominatim1 = new NominatimReverseGeocodingJAPI();
//        Address address;
//
//        ArrayList<Object>[] arrayList = new ArrayList[53];
//        for (int i = 0; i < arrayList.length; i++) {
//            arrayList[i] = new ArrayList<>();
//        }

//        String url = "jdbc:mysql://localhost:3306/dsa_pbl";       // where last jdbc is Database name in MySQL
//        String uname = "root";
//        String pass = "asad56@mysql.com";
//
//
//        String query = "SELECT * FROM clone_earthquake2 WHERE substr(Date, -2) LIKE '16'";
//
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection com = DriverManager.getConnection(url, uname, pass);
//        Statement st = com.createStatement();
//        ResultSet rs = st.executeQuery(query);

//        try {
//            FileWriter writer = new FileWriter("E:\\DSA\\DSA Project\\src\\Files\\Yearly Earthquake.txt", true);
//            int index = 0, year = 1965;
//            writer.write("\n[");
//            while (rs.next()) {
//                double lat = rs.getDouble("latitude");
//                double lon = rs.getDouble("longitude");
//                double mag = rs.getDouble("magnitude");
//                String date = rs.getString("Date");
//                int y = Integer.parseInt(date.substring(date.length()-2));
//                address = nominatim1.getAdress(lat, lon);
//
////                if (y!=year){
////                    year = y;
////                    writer.flush();
////                    writer.write("\n");
////                    writer.flush();
////                    writer.write(String.valueOf(arrayList[index]));
////                    index++;
////                }
//                String country = address.getCountry();
//                String city = address.getCity();
//                System.out.println(country + ": "+ city + ": " + date+ ": "+mag);
////                arrayList[index].add(country + ": "+ city + ": " + date+ ": "+mag);
//                writer.flush();
//                writer.write(country + ": "+ city + ": " + date+ ": "+mag+", ");
//            }
//            writer.write("]");
//
//            st.close();
//            com.close();
//
//        } catch (IOException | SQLException e) {
//            throw new RuntimeException(e);
//        }    // end of try catch


//    }
//}
