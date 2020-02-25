package day35;

import java.util.Arrays;

public class CharacterPractice2 {
    public static void main(String[] args) {

        char myChar='7';
        // get int 7

        int myNUm=Integer.parseInt(myChar+"");
        System.out.println("myNUm = " + myNUm);

//        Character.toString(myChar);
    //    String.valueOf(myChar);



        String str="A34B123C4X";
        //        // ADDITIONALLY , GET THE SUM OF THE NUMBERS INSIDE A STRING
        //        // optionally make it a method


        String store="";
        int sum=0;
        char[] charStr= str.toCharArray();
        for (char eachChar : charStr) {
            // checking whether each char is a number or not
            if(Character.isDigit(eachChar)){
                //if it is print out to see

            //then turn it into int  using parseInt method
                //parseInt only accept String
                //so we need to pass String by adding "" to each
                int eachNum = Integer.parseInt(eachChar+"");
                //now we can numerically add the nimber to sum
            sum+=eachNum;

               //store+=eachChar;
            }
        }
        System.out.println("sum = " + sum);












    }
}
