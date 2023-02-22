package Recursion;

public class Fibanocci {

    public static long fab(int n){
        if (n<1) return 0;
        if (n<3) return 1;
        return (fab(n-1) + fab(n-2));
    }
    public static long fab2(int n){
        if (n<2) return n;
        long f = 0, f1 = 1, f2 = 1;
        for (int i=2; i<n; i++){
            f = f1;
            f1 = f2;
            f2 = f1 + f;
        }
        return f2;
    }

    public static void main(String[] args) {

//        System.out.println("For fab() method with recursion");
//        for (int i=30; i<40; i++){
//            long time1 = System.currentTimeMillis();
//            long n = fab(i);
//            long time2 = System.currentTimeMillis();
//            System.out.println("Fabonacci "+i+" = "+n+" and time is "+(time2 - time1));
//        }
//
//        System.out.println("For fab2() method without recursion");
//        for (int i=30; i<40; i++){
//            long time1 = System.currentTimeMillis();
//            long n = fab2(i);
//            long time2 = System.currentTimeMillis();
//            System.out.println("Fabonacci "+i+" = "+n+" and time is "+(time2 - time1));
//        }

        System.out.println(fab(7));

    }
}
