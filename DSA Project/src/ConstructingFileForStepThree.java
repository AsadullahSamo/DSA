import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class ConstructingFileForStepThree {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {


        String url = "jdbc:mysql://localhost:3306/dsa_pbl";       // where last jdbc is Database name in MySQL
        String uname = "root";
        String pass = "asad56@mysql.com";

        Class.forName("com.mysql.cj.jdbc.Driver");
        String query = "";
        Connection com = DriverManager.getConnection(url, uname, pass);
        Statement st = com.createStatement();
        ResultSet rs = st.executeQuery(query);


        String [] countries = {"United States", "中国", "Indonesia", "ایران", "Philippines", "Chile", "Vanuatu", "臺灣", "Papua Niugini", "Ελλάς", "Argentina", "नेपाल", "日本", "México", "República Dominicana", "Solomon Islands", "South Georgia and the South Sandwich Islands", "Colombia", "Perú", "Antigua and Barbuda", "Zambia", "Guatemala", "မြန်မာ", "République démocratique du Congo", "New Zealand/Aotearoa", "Venezuela", "Монгол улс ᠮᠤᠩᠭᠤᠯ ᠤᠯᠤᠰ", "Bolivia", "Россия", "Türkiye", "Тоҷикистон", "France", "Brasil", "India", "Ecuador", "Tonga", "Viti", "Australia", "Panamá", "Belau", "Canada", "Ísland", "افغانستان", "پاکستان", "འབྲུགཡུལ་", "Costa Rica", "Nicaragua", "British Indian Ocean Territory", "Shqipëria", "ኢትዮጵያ", "مصر", "Italia", "South Africa", "El Salvador", "Bosna i Hercegovina / Босна и Херцеговина", "Кыргызстан", "Oʻzbekiston", "Djibouti جيبوتي", "Қазақстан", "România", "ประเทศไทย", "Madagasikara / Madagascar", "Gabon", "Norge", "Cuba", "España", "Tanzania", "België / Belgique / Belgien", "Malaysia", "Србија", "Crna Gora / Црна Гора", "ኤርትራ Eritrea إرتريا", "Algérie / ⵍⵣⵣⴰⵢⴻⵔ / الجزائر", "Việt Nam", "ປະເທດລາວ", "Polska", "Honduras", "العراق", "Türkmenistan", "Saint Kitts and Nevis", "Guinée", "اليمن", "საქართველო", "বাংলাদেশ", "Kalaallit Nunaat", "Malawi", "Portugal", "Kenya", "South Sudan", "Micronesia", "България", "Uganda", "Hrvatska", "Maroc / ⵍⵎⵖⵔⵉⴱ / المغرب", "Jamaica", "السودان", "Trinidad and Tobago", "Հայաստան", "Северна Македонија", "Paraguay / Paraguái", "Κύπρος - Kıbrıs", "السعودية", "Dominica", "Azərbaycan", "سوريا", "Soomaaliya الصومال", "Slovenija", "Kosova / Kosovo", "Moçambique", "Ayiti"};
        FileWriter writer = new FileWriter("E:\\DSA\\DSA Project\\src\\Files\\Stack.txt", true);

    }
}
