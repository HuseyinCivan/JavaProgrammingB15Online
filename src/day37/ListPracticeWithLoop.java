package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {

   //create an ArrayList of Integer and fill i tup with 1-100
   //

        List<Integer> nums = new ArrayList<>();
        for (int x = 1; x <100 ; x++) {
            nums.add(x);

        }
        System.out.println("nums = " + nums);

        // change all the odd number value to 0

        for (int x = 0; x <nums.size() ; x+=2) {
            nums.set( x,0    );

            }
        System.out.println("nums = " + nums);

        //how to find index of value 20
        System.out.println("nums.indexOf(20) BEFORE inserting 100 = " + nums.indexOf(20));

        nums.add(0,100);
        System.out.println("nums after inserting 100 = " + nums);

        //how to find index of value 20 AFTER inserting 100
        System.out.println("nums.indexOf(20) AFTER inserting 100 = " + nums.indexOf(20));

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
// insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :
        System.out.println("lst2 = " + lst2);
        lst2.add(lst2.indexOf(34)+1,100);
        System.out.println("lst2 AFTER Adding 100 = " + lst2);

        //add five 100 in front of 44
        //output --->  [100, 100, 100, 100, 100, 44, 14, 34, 100, 41, 19]

        for(int x=0;x<5;x++){
            lst2.add(0,100);

        }
        System.out.println("lst2 = " + lst2);


        









        }








    }

