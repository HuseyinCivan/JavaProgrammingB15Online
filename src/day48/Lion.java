package day48;

import java.util.ArrayList;
import java.util.List;

public class Lion extends Mammals{


    @Override
    public void drinkMilk() {
        System.out.println("lion drink milk ");
    }

    @Override
    public void makeNoise() {
        System.out.println("lion say roarrrrr!!! ");

    }


    public static void main(String[] args) {

        Lion l1=new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        //any class you created, it can be a data type fora variable
        //also known as reference variable
        System.out.println("=======================");

        Animal a1 = new Lion();
        a1.makeNoise();

        List<Integer> lst=new ArrayList<>();


    }
}
