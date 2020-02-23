package day47;

public class ElectricCar extends Car {

    int batteryLevel;


    @Override
    public void start() {
        System.out.println("This is how electric car start ");
    }

    @Override
    public void goForward() {
        System.out.println("the electric car is going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("the electric car is going backward");

    }

    @Override
    public void turn(String direction) {
        System.out.println("the electric car is turning to "+direction);
    }

    public static void main(String[] args) {


    //Car C1=new Car();
    ElectricCar e1=new ElectricCar();
    e1.start();
    e1.goForward();
    e1.goBackward();
    e1.turn("right");

        System.out.println(e1.batteryLevel);
        System.out.println(e1.brand);
        System.out.println(e1.year);



    }
}
