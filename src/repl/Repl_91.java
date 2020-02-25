package repl;

public class Repl_91 {
    public static void main(String[] args) {
        String word ="zyxwv";

        for(int x=0;x<=word.length()-1;x++){
            char firstChar=word.charAt(x);
            for (int y = 0; y <=word.length()-1 ; y++) {
             char secondChar=word.charAt(y);
                System.out.println(""+firstChar+secondChar);
            }

        }

    }
}
