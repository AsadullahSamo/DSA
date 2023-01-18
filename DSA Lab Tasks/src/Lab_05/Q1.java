package Lab_05;


class Rectangle{

    public float length = 1, width= 1;

    public float perimeter(){
        return 2 * (this.length + this.width);
    }

    public float area(){
        return (this.length * this.width);
    }

    public void setLength(float length) {
        if (length>0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Please enter length between 0 and 20");
        }
    }

    public float getLength() {
        return this.length;
    }

    public void setWidth(float width) {
        if (width>0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Please enter width between 0 and 20");
        }
    }

    public float getWidth() {
        return this.width;
    }

}    //  end of class Rectangle

public class Q1 {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.setLength(5.7f);
        System.out.println("Length of rectangle is: "+rectangle.getLength());
        rectangle.setWidth(6.3f);
        System.out.println("Length of rectangle is: "+rectangle.getWidth());
        System.out.println("Area of rectangle is: "+rectangle.area());
        System.out.println("Perimeter of rectangle is: "+rectangle.perimeter());

    }    // end of main() method
}       //  end of program
