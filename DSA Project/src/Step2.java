import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Step2 {
    public Queue<Object> addCountryWithLargestMagnitude(){

        Queue<Object> largestMagnitude = new LinkedList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("E:\\DSA\\DSA Project\\src\\Files\\Max Magnitude For Queue.txt"));

            int c;
            StringBuilder line = new StringBuilder();
            while ((c = br.read()) != -1) {
                if (c == '\n') {             // End of line reached, So add magnitude and country in Queue
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
        return largestMagnitude;

    }       // end of method

    public void getLargestMagnitudeForEachCountry(){
        Queue<Object> largestMagnitude = addCountryWithLargestMagnitude();
        Object [] array = largestMagnitude.toArray();
        System.out.println(largestMagnitude);
        System.out.println("The size of queue is " + largestMagnitude.size());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to get its largest magnitude and country: ");
        int year = sc.nextInt();
        System.out.println(array[year-1965]);
    }
    public void getLargestMagnitudeForListOfCountries(){
        Queue<Object> largestMagnitude = addCountryWithLargestMagnitude();
        Object [] array = largestMagnitude.toArray();
        Scanner sc = new Scanner(System.in);
        int start, end;

        System.out.print("Enter starting year: ");
        start = sc.nextInt();
        System.out.print("Enter ending year: ");
        end = sc.nextInt();

        System.out.print("[");
        for (int i=start; i<=end; i++){
            if (i==end){
                System.out.print(array[i-1965]);
            } else {
                System.out.print(array[i-1965] + ", ");
            }

        }
        System.out.println("]");
    }     // end of method



}     // end of class Step2
