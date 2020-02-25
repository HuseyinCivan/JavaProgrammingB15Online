package repl;

public class Repl_178 {
    public static void main(String[] args) {

    }
    //When gears merge and work together, one teeth from each one goes in order.
    //Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:
    //
    //s1 ==> "12345"
    //s2 ==> "abcde"
    //mergeStrings(s1,s2) ==> "1a2b3c4d5e"
    //
    //mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
    //
    //mergeStrings("java", "selenium") ==> "jsaevlaenium"
    public static String mergeStrings(String one, String two) {

        String merged="";
        int oneLength=one.length();
        int twoLength=two.length();

        if(oneLength<twoLength){
            for (int x = 0; x <oneLength ; x++) {
                merged+=""+one.charAt(x)+two.charAt(x);
            }

            merged+=two.substring(oneLength);
        }
        else if(oneLength>twoLength){
            for (int x = 0; x <twoLength ; x++) {
                merged+=""+one.charAt(x)+two.charAt(x);
            }

            merged+=one.substring(twoLength);
        }else{
            for (int x = 0; x <oneLength ; x++) {
                merged+=""+one.charAt(x)+two.charAt(x);
            }
        }

return merged;

    }
}
