package day63.review;

import java.util.HashMap;
import java.util.Map;

public class CustomMethodForFrequency {
      public static void main(String[] args) {
//        String str="Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No It is never Ending";
//
//        System.out.println("getFrequencyMap(str) = " + getFrequencyMap(str));
//    }
//
//
//    public static Map<String ,Integer> getFrequencyMap (String str) {
//
//        Map<String, Integer> wordFreqMap = new HashMap<>();
//
//
//        for (String word : str.split(" ")) {
//
//            if (!wordFreqMap.containsKey(word)) {
//                wordFreqMap.put(word, 1);
//            } else {
//                wordFreqMap.replace(word, wordFreqMap.get(word) + 1);
//            }
//
//        }
//
//        return wordFreqMap;

          String str="Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No It is never Ending";
          System.out.println("freqWordMap(str) = " + freqWordMap(str));

      }

    public static Map<String ,Integer> freqWordMap (String str) {
        Map<String, Integer> wordFreq = new HashMap<>();
        String[] splitted = str.split(" ");

        for (int x = 0; x < splitted.length; x++) {
            if (!wordFreq.containsKey(splitted[x])) {
                wordFreq.put(splitted[x], 1);
            } else {
                wordFreq.replace(splitted[x], wordFreq.get(splitted[x])+1);
            }
        }
return wordFreq;
    }



}
