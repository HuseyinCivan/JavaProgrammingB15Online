package day63;

import java.util.*;

public class FindingCharactersShowedUpAtLeastOnce {
    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        // How many unique character showed up in above sentence

        //first find a data structure that automatically remove dublicate ( create a Heshset object with type Character )
        //iterate over each character in above String
        //then add it to the HashSet so it can remove the duplicates for us

        Set<Character> charSet=new HashSet<>();
        //Set<Character> charSet=new LinkedHashSet<>();
        //Set<Character> charSet=new TreeSet<>();


        for (int x = 0; x <str.length() ; x++) {
            charSet.add(str.charAt(x));

        }
        System.out.println("How many characters overall?  " + str.length());

        System.out.println("How many unique characters ? = " + charSet.size());
        System.out.println("charSet = " + charSet);

//        for (Character each : charSet) {
//            System.out.println(each);
//        }







    }
}
