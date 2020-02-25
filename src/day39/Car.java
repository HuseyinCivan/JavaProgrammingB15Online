package day39;

public class Car {
//Akbar 4:36 PM
//Create a Car Object template by creating a Car class
//	it  has these attributes
//		year , model , make , color
//Create few object out of it with field value set (edited)
    int year;
    String model;
    String make;
    String color;

//instance methods ae ties to the object
    // it does not have static keyword
    //we need an object when we call them
public void goForward(){
    System.out.println("Going forward");
}

public void printCarAge(){
    System.out.println("car age : "+(2020-year));
}
public void changeColorTo(String newColor){
    //write bunch of code here to validate
    //user is actually passing correct color
    //for example Red Blue is valid color
    //            ABC, EFG is not valid color
    color=newColor;
}

}
