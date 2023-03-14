package HashTable;

public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets;      // capacity
    private int size;             //  number of hashnodes in a hashtable

    public HashTable(){
        this(10);         // default capacity
    }
    public HashTable(int cap){
        this.numOfBuckets = cap;
        buckets = new HashNode[cap];
        this.size = 0;
    }     // end of constructor
    private static class HashNode{
        private Integer key;       // can be generic
        private String val;        // can be generic
        private HashNode next;

        public HashNode(Integer key, String val){
            this.key = key;
            this.val = val;
        }      // end of constructor
    }   // end of class HashNode

    public int size(){
        return size;
    }       // end of size()
    public boolean isEmpty(){
        return (size == 0);
    }     // end of isEmpty

    public void put(Integer key, String val){
        if (key == null || val == null){
            throw new IllegalArgumentException("Value or key is null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head!=null){
            if (head.key.equals(key)){
                head.val = val;
                return;
            }
            head = head.next;
        }       // to check if key is already present or not
        size++;
        head = buckets[bucketIndex];       // possibly head may have pointed to any other val during its iteration, so we moved it back to null (start)
        HashNode node = new HashNode(key, val);       // it first points to null
        node.next = head;                           //  we assign it to head
        buckets[bucketIndex] = node;
    }     // end of put()

    public String get(Integer key){
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null){
            if (head.key.equals(key)){
                return head.val;
            }
            head = head.next;
        }     // end of while loop
        return null;
    }      // end of get()

    public String remove(Integer key){
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode prev = null;         // to keep track of prev hashnode
        while (head != null){
            if (head.key.equals(key)){
                break;
            }
            prev = head;
            head = head.next;
        }     // end of while loop
        if (head == null){
            return null;
        }
        size--;
        if (prev != null){
            prev.next = head.next
        } else {
            buckets[bucketIndex] = head.next;
        }
        return head.val;
    }      // end of remove()
    public int getBucketIndex(Integer key){      // out hashFunction to calculate index
        return key % buckets.length;
    }
}     // end of class HashTable
