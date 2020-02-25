package repl;

public class Repl_210 {
    public static void main(String[] args) {

        String result = Utils.reverseLetters("..zxcv..d");
        System.out.println(result.equals("..dvcx..z")); //true

        String result2 = Utils.reverseLetters("---abmkl.o-");
        System.out.println(result2.equals("---olkmb.a-")); //true

        String result3 = Utils.reverseLetters("---abmkl.o-");
        System.out.println(result3.equals("-o.lkmba---")); //false
    }

    public static class Utils {
        public static String reverseLetters(String word) {
            //TODO
            //Input:   str = "a,b$c"
            //Output:  str = "c,b$a"
            //Note that $ and , are not moved anywhere.
            //Only subsequence "abc" is reversed.
            //
            //Input:   str = "Ab,c,de!$"
            //Output:  str = "ed,c,bA!$"
            //
            //Input:   str = "----qwe--r--tyf...gd.---"
            //Output:  str = "----dgf--y--tre...wq.---"
            String newWord = "";

            String reverseJustWords = "";

            for (int x = word.length() - 1; x >= 0; x--) {
                if (Character.isLetter(word.charAt(x))) {
                    reverseJustWords += "" + word.charAt(x);
                }
            }
            int indexOfReverse = 0;

            for (int x = 0; x < word.length(); x++) {
                if (!Character.isLetter(word.charAt(x))) {
                    newWord += "" + word.charAt(x);
                } else {
                    newWord += "" + reverseJustWords.charAt(indexOfReverse);
                    indexOfReverse++;

                }
            }
            word = newWord;

            return word;
        }
    }
}