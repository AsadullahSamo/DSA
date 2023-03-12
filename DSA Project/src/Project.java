import java.io.*;
import java.sql.*;
import java.util.*;

public class Project {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {


        //     Step 01:  Store county, city and magnitude for each year
        Step1 step1 = new Step1();
        // step1.getAllCountriesForYear();


        //     Step 02:     Biggest earthquakes from 1965 to 2016
        Step2 step2 = new Step2();
//        step2.getLargestMagnitudeForEachCountry();


        //     Step 03:  All events of a particular country from 1965 to 2015 (recent on top)
        Step3 step3 = new Step3();
//        step3.getDetailsOfCountry();


        //     Step 04:  Store recent event from each country
        Step4 step4 = new Step4();
//        step4.getRecentEventForEachCountry();


        // Problem 01: Average number of earthquakes and most vulnerable countries
//        step1.getEarthquakesForACountry();        // Average number of earthquakes for a country
//        System.out.println("with earthquakes " + step3.mostNumberOfEarthquakes());


        // Problem 2:    Biggest earthquakes from 2005 to 2015
//        step2.getLargestMagnitudeForListOfCountries();


        // Problem 3:    Recent n earthquakes for a given country
//        step3.getNRecentEarthqakesForEachCountry();


        // Problem 04:  Recent earthquakes for a particular magnitude
        step4.getEarthquakesForParticularMagnitudeRange();


    }     // end of main()
}       // end of program