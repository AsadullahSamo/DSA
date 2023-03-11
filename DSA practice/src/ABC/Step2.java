//package ABC;
//
//import ABC.Earthquake;
//import ABC.Store;
//
//import java.util.*;
//
//public class Step2 {
//
//    HashMap<Integer, List<Earthquake>>[] yearlyEQS = Store.yearlyEQs;
//
//    public void biggestMagnitudeEarthquake(){
//        Queue<Earthquake>[] earthquakeQueue = new Queue[52];
//        int years = 1965;
//
//        for (int i = 0; i < earthquakeQueue.length; i++) {
//            earthquakeQueue[i] = new PriorityQueue<>();
//        }
//
//        for (int i = 0; i < yearlyEQS.length; i++) {
//
//            double maxMag = 0;
//            Earthquake maxEQ = null;
//
//            HashMap<Integer, List<Earthquake>> yearMap = yearlyEQS[i];
//            List<Earthquake> eqList = yearMap.get(years);
//
//            //System.out.println("Year " + years + ": " + eqList.size() + " earthquakes");
//            Collections.sort(eqList);
//
//            for (Earthquake eq : eqList) {
//                if (eq.getMagnitude() > maxMag) {
//                    maxMag = eq.getMagnitude();
//                    maxEQ = eq;
//                }
//            }
//
//            earthquakeQueue[i].offer(maxEQ); //offer is used to insert earthquake wherever possible otherwise return false
//            years++;
//        }
//
//       /*
//       System.out.println(earthquakeQueue[0].size());
//        for (int i = 0; i < earthquakeQueue.length; i++) {
//            System.out.print(earthquakeQueue[i].size()+"  ");
//        }
//
//        */
//
//        for (int i = 0; i < earthquakeQueue.length; i++) {
//            Earthquake e = earthquakeQueue[i].peek();
//            if (e != null) {
//                System.out.println(e.getMagnitude()+" "+e.getYear());
//            }
//
//        }
//    }
//}