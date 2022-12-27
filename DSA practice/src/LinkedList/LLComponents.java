package LinkedList;

public class LLComponents {

    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }     // end of class Node

    public static void display(Node head){
        for (Node p = head; p!=null; p=p.next){
            System.out.print(p.val+"  ");
        }
        System.out.println();
    }      // end of display() method

    public static int numComponents(Node head, int[] nums) {

        int counter = 0;
        int i = 0, j = 1;
        Node p = head, q;
        int length = nums.length;

        if (length==1){
            i = nums[0];
            while (p!=null){
                if (p.val==nums[i]){
                    counter++;
                    return counter;
                }
                p = p.next;
            }
            return counter;
        }
        if (length%2==0) {
            while (i < nums.length && j < nums.length && p != null) {
                q = p;
                if (p.val == nums[i]) {
                    while (q != null) {
                        if (q.val == nums[j]) {
                            counter++;
                            break;
                        }
                        q = q.next;
                    }
                }
                if (p.val == nums[i]) {
                    counter++;
                    break;
                }
                i += 2;
                j += 2;
                p = p.next;
            }
        } else {
            while (i < nums.length && p != null) {
                q = p;
                if (p.val == nums[i]) {
                    while (q != null) {
                        if (q.val == nums[j]) {
                            counter++;
                            break;
                        }
                        q = q.next;
                    }
                }
                if (i==length-1) {
                    q = p;
                    while (q != null) {
                        if (q.val == nums[i]) {
                            counter++;
                            return counter;
                        }
                        q = q.next;
                    }
                }
                i += 2;
                j += 2;
                p = p.next;
            }
        }
        return counter;

    }     // end of numComponents() method

    public static void main(String[] args) {

        int [] array = {0};
        Node head = new Node(0);
        Node p = head;
//        for (int i=1; i<=4; i++){
//            p.next = new Node(i);
//            p = p.next;
//        }
        display(head);
        System.out.println(numComponents(head, array));

    }        // end of main() method
}           //  end of program
