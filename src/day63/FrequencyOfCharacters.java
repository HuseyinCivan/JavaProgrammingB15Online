package day63;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str="AAAABBBBBBAACCCRDDDD";

        //GET THE FREQUENCY AND STORE INTO MAP  <Character, Integer>

        Map<Character,Integer> charFreq= new HashMap<>();

        for (int x = 0; x < str.length() ; x++) {
            char currentChar = str.charAt(x);

            if(! charFreq.containsKey(currentChar)) {
                charFreq.put(currentChar, 1);
            }else{
                charFreq.replace(currentChar,charFreq.get(currentChar)+1);



                }
            }
        System.out.println("charFreq = " + charFreq);


        }










    }

