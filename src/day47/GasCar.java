package day47;
////create another subclass of car
//        //called GasCar
//        //add a field called gasLevel
//        //implement all the abstract method of Car class
//
//        //create gasCar object here
//        //call all the methods to test
public class GasCar extends Car {
    int gasLevel;

    @Override
    public void start() {
        System.out.println("the gas car is starting");
    }

    @Override
    public void goForward() {
        System.out.println("the gas car is going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("the gas car is going backward");
    }

    @Override
    public void turn(String str) {
        System.out.println("the gas car is turning "+str);
    }

    public static void main(String[] args) {

    }

}
