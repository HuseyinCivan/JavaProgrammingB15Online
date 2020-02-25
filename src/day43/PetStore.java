package day43;

//Create another class called PetStore with main method
//	Create 8 Pet objects with initial value
//	Store them into a List<Pet>
//	1, print out all info
//	2, print out only name
//	3, print out only cats

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetStore {
    public static void main(String[] args) {

        Pet p1=new Pet("cat","catty");
        p1.speak();
        Pet p2=new Pet("dog","doggy");
        p2.speak();
        Pet p3=new Pet("cow","cowwy");
        p3.speak();
        Pet p4=new Pet("horse","horsy");
        Pet p5=new Pet("bird","birdy");
        p5.speak();
        Pet p6=new Pet();
        Pet p7=new Pet("cat","catCaty");
        Pet p8=new Pet("spider","spiky");

          List<Pet> myPets= Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);  // can not changeable !!
//        List<Pet> myPets=new ArrayList<>();
//        myPets.add(p1);
//        myPets.add(p2);
//        myPets.add(p3);
//        myPets.add(p4);
//        myPets.add(p5);
//        myPets.add(p6);
//        myPets.add(p7);
//        myPets.add(p8);

        System.out.println("myPets = " + myPets);

        System.out.println("==========================");

        for (int x = 0; x <myPets.size() ; x++) {
            System.out.println("Pets Name = " + myPets.get(x).getName());

        }

        System.out.println("==========================");

        for (int x = 0; x <myPets.size() ; x++) {

            if(myPets.get(x).getType().equalsIgnoreCase("cat")){
                System.out.println("just my cats ) = " + myPets.get(x));
            }

        }


















    }
}
