package repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repl_199 {
    public static void main(String[] args) {

    }
    public static void removeAll(ArrayList<String> wordList, String targetWord){
        wordList.removeAll(Arrays.asList(targetWord));
        System.out.println(wordList);
    }
}
