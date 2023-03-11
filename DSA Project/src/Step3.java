import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class Step3{
    public int index(String country){
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
        }
        return -1;
    }
    public Stack<Object>[] getStack() throws SQLException, ClassNotFoundException, IOException {
        String url = "jdbc:mysql://localhost:3306/dsa_pbl";       // where last jdbc is Database name in MySQL
        String uname = "root";
        String pass = "asad56@mysql.com";

        Class.forName("com.mysql.cj.jdbc.Driver");
        String query = "SELECT * FROM temp2 WHERE country = 'United States' \n" +
                       "ORDER BY substr(Date, 7,4), substr(Date, 1,2);";
        Connection com = DriverManager.getConnection(url, uname, pass);
        Statement st = com.createStatement();
        ResultSet rs = st.executeQuery(query);


        Stack<Object>[] stack = new Stack[110];
        for (int i=0; i<stack.length; i++){
            stack[i] = new Stack<>();
        }

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
        int index = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\DSA\\DSA Project\\src\\Files\\Stack.txt"), StandardCharsets.UTF_8));

            String line;
            while ((line = br.readLine()) != null) {         // Read entire line
                String[] details = line.split(",");   // split the line by commas and store entire string to array after , is encountered
                for (int i=0; i<details.length; i++) {
                    stack[index].push(details[i]);
                }
                index++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // end of while loop

        return stack;

    }   // end of method getCountry()

    public void getDetailsOfCountry() throws SQLException, ClassNotFoundException, IOException {

        Stack<Object>[] stack = getStack();
        System.out.println(stack.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of country to get its details: ");
        String con =  sc.nextLine();

        int i = index(con);
        while (i==-1) {
            if (i == -1) {
                System.out.println("Please enter valid country name: ");
            }
            System.out.println("Enter the name of country to get its details: ");
            con =  sc.nextLine();
            i = index(con);
        }
        System.out.println(stack[i]);
    }

    public void getNRecentEarthqakesForEachCountry() throws SQLException, IOException, ClassNotFoundException {
        Stack<Object>[] stack = getStack();
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the name of country you want to get earthquakes of: ");
        String country = sc.nextLine();
        System.out.println("How many recent earthquakes you want to get? ");
        int recentN = sc.nextInt();
        int index = index(country);

        Object[] array = stack[index].toArray();
        int num = array.length - recentN;

        System.out.println("Recent "+recentN+" earthquakes are ");
        System.out.print("[");
        for (int i=num; i<array.length; i++){
            if (i==array.length-1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println("]");

    }
    public int mostNumberOfEarthquakes() throws SQLException, IOException, ClassNotFoundException {
        Stack<Object>[] stack = getStack();
        int max = stack[0].size();
        for (int i=1; i<stack.length; i++){
            if (stack[i].size() > max){
                max = stack[i].size();
            }
        }

        return max;
    }


}       // end of class

