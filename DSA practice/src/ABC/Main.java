package ABC;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static ABC.Store.yearlyEQS;

public class Main {
    public static void main(String[] args) throws IOException {

        Store store = new Store();
//        store.storing();

        try {
            File file = new File("E:\\DSA\\DSA Project\\src\\Files\\temp.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
            int character;

            String city = "", country = "";
            int year = 1965;
            String magnitude = "";

            StringBuilder str = new StringBuilder("");
            int y = 1965, L = 0;

            HashMap<Double, ArrayList<Object>>[] yearlyEQS = new HashMap[52];
            ArrayList<Object>[] list = new ArrayList[52];
            list[0] = new ArrayList<>();
            for (int j = 0; j < yearlyEQS.length; j++) {
                yearlyEQS[j] = new HashMap<>();
            }


            int i = 0, j = 0;
            char ch = 0;
            while ((character = reader.read()) != -1) {
                ch = (char) character;
                if (ch == ','){
                    System.out.println("Num is "+str);
                    year = Integer.parseInt(str.substring(0, 4));
                    str = new StringBuilder("");
                } else if(ch == '=') {
                    int equalsIndex = str.indexOf("=");
                    magnitude = str.substring(equalsIndex+1, str.length()-1);
                    str = new StringBuilder("");
                } else if (ch == '\n'){
                    System.out.println("Line is "+str);
                    list[i].add(str.substring(0, str.length()-1));
                    i++;
                    str = new StringBuilder("");
                }
                if (year != y){
                    j++;
                    y = year;
                }
                str.append(ch);
//                System.out.println("Str is "+str);
            }

        }
         catch (IOException ie) {
            ie.printStackTrace();
        }   // end of try catch

//        System.out.println(yearlyEQS[0]);
        System.out.println("Size is "+yearlyEQS[0].size());


    }
}
