package repl;

public class Repl_209 {
    public static void main(String[] args) {

    }
    public static String extractNum(String s) {
        String nums="";

        for(int x=0; x<s.length() ; x++){


            if   (  Character.isDigit(s.charAt(x)) )  {
                nums+=""+s.charAt(x);
            }
        }
        return nums;

    }
}

