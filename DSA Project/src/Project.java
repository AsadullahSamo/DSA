import java.io.*;
import java.sql.*;
import java.util.*;

public class Project {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {


        //     Step 1
        Step1 step1 = new Step1();
        step1.getAllCountriesForYear();

//        step1.getAllCountriesForYear();

        //     Problem 2:     Biggest earthquakes from 2005 to 2015
        Step2 step2 = new Step2();
        step2.getLargestMagnitudeForEachCountry();

        //     Problem 3:     Recent five earthquakes
        Step3 step3 = new Step3();
//        step3.getDetailsOfCountry();

//        int mostVulnerableCountry = step3.mostNumberOfEarthquakes();
//        System.out.println(mostVulnerableCountry);

        //     Problem 4:
//        Step4 step4 = new Step4();
//        step4.getRecentEvent();

    }     // end of main()
}       // end of program