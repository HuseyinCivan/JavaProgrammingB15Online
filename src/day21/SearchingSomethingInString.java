package day21;

public class SearchingSomethingInString {
    public static void main(String[] args) {

   String name= "Hasan Mammadov";

   // find out index of all the a in cases insensitive manner

        for(int x=0;x<=name.length()-1;x++) {
            String currentChar = name.substring(x, x + 1);

            if (currentChar.equalsIgnoreCase("a")) {
                System.out.println("index no of \"a or A\" is " + x);
            }
        }


    }
}
