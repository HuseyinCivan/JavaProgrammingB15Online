package day29;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {

        String hero1="Superman-Clarke Kent";

        // task=
        // hero code is superman and identity is clark kent
        //the initial of the hero is CK

        //  logic 1: split this String by dash -
        // to get 2 pieces of String into a String array



        String[] heroSplitted=hero1.split("-");
        System.out.println("heroSplitted = " + Arrays.toString( heroSplitted));

        String herocode=heroSplitted[0];

        String fullName=heroSplitted[1];

        // hero code is superman identity is clark kent
        System.out.println("Hero Code is "+heroSplitted[0] +" and Identity is " +heroSplitted[1]  );

        // the initial of the hero is CK
        // i can just use full name varivle to finish this task

        // logic:
        //get the first letter of full name
        //then get the first letter after the space
        //concatenate them
        // downside is what if we have middle name
        //solution is looking for the letter after first space
                    //look for last index of space and get next Character

       // logic 2 : we already have full name stored in fullName variable
        //split by space--> we will get firstNmar( middle name) last name
        // then get the last name using last item index
        //get the first character then concatenate
        //clark kent ---> [ Clark, Kent ]   Clark --> C   Kent--->K  -------->CK


        String[] fullNameSplitted=fullName.split(" ");
        System.out.println("fullNameSplitted = " +Arrays.toString( fullNameSplitted));
        // last name will be always the last elenemt of splitted full name
        // no matger the name has middle name or not
        String lastName= fullNameSplitted[fullNameSplitted.length-1];
        System.out.println("lastName = " + lastName);
        System.out.println("Initial of the hero is "+fullName.charAt(0)+lastName.charAt(0));


















    }
}
