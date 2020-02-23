package day47;

// i dont need to create a car object using this class
// i only want this class to be super class to provide
//reusable fields and methods for sub classes
// this class is designed to be a super class
public abstract class Car {

    int year;
    String brand;

    //abstract class can have abstract method
    //it has abstract keyword
    //and it does not have body, DOES NOT HAVE {}
    //it ends with ;
    //IT'S MEANT TO BE OVERRIDDEN TO PROVIDE BODY
    //IN SUB CLASS

    public abstract void start();

    //add abstract methods
    //goForward
    //goBackward

    public abstract void goForward();

    public abstract void goBackward();

    public abstract void turn(String str);






}
