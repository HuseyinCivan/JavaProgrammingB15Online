package day63.review;

import java.util.*;

public class FindingCharactersShowedUpAtLeastOnce {
    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

//        Set<Character> chars = new HashSet<>();
//
//        for (int x = 0; x < str.length() ; x++) {
//            
//            chars.add(str.charAt(x));
//
//        }
//        System.out.println("chars = " + chars);
//
//        System.out.println("chars.size() = " + chars.size());
        
        String[] charsArr = str.split("");
        System.out.println("Arrays.toString(chars) = " + Arrays.toString(charsArr));

        List<String > charList= Arrays.asList(charsArr);


      //  Set<String > charsSet = new HashSet< >(charList);
       // charsSet.addAll(Arrays.asList(chars));



        Set<String > charsSet = new HashSet< >(Arrays.asList(charsArr));

        System.out.println("charsSet = " + charsSet);
        System.out.println("charsSet = " + charsSet.size());

        String str2="AAAABBBBBBAACCCRDDDD";

        //GET THE FREQUENCY AND STORE INTO MAP  <Character, Integer>

        Map<Character ,Integer> charSeq = new HashMap<>();

        for (int x = 0; x < str2.length() ; x++) {
            Character currentChar= str2.charAt(x);

            if( ! charSeq.containsKey(currentChar)  ){
                charSeq.put(currentChar,1);
            }else{
                charSeq.replace(currentChar,charSeq.get(currentChar)+1);
            }

        }

        System.out.println("charSeq = " + charSeq);
        String uniqStore="";
        for (Character character : charSeq.keySet()) {
            uniqStore+=""+character+charSeq.get(character);
        }
        System.out.println("uniqStore = " + uniqStore);

        System.out.println("______________________________");




        String uniqueChars="";


        for (int x = 0; x < str2.length() ; x++) {
            char currentChar= str2.charAt(x);
            if( ! uniqueChars.contains(""+currentChar)){
                uniqueChars+= ""+currentChar;
            }

            }
        System.out.println("uniqueChars = " + uniqueChars);

        String uniqueCharsAndCounts="";

        for (int x = 0; x < uniqueChars.length() ; x++) {
            int counter=0;
            for (int y = 0; y < str2.length() ; y++) {
                if(uniqueChars.charAt(x)==str2.charAt(y)){
                    counter++;
                }

            }
            uniqueCharsAndCounts+= ""+uniqueChars.charAt(x)+counter;

        }
        System.out.println("uniqueCharsAndCounts = " + uniqueCharsAndCounts);









        
        
        

        
        
        
        
        
        
        

    }
}
