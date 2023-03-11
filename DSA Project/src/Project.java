import java.io.*;
import java.sql.*;
import java.util.*;

public class Project {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        //      Step 1: Read from file and store in HashMap Array along with key-value pair
//        HashMap<Double, String>[] pairHash = new HashMap[52];
//        for (int i = 0; i < pairHash.length; i++) {
//            pairHash[i] = new HashMap<>();
//        }
//        StringBuilder str = new StringBuilder("");
//        try {
//            File file = new File("E:\\DSA\\DSA Project\\src\\Files\\buffered.txt");
//            FileReader reader = new FileReader(file);
//
//            int character;
//            double key = 0.0;
//            String value = "";
//
//            int i = 0;
//            while ((character = reader.read()) != -1) {
//                char ch = (char) character;
//
//                if (ch == '=') {
//                    if (String.valueOf(str).contains(", ")) {
//                        key = Double.parseDouble(str.substring(3));
//                    } else if (String.valueOf(str).contains("{")) {
//                        key = Double.parseDouble(str.substring(1));
//                    }
//                    str = new StringBuilder("");
//                } else if (ch == ']') {
//                    // we used substring(1) to exclude '='
//                    value = String.valueOf(str.substring(1)).concat("]");
//                    str = new StringBuilder("");
//                    pairHash[i].put(key, value);
//                } else if (ch == '}') {
//                    i++;
//                    str = new StringBuilder("");
//                } else if (ch == '{') {
//                    str = new StringBuilder("");
//                }
//                str = str.append(ch);
//            }
//
//            reader.close();
//        } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        }
//        System.out.println(pairHash[0]);
//
        //      Step 2:  Storing largest magnitude in Queue
        Queue<String> largestMagnitude = new LinkedList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("E:\\DSA\\DSA Project\\src\\Files\\Max Magnitude For Queue.txt"));

            int c;
            StringBuilder line = new StringBuilder();
            while ((c = br.read()) != -1) {
                if (c == '\n') {
                    // End of line reached, So add magnitude and country in Queue
                    largestMagnitude.add(String.valueOf(line));
                    line.setLength(0); // Reset the line buffer for the next line
                } else {
                    // Add the current character to the line buffer
                    line.append((char) c);
                }
            }
        } catch (IOException ie){
            ie.printStackTrace();
        }

        System.out.println(largestMagnitude);
        System.out.println(largestMagnitude.size());
//
//
//
    }     // end of main()
}       // end of program