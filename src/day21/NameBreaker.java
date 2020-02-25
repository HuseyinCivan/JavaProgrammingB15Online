package day21;

import day14.StringReview;

public class NameBreaker {
    public static void main(String[] args) {
        String name="Huseyin Civan";

        //if you see letter i -----> get out of loop
//String currentChar="";
        for(int x=0;x<=name.length()-1;x++){
//            currentChar=name.substring(x,x+1);
//
//            if(currentChar.equals("v")){
//                break;
//            }
//            System.out.print(currentChar+" ");

            char currentChar=name.charAt(x);

            if (currentChar=='v'){  //  ( name.substring(x,x+1).equalIgnoreCase("v")  )
                System.out.println("found it");
                break;
            }
            System.out.println(currentChar);


        }


    }
}
