package repl;

public class Repl_191 {
    public static void main(String[] args) {

    }

    public static String reverse(String input)
    {

        String reversed="";
        for(int x=input.length()-1; x>=0; x--){
            reversed+=""+input.charAt(x);
        }

        return reversed;
    }


}
