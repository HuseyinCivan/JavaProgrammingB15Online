package day56;

/**
 * sometimes we wnat to make a class that only generate single object
 * throughout the entire application
 *
 * this is a design pattern called Singleton
 * it allows ypu to restrict the class to only have one object
 * -- add private static field with same type as class
 * -- add private constructor
 * -- add public method with return type same as class type
 */


public class Singleton {

    private static Singleton instance;


    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        } else {
            System.out.println("we already have this object");
        }
        return instance;
    }

    private Singleton (){
        System.out.println("NO ARG CONSTUCTOR BEING CALLED!!");
    }


}
