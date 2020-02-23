package day53;


//Only Reference Type Decide what you can access at compile time
// if we have Fruit as reference type , getDigested method will point to the one under Fruit class
//Actual object type decide what method will be called at run time
// since actual object is Apple|Orange , at run time it will call overriden version of the method
// and that's the power of polymorphism , making the correct decision at runtime according to the actual object

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManyFruits {
    public static void main(String[] args) {


        Fruit f1= new Apple("sweet","red","Fuji");
        Fruit f2= new Apple("crispy but tasteless","red hot","Gala");
        Fruit f3= new Orange("sour","orange",12);
        Fruit f4=new Orange("very sweet","Blood Red",10);

        Fruit[] myFruit={f1,f2,f3,f4};

        for (Fruit each : myFruit) {
            each.getDigested();
        }

        //this is noit resizable. adding removing will not work
        //List<Fruit> fruitList= Arrays.asList(f1,f2,f3,f4);
        
        List<Fruit> fruitList = new ArrayList<>(Arrays.asList(f1,f2,f3,f4));

        for (Fruit each : fruitList) {
            System.out.println("each.toString() = " + each.toString());
            System.out.println("class type " + each.getClass().getSimpleName());

        }
        //each.getClass().getSimpleName()
        //in java there is a way to access all the internal stuff inside your class
        //and it is called reflection of api
        //as the name suggest you can see whatever inside any class

        
        
        
        





















    }
}
