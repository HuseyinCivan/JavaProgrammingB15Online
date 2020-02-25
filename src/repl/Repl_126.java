package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_126 {
    public static void main(String[] args) {

        //olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
        //[cat, old, ray]

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();


        String[] strArray = str.split(", ");
        int shortestCharCount = strArray[0].length();

        for (int x = 0; x < strArray.length; x++) {
            if (strArray[x].length() < shortestCharCount) {
                shortestCharCount = strArray[x].length();
            }
        }
        String shorts = "";
        for (int x = 0; x < strArray.length; x++) {
            if (strArray[x].length() == shortestCharCount) {
                shorts = shorts + strArray[x] + " ";
            }
        }
        String[] shortsArray = shorts.split(" ");
        Arrays.sort(shortsArray);
        System.out.println(Arrays.toString(shortsArray));
    }
}

