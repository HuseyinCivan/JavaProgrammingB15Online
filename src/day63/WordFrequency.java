package day63;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {

        String str = "Finding Words Frequency Sounds Fun Because Fun Comes in When you count Words" +
                " But How do I count the Words with what I already know previously " +
                "Do it and find out Words Words Words";
        
        String[] allWords=str.split(" ");
        System.out.println("allWords.length = " + allWords.length);

        //we want to solve this using the map
        //because map only can have unique key , so we can use it for unique words
        //first create a Map object Hasmap implementation

        //loop through the word array
        //check if we already have the word in the key or not
        //if we do not have the key , it means we are entering for the first time
        //so the count will be 1 , add using put method
        //else it means we already have it in the key
        //so we get existing count using that key
        //and replace the old count value with new count value by incrementing by 1

        Map<String,Integer> wordFreq=new HashMap<>();
        for (int x = 0; x < allWords.length ; x++) {
            String currentWord = allWords[x];
            if(!wordFreq.containsKey(currentWord)){
                wordFreq.put(currentWord,1);
            }else{
                wordFreq.replace(currentWord,wordFreq.get(currentWord)+1);
            }


        }
        System.out.println("wordFreq = " + wordFreq);

        for (String s : wordFreq.keySet()) {
            System.out.println(s+" --> "+wordFreq.get(s));
        }







    }
}
