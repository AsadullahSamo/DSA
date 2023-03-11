//import eu.bitm.NominatimReverseGeocoding.Address;
//import eu.bitm.NominatimReverseGeocoding.NominatimReverseGeocodingJAPI;
//
//import java.io.*;
//import java.sql.*;
//import java.util.*;
//
//public class Project {
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//
//        NominatimReverseGeocodingJAPI nominatim1 = new NominatimReverseGeocodingJAPI();
//        Address address;
//
//        String url = "jdbc:mysql://localhost:3306/dsa_pbl";       // where last jdbc is Database name in MySQL
//        String uname = "root";
//        String pass = "asad56@mysql.com";
//
//
//        String query = "SELECT date FROM clone_earthquake2";
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection com = DriverManager.getConnection(url, uname, pass);
//        Statement st = com.createStatement();
//        ResultSet rs = st.executeQuery(query);
//
//        HashMap<Double, ArrayList<String>>[] year = new HashMap[52];
//        for (int i=0; i<52; i++){
//            year[i] = new HashMap<>();
//        }
//
//
//        ArrayList<String> dates = new ArrayList<>();
//        int j = 0;
//        while(rs.next()) {
//            String date = rs.getString("Date");
//            date = date.substring(date.length() - 2);
//            dates.add(date);
//        }
//
//        int l = 0;
//        query = "SELECT latitude, longitude, magnitude FROM clone_earthquake2";
//        rs = st.executeQuery(query);
//        String country = "", city = "";
//        while(rs.next()) {
//            double lat = rs.getDouble("latitude");
//            double lon = rs.getDouble("longitude");
//            double magnitude = rs.getDouble("Magnitude");
////            int colNum = rs.getInt("col_num");
//            address = nominatim1.getAdress(lat, lon);
//
//            if(address!=null) {
//                country = address.getCountry();
//                city = address.getCity();
//            }
//
//            if (l<1103) {
//                if (!dates.get(l).equals(dates.get(l + 1))) {
//                    j++;
////                  System.out.println("j is "+j+ " and l is "+l);
//                }
//            }
//            l++;
//            year[j].computeIfAbsent(magnitude, k -> new ArrayList<>()).add(country.concat(": "+city));     // k -> new ArrayList<> is mapping function as specified in documentation
//        }     // end of while loop
//        st.close();
//        com.close();
//
////        System.out.println(year[0]);
////        System.out.println("Size is "+year[0].size());
//        System.out.println(year[2].get(5.8));
////        System.out.println(dates);
//
////        try {
////            FileOutputStream fos = new FileOutputStream("E:\\DSA\\DSA Project\\src\\hashmap.txt");
////            ObjectOutputStream oos = new ObjectOutputStream(fos);
////            for (int i=0; i< year.length; i++) {
////                oos.writeObject(year[i]);
////            }
////            oos.close();
////            fos.close();
////            System.out.println("HashMap saved to hashmap.ser file.");
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//
//
////        try {
////            FileInputStream fos = new FileInputStream("E:\\DSA\\DSA Project\\src\\hashmap.txt");
////            ObjectInputStream oos = new ObjectInputStream(fos);
////            for (int i=0; i< year.length; i++) {
////                System.out.println(oos.readObject());
////            }
////            oos.close();
////            fos.close();
//////            System.out.println("HashMap saved to hashmap.ser file.");
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//
//    }   // end of main()
//}     // end of program
