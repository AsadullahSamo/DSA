package Lab_07;

class Node3{     //Node3 Class
    String location;
    Node3 next;

    Node3(String location){     //Node3 class Constructor
        this.location = location;
    }
    public void display(Node3 head){
        for (Node3 p=head; p!=null; p=p.next){
            if (p.next==null)
                System.out.print(p.location);
            else
               System.out.print(p.location+" -> ");
        }
        System.out.println();
    }   // end of display()
}


public class Q2 {
    public static void main(String[] args) {


        System.out.println();

        String [] route1 = {"Tando Allahyar", "Fazal Muhammad Talpur Stop", "Nasarpur", "Sugar Mill", "Stop" ,"Matiari"};
        String [] route2 = {"Tando Allahyar", "Tando Jam", "Channel", "Hala Naka", "Matiari"};

        int estimatedTime1 = 50;
        int estimatedTime2 = 70;

        int distance1 = 40;
        int distance2 = 50;

        Node3 R1 = new Node3(route1[0]);
        Node3 p = R1;
        for (int i=1; i<route1.length; i++){
            p.next = new Node3(route1[i]);
            p = p.next;
        }

        Node3 R2 = new Node3(route2[0]);
        Node3 q = R2;
        for (int i=1; i<route2.length; i++){
            q.next = new Node3(route2[i]);
            q = q.next;
        }

        System.out.println("Route No.1:   Estimated Distance: "+distance1+" km       Estimated Time: "+estimatedTime1+" mins");
        R1.display(R1);
        System.out.println("Arrived At Destination");

        System.out.println();

        System.out.println("Route No.2:   Estimated Distance: "+distance2+" km       Estimated Time: "+estimatedTime2+" mins");
        R1.display(R2);
        System.out.println("Arrived At Destination");
        System.out.println();


        if (estimatedTime1<estimatedTime2){
            System.out.println("Route No.1 is shortest");
        } else {
            System.out.println("Route No.2 is shortest");
        }

    }
}
