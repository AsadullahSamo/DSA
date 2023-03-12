import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.Scanner;
import java.util.Stack;

class Step3{
    // Find index of given country
    public int getIndex(String country){
        String [] countries = {"United States", "中国", "Indonesia", "ایران", "Philippines", "Chile", "Vanuatu",
                "臺灣", "Papua Niugini", "Ελλάς", "Argentina", "नेपाल", "日本", "México", "República Dominicana",
                "Solomon Islands", "South Georgia and the South Sandwich Islands", "Colombia", "Perú",
                "Antigua and Barbuda", "Zambia", "Guatemala", "မြန်မာ", "République démocratique du Congo",
                "New Zealand/Aotearoa", "Venezuela", "Монгол улс ᠮᠤᠩᠭᠤᠯ ᠤᠯᠤᠰ", "Bolivia", "Россия",
                "Türkiye", "Тоҷикистон", "France", "Brasil", "India", "Ecuador", "Tonga", "Viti", "Australia",
                "Panamá", "Belau", "Canada", "Ísland", "افغانستان", "پاکستان", "འབྲུགཡུལ་", "Costa Rica",
                "Nicaragua", "British Indian Ocean Territory", "Shqipëria", "ኢትዮጵያ", "مصر", "Italia",
                "South Africa", "El Salvador", "Bosna i Hercegovina / Босна и Херцеговина", "Кыргызстан",
                "Oʻzbekiston", "Djibouti جيبوتي", "Қазақстан", "România", "ประเทศไทย", "Madagasikara / Madagascar",
                "Gabon", "Norge", "Cuba", "España", "Tanzania", "België / Belgique / Belgien", "Malaysia", "Србија",
                "Crna Gora / Црна Гора", "ኤርትራ Eritrea إرتريا", "Algérie / ⵍⵣⵣⴰⵢⴻⵔ / الجزائر", "Việt Nam",
                "ປະເທດລາວ", "Polska", "Honduras", "العراق", "Türkmenistan",
                "Saint Kitts and Nevis", "Guinée", "اليمن", "საქართველო", "বাংলাদেশ",
                "Kalaallit Nunaat", "Malawi", "Portugal", "Kenya", "South Sudan", "Micronesia",
                "България", "Uganda", "Hrvatska", "Maroc / ⵍⵎⵖⵔⵉⴱ / المغرب", "Jamaica", "السودان",
                "Trinidad and Tobago", "Հայաստան", "Северна Македонија", "Paraguay / Paraguái", "Κύπρος - Kıbrıs",
                "السعودية", "Dominica", "Azərbaycan", "سوريا", "Soomaaliya الصومال", "Slovenija", "Kosova / Kosovo",
                "Moçambique", "Ayiti", ""};

        for (int i=0; i<countries.length; i++){
            if (countries[i].equals(country)){
                return i;
            }
        }     // end of for loop
        return -1;
    }      // end of index() method
    public Stack<Object>[] getStack() throws SQLException, ClassNotFoundException, IOException {

        Stack<Object>[] stack = new Stack[110];     // As there are 110 countries, so stack has 110 objects, one for each country
        for (int i=0; i<stack.length; i++){
            stack[i] = new Stack<>();             // initialize all 110 objects
        }

        int index = 0;
        try {
            // Read from "Stack.txt" from respective location
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\DSA\\DSA Project\\src\\Files\\Stack.txt"), StandardCharsets.UTF_8));

            String line;
            while ((line = br.readLine()) != null) {         // Read entire line
                String[] details = line.split(",");   // split the line by commas and store entire string to array after , is encountered
                for (int i=0; i<details.length; i++) {
                    stack[index].push(details[i]);       // Put entire details array index by index to object of stack
                }
                index++;                               // now storing occurs in next stack object
            }   // end of while loop
        } catch (IOException e) {
            throw new RuntimeException(e);
        }      // end of try catch block

        return stack;
    }   // end of method getStack()

    public void getDetailsOfCountry() throws SQLException, ClassNotFoundException, IOException {

        Stack<Object>[] stack = getStack();
//        System.out.println(stack.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of country to get its details: ");
        String con =  sc.nextLine();

        int i = getIndex(con);
        while (i==-1) {      // loop till valid country is provided
            if (i == -1) {
                System.out.println("Please enter valid country name: ");
            }
            System.out.println("Enter the name of country to get its details: ");
            con =  sc.nextLine();
            i = getIndex(con);
        }
        System.out.println(stack[i]);         // Print details of country with magnitude from 1965 to 2016 (recent event on top)
    }       // end of getDetailsOfCountry() method

    // Get n recent earthquakes through below method for particular country
    public void getNRecentEarthqakesForEachCountry() throws SQLException, IOException, ClassNotFoundException {
        Stack<Object>[] stack = getStack();
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the name of country you want to get earthquakes of: ");
        String country = sc.nextLine();
        System.out.println("How many recent earthquakes you want to get? ");
        int recentN = sc.nextInt();
        int index = getIndex(country);

        Object[] array = stack[index].toArray();      // convert that entire stack object to array to apply index accessing operations
        int num = array.length - recentN;             //  used as starting index for loop

        System.out.println("Recent "+recentN+" earthquakes are ");
        System.out.print("[");
        for (int i=num; i<array.length; i++){
//            if (i==array.length-1)
//                System.out.print(array[i]);
//            else
//                System.out.print(array[i] + ", ");
            System.out.println(array[i]);
        }    // end of for loop
        System.out.println("]");

    }        // end of getNRecentEarthquakesForEachCountry() method

//    Stack object with most size will be most vulnerable to earthquakes
    public int mostNumberOfEarthquakes() throws SQLException, IOException, ClassNotFoundException {
        Stack<Object>[] stack = getStack();
        int max = stack[0].size();
        String str = "";
        for (int i=1; i<stack.length; i++){
            if (stack[i].size() > max){
                max = stack[i].size();                // if any object's size is  greater that first object's size, assign max to this object
                str = (String) stack[i].peek();       // get top of stack
                str = str.substring(0, str.indexOf(":"));     // get country from str, which is found when : is encountered (For more help refer to Stack.txt)
            }
        }    // end of for loop
        System.out.println("Most vulnerable country is "+str);
        return max;
    }       // end of mostNumberOfEarthquakes() method

}       // end of class Step3

