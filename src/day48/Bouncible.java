package day48;
//We can achieve abstraction using :
//		abstract class
//		interface
//		both of them are abstract type
//		and can not create object out of it !!!!!

//create an interface called Bouncible
//		it has one constant called
//			gravity as double 	and assign 9.81
//		it has 1 abstract methods :
//			abstract void method bounce();
//create 2 implementing classes of Bouncible
//	Ball
//	instance fields
//		shape as String
//		color as String
//	create constructor to set those 2 fields
//	instance methods
//		implements abstract method from interface
//		toString method
//	Kangaroo
//	instance fields :
//		 name as String
//		 int jumpDistance
//	add constructor to set above two fields
//	instance methods :
//		implements abstract method from interface
//		toString
//		eat()


public interface Bouncible {
    // ALL THE MEMBERS IN INTERFACE MUST BE PUBLIC
    // THIS IS EXCLUSIVE TO INTERFACE TYPE
    // NOWHERE ELSE YOU GET THIS AT ALL!!!!!!!!!!!!!!!!!!!!!!
    // if we don't add any part of public static final for the field
    // all interface fields are automatically public static final
    double GRAVITY = 9.81;

    // public static final double GRAVITY = 9.81;

    // every member of interface automatically public

    // if no access modifier is given
    // all the method with no body automatically public abstract
    void bounce();
   // public abstract void bounce();
}
