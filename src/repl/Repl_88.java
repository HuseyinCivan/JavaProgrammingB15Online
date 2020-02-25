package repl;
import java.util.Scanner;
public class Repl_88 {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                int countOfCats = 0;
                int countOfDogs = 0;
                String word = scan.next();

                for (int x = 0; x <= word.length() - 3; x++) {
                    String curren3Char = word.substring(x, x + 3);
                    if (curren3Char.equals("cat")) {
                        countOfCats++;
                    }
                    if (curren3Char.equals("dog")) {
                        countOfDogs++;
                    }
                }
                if (countOfDogs == countOfCats) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }


            }
        }

