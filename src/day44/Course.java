package day44;

public class Course {

    String name;
    String type;

    static int counter;

    public Course(String name, String type) {
        this.name = name;
        this.type = type;
        counter++;

        //you can access static field
        //in constructor , instance method, static methods
    }
}
//String name;
//String type;
////STATIC = permanent variable (until changed)
//// INSTANCE = object specific variable
//static int counter;
////its default value is 0
////if i remove static from here;
////ever object will get their own counter
//public Course(String name, String type) {
//    this.name = name;
//    this.type = type;
//    //you can access static field
//    //in constructor, instance method , static methods
//    //every time object is being created i want to increment the counter
//    counter++;
//    //we did not see the counter when we debugging
//    //because counter is not belongs to object
//    //it is belongs to class
//    //how do i get static:
//    //created a blueprint for a house, house have color style
//    //what is each and every house shared??
//    //street sign for example
//    //neighborhood name called Cybertek avenue
//    //changing this name would it affect each and every house??
//    //YES
//    //and that is exactly what static is!!!
//    //one person changes their house's number
//    //does it affect other houses??
//    //NO
//    //this is exactly instance
//}
