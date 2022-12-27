package Arrays;

class Circle{
    public int radius;
}
class Cylinder extends Circle{
    public int height;
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class Lecture_05_HomeWork_Q1 {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        c1.radius = 4;
        c1.height = 5;
        Cylinder c2 = new Cylinder();
        c2.radius = 6;
        c2.height = 7;
        Cylinder c3 = new Cylinder();
        c3.radius = 8;
        c3.height = 9;

        Circle [] array = {c1, c2, c3};
        for (int i=0; i< array.length; i++){
            System.out.print(array[i].radius+"  ");
        }

        System.out.println("\n"+c1.getClass());
        System.out.println(array.getClass());

    }
}
