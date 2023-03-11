import eu.bitm.NominatimReverseGeocoding.Address;
import eu.bitm.NominatimReverseGeocoding.NominatimReverseGeocodingJAPI;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Step1 {

    public ArrayList<String>[] getArrayList(){
        ArrayList<String>[] arrayList = new ArrayList[53];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new ArrayList<>();
        }

        int index = 0;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\DSA\\DSA Project\\src\\Files\\Yearly Earthquake.txt"), StandardCharsets.UTF_8));
            String line;
            while ((line = br.readLine())!=null){
                String [] array = line.split(", ");
                if (index==52){
                    break;
                }
                for (int i=0; i< array.length; i++) {
                    arrayList[index].add(array[i]);
                }
                index++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return arrayList;
    }      // end of method

    public void getAllCountriesForYear(){
        ArrayList<String>[] arrayList = getArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year to get all countries with cities and magnitude: ");
        int year = sc.nextInt();
        System.out.println(arrayList[year-1965]);

    }

    public void getEarthquakesForACountry(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String>[] arrayList = getArrayList();

        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the country name: ");
        String con = sc.nextLine();

        System.out.print("[");
        String [] array = arrayList[year - 1965].toArray(new String[0]);

        for (int i=0; i<array.length; i++){
            if (array[i].contains(con))
                System.out.print(array[i]+", ");
        }
        System.out.println("]");

    }       // end of method

    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        ArrayList<String>[] arrayList = new ArrayList[53];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new ArrayList<>();
        }

        int index = 0;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\DSA\\DSA Project\\src\\Files\\Yearly Earthquake.txt"), StandardCharsets.UTF_8));
            String line;
            while ((line = br.readLine())!=null){
                String [] array = line.split(", ");
                if (index==52){
                    break;
                }
                for (int i=0; i< array.length; i++) {
                    arrayList[index].add(array[i]);
                }
                index++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(arrayList[0]);
        System.out.println(arrayList[0].size());
        System.out.println(arrayList[0].get(1));


    }
}