package repl;

import java.util.Arrays;

public class Repl_204 {
    public static void main(String[] args) {

    }
        public static boolean isAnagram(String word1, String word2) {
            String[] word1Sp = word1.toLowerCase().replace(" ","").split("");
            String[] word2Sp = word2.toLowerCase().replace(" ","").split("");
           // boolean isAnagram = true;
            Arrays.sort(word1Sp);
            Arrays.sort(word2Sp);
            if(word1Sp.equals(word2Sp)){
                return true;
            }else{
                return false;
            }
        }
    }


class Main {
    public static boolean isAnagram(String word1, String word2) {

        word1= word1.toLowerCase().replace(" ","");
        word2=word2.toLowerCase().replace(" ","");

        boolean isAnagram=true;
        if(word1.length()!=word2.length()){
            isAnagram=false;
        }
        else{
            for (int x = 0; x <word1.length() ; x++) {
                if(!word2.contains(""+word1.charAt(x))){
                    isAnagram=false;

                }
            }
        }
        return isAnagram;

    }
}

