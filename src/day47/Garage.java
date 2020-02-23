package day47;

//////create another subclass of car
////        //called GasCar
////        //add a field called gasLevel
////        //implement all the abstract method of Car class
////
////        //create gasCar object here
////        //call all the methods to test


public class Garage {

    public static void main(String[] args) {
        //abstract class can not be instantiated
        //it means we can not create object out of it

        //Car c1=new Car()


        GasCar c1=new GasCar();
        c1.start();
        c1.goForward();
        c1.goBackward();
        c1.turn("left");


    }




}
