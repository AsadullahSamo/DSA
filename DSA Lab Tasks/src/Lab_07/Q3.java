package Lab_07;

class Node2<K> {
    K val;
    Node2<K> next;

    public Node2(K val) {
        this.val = val;
    }
}
class Generic<S>{


    public int getSize(Node2<S> head){
        int count = 0;
        for (Node2<S> p = head; p!=null; p=p.next){
            count++;
        }
        return count;
    }    // end of class getSize()

    public void display(Node2<S> head){
        for (Node2<S> p = head; p!=null; p=p.next){
            if (p.next==null)
                System.out.print(p.val+" -> null");
            else
                System.out.print(p.val+" -> ");
        }     // end of for loop
        System.out.println();
    }   // end of display() method

    public boolean isEmpty(Node2<S> head){
        int length = getSize(head);
        if (head==null){
            return true;
        } else {
            return false;
        }
    }    // end of isEmpty()

    public Node2<S> insertAtFirst(Node2<S> head, S val){
        Node2<S> node = new Node2<S>(val);
        node.next = head;
        head = node;
        return head;
    }   // end of insertAtFirst()

    public Node2<S> insertAtLast(Node2<S> head, S val){
        Node2<S> node = new Node2<S>(val);
        Node2<S> p = head;
        for (p = head; p.next!=null; p=p.next){

        }   // end of for loop
        p.next = node;
        return head;
    }   // end of insertAtLast()

    public Node2<S> insertAtPosition(Node2<S> head, int pos, S val){
        Node2<S> node = new Node2<S>(val);
        int count = 1;
        Node2<S> p = head;
        for (p = head; p.next!=null; p=p.next){
            if (count==pos-1){
                node.next = p.next;
                p.next = node;
            }
            count++;
        }    // end of for loop
        return head;
    }

    public Node2<S> deleteFirst(Node2<S> head){
        Node2<S> p = head;
        head = p.next;
        return head;
    }   // end of deleteFirst()

    public Node2<S> deleteLast(Node2<S> head){
        Node2<S> p = head;
        for (p = head; p.next.next!=null; p=p.next){

        }
        p.next = null;
        return head;
    }     // end of deleteLast()

    public Node2<S> deleteAtPosition(Node2<S> head, int pos){
        int count = 1;
        Node2<S> p = head;
        for (p = head; p!=null; p=p.next){
            if (pos==count+1){
                p.next = p.next.next;
            }
            count++;
        }
        return head;
    }     // end of deleteAtPosition()

    public void search(Node2<S> head, S target){
        int pos = 1;
        boolean flag = false;
        Node2<S> p;
        for (p = head; p!=null; p=p.next){
            if (p.val==target){
                flag = true;
                break;
            }
            pos++;
        }

        if (flag)
            System.out.println("Value found at position "+pos);
        else
            System.out.println("Value not found");

    }    // end of search()

    public Node2<S> deleteValue(Node2<S> head, S val){
        Node2<S> p;
        for (p = head; p.next!=null; p=p.next){
            if (p.next.val==val){
                p.next = p.next.next;
            }
        }
        return head;
    }
}     // end of class Generic

public class Q3 {

    public static void main(String[] args) {

        Generic<Integer> generic = new Generic<>();

        Node2<Integer> head = new Node2<>(5);
        Node2<Integer> p = head;
        p.next = new Node2<>(6);
        p = p.next;
        p.next = new Node2<>(10);
        p = p.next;

        generic.display(head);

        // isEmpty()
        System.out.println(generic.isEmpty(head));
        // getSize()
        System.out.println("Size is "+generic.getSize(head));

        Node2<Integer> a = generic.insertAtFirst(head, 9);
        generic.display(a);
        head = a;

        Node2<Integer>b = generic.insertAtLast(head, 25);
        generic.display(b);

        Node2<Integer> c = generic.insertAtPosition(head, 3, -1);
        generic.display(c);

        Node2<Integer> d = generic.deleteFirst(head);
        generic.display(d);
        head = d;

        Node2<Integer> e = generic.deleteLast(head);
        generic.display(e);

        Node2<Integer> f = generic.deleteAtPosition(head, 3);
        generic.display(f);

        generic.search(head, -1);
        generic.search(head, -2);

        Node2<Integer> h = generic.deleteValue(head, -1);
        generic.display(h);

    }    // end of main() method
}        // end of program
