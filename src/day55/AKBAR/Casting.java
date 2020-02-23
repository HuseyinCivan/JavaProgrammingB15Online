package day55.AKBAR;

public class Casting {

    public static void main(String[] args) {


//        int x = 10;
//
//        long y = x; // it works implicitly | automatically
//
////        byte b = x ;
//
//        byte b = (byte) x; // need to be casted explicitly
//        // polymorphism
        Object o = new Dog("Chiwava"); // this is upcasting from type Dog to Object
      //  o.bark();
        //=> object does not have bark method!! object does not bark; dog barks
        // what if i wanna let the dog bark???????????
        //you can create new object with Dog reference type normally BUT;
        //IN ORDER TO CREATING NEW OBJECT YOU WANNA USE SAME OBJECT AND YOU WANT THE POWER OF POLYMORPHISM
        //AND YOU WANT TO REACH BARK METHOD

        //IN ORDER TO LET THE DOG BARK WE NEED TO REFER DOG AS DOG AND
        //AND WE CAN DOWNCAST TO LET THE DOG BARK WITH HAVING STILL SUPER TYPE RELATION
        //Dog d = o; => does not compile big cup into small cup!! need to cast!
        //Dog d =  new Dog("ashjgdashjdgahjsgdahjsg") ;  //this is new object

        Dog d = (Dog) o; // this is downcasting from type Object to Dog
        d.bark();

        // Creating object with Object reference
//        Object o2 = new Object();
        // compile fine because Dog IS-A Object , BUT CLASS CAST EXCEPTION AT RUNTIME
        // Because d2 = new Object() will NOT WORK!!!
//        Dog d2 = (Dog) o2;  //new Object();
//        Dog d3= (Dog) new Object();
 //       d2.bark();

        // WHEN DOES CLASS CAST EXCEPTION HAPPEN
        // When we try to cast super type object to subtype
        // or when the object type IS-NOT-A your casted reference type

        // Shape s1 = new Circle();
        // Square s2 = (Square ) s1 // this will compile fine , but will throw CassCastException
        // because we can't do Square s2 = new Circle() ; CIRCLE IS NOT A SQUARE

    }

}