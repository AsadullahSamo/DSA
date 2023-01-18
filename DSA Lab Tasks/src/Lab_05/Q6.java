package Lab_05;

class Vehicle{

    int year, speed;
    String manufacturer;

    public void accelerate(){
        this.speed += 5;
    }

    public void brake(){
        this.speed -= 5;
    }

    public int getSpeed() {
        return speed;
    }

}  // end of class Vehicle

public class Q6 {
    public static void main(String[] args) {

        Vehicle rickshaw = new Vehicle();
        Vehicle bike = new Vehicle();

        rickshaw.accelerate();
        System.out.println("Rickshaw speed: "+rickshaw.getSpeed());
        rickshaw.accelerate();
        System.out.println("Rickshaw speed: "+rickshaw.getSpeed());
        rickshaw.accelerate();
        System.out.println("Rickshaw speed: "+rickshaw.getSpeed());
        rickshaw.accelerate();
        System.out.println("Rickshaw speed: "+rickshaw.getSpeed());
        rickshaw.accelerate();
        System.out.println("Rickshaw speed: "+rickshaw.getSpeed());

        rickshaw.brake();
        System.out.println("Rickshaw speed: "+rickshaw.getSpeed());
        rickshaw.brake();
        System.out.println("Rickshaw speed: "+rickshaw.getSpeed());

        System.out.println();

        bike.accelerate();
        System.out.println("Bike speed: "+bike.getSpeed());
        bike.accelerate();
        System.out.println("Bike speed: "+bike.getSpeed());
        bike.accelerate();
        System.out.println("Bike speed: "+bike.getSpeed());
        bike.accelerate();
        System.out.println("Bike speed: "+bike.getSpeed());
        bike.accelerate();
        System.out.println("Bike speed: "+bike.getSpeed());

        bike.brake();
        System.out.println("Bike speed: "+bike.getSpeed());
        bike.brake();
        System.out.println("Bike speed: "+bike.getSpeed());
    }   // end of main() method
}      //  end of program
