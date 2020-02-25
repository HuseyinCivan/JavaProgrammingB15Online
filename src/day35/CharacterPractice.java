package day35;

import day32.CharacterAction;

public class CharacterPractice {
    public static void main(String[] args) {

        //character class has lots of static methods
        //to perform action on char valuee
        //isDigit , isLetter, isLetterOrDigit, isUpperCase, isLowerCase
        //toUpperCase, toLowerCase
        System.out.println("is digit method practice");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));



String str="A34B123C4X";
String store="";
// GET THE NUMBERS OUT OF THIS STRING AND STORE IT INTO INTEGER VARIABLE num;
        for (int x = 0; x <str.length() ; x++) {
           // System.out.println("str.charAt ("+x+") =" + str.charAt(x));
            if(Character.isDigit(str.charAt(x))){
                System.out.println("str.charAt ("+x+") =" + str.charAt(x));
store+=str.charAt(x);
}

        }


Integer num=Integer.valueOf(store);
        System.out.println("num = " + num);

        System.out.println("_____________________________________");

        // ADDITIONALLY , GET THE SUM OF THE NUMBERS INSIDE A STRING
        // optionally make it a method




    }
}
