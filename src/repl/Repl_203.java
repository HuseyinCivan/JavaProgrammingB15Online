package repl;
//isPalindrome("Noon") ==> true
//
//isPalindrome("I am not palindrome") ==> false
//
//isPalindrome("wooden") ==> false
//
//isPalindrome("Nurses Run") ==> true
public class Repl_203 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Noon"));
        System.out.println(isPalindrome("I am not palindrome"));
        System.out.println(isPalindrome("wooden"));
        System.out.println(isPalindrome("Nurses Run"));

    }
    public static boolean isPalindrome(String check) {
        check=check.toLowerCase().replace(" ","");

        String reverse="";
        for(int x=check.length()-1 ; x>=0 ; x-- ){
            reverse+=""+check.charAt(x);
        }


        return check.equals(reverse);
    }

}