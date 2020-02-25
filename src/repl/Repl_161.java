package repl;
import java.util.Scanner;
public class Repl_161 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }
    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE
        boolean numIsPalindrome = false;
        String strNum = String.valueOf(num);
        String reverseStrNum = "";
        for (int x = strNum.length() - 1; x >= 0; x--) {
            reverseStrNum = reverseStrNum + strNum.charAt(x);
        }
        if (reverseStrNum.equals(strNum)) {
            numIsPalindrome = true;
        }
        System.out.println(numIsPalindrome);
    }
}