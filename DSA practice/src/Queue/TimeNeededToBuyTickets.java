package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededToBuyTickets {

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0; i<tickets.length; i++){
            arrayList.add(tickets[i]);
        }
        while (arrayList.get(k)!=0){
            for (int i=0; i<arrayList.size(); i++) {
                if (arrayList.get(i) != 0){
                    arrayList.set(i, arrayList.get(i) - 1);
                    time++;
                }
            }
        }

        System.out.println(arrayList);
        return time;
    }       // end of timeRequiredToBuy

    public static void main(String[] args) {

        int [] array1 = {5, 1, 1, 1};
        System.out.println(timeRequiredToBuy(array1, 0));
    }
}
