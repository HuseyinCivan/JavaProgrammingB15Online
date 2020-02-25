package day44.sub;

import day44.Vehicle;

public class Car extends Vehicle {
    //String make is not inherited because
    //it has default access modifier
    //private int year is not inherited
    
    int milage;

    public static void main(String[] args) {
        
  Car c1=new Car();
  c1.milage=39637;
  c1.make="toyota corolla";



        System.out.println("c1.milage = " + c1.milage);


        c1.setYear(2016);
        System.out.println("c1.getYear() = " + c1.getYear());


    }
    
    
    
}
