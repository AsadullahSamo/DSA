package LinkedList;

public class VacationWork {

    static class Node{
        String str;
        Node next;

        public Node(){}
        public Node(String str){
            this.str = str;
        }
    }     // end of class Node

    static class Node2{
        String str;
        int val;
        Node2 next;
        public Node2(){}
        public Node2(String str, int val){
            this.str = str;
            this.val = val;
        }
    }       // end of class Node2

    public static void display(Node head){
        for (Node p = head; p!=null; p=p.next){
            System.out.print(p.str+" ");
        }
        System.out.println();
    }     // end of display() method

    public static void display(Node2 head){
        for (Node2 p = head; p!=null; p=p.next){
            System.out.println(p.str+" -> "+p.val+" ");
        }
    }     // end of display() method

    public static Node replace(Node head, String str, String replaceWith){
        for (Node p = head; p!=null; p=p.next){
            if (p.str.equals(str)){
                p.str = p.str.replace(str, replaceWith);
            }
        }
        return head;
    }
    public static int occurences(Node head, String str){
        int occurences = 0;
        for (Node p=head; p!=null; p=p.next){
            if (p.str.equals(str)){
                occurences++;
            }
        }
        return occurences;
    }    // end of occurences() method

    public static void main(String[] args) {

        String str = "I love my University. I have been studying in this university since last 12 months and I have made many friends. The university is providing me a lot of new opportunities to make myself learner and educated in the best way. In future, I will make my university shine on every platform.";
        Node head = new Node("");
        Node p = head;

        int j = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==' '){
                p.next = new Node(str.substring(j, i));
                p = p.next;
                j = i+1;
            }
        }     // end of for loop

        // replace '.' and ',' with ' '
        for (p = head.next; p!=null; p=p.next){
            if (p.str.charAt(p.str.length()-1)=='.' || p.str.charAt(p.str.length()-1)==','){
                p.str = p.str.replace(p.str.charAt(p.str.length()-1), ' ');
            }
        }     // end of for loop
        display(head.next);


        Node2 start = new Node2();
        Node2 q = start;

        for (p=head.next; p!=null; p=p.next){
            int occurences =  occurences(head, p.str);
            q.next = new Node2(p.str, occurences);
            q = q.next;
        }
        display(start.next);


//        Node a = replace(head, "friends", "abc");
//        display(a);

//        display(head);

        // Remove Duplicates
//        for (p = head; p!=null; p=p.next){
//            Node s = p;
//            while (s.next!=null){
//                if (s.next.str.equals(p.str)){
//                    s.next = s.next.next;
//                }
//                s = s.next;
//            }
//        }



    }     // end of main() method
}        //  end of program
