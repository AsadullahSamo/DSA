package Lab_08;

class Generic<S, K>{
    private S first;
    private K second;
    public Generic(S first, K second){
        this.first = first;
        this.second = second;
    }
    public S getFirst(){
        return first;
    }
    public K getSecond(){
        return second;
    }
    public String toString(){
        return (getFirst()+" "+getSecond());
    }
}       // end of class Generic

enum section {SECTION1, SECTION2, SECTION3}


public class GenericClass {
    public static void main(String[] args) {

        Generic<section, String> generic = new Generic<section, String>(section.SECTION1, "21SW100");
        System.out.println(generic);
        System.out.println(generic.getFirst()+" "+generic.getSecond());


    }
}
