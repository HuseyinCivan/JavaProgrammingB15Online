package day20;

public class PalindroneTest {
    public static void main(String[] args) {
        //tersten yazilinca da ayni olan kelimeler

        //level , kayak , elle , madam , aziza

        String name="Kayak";
        System.out.println("name = " + name);
        String  reversedName="";

        for (int x = name.length()-1; x >=0 ; x--) {
         reversedName=reversedName+name.charAt(x);
        }

        System.out.println("reversedName = " + reversedName);


        // MAKE THIS CODE DOES NOT CARE ABOUT SPACES WHILE CHECKING /// HOMEWORK !!!!!!!



        if(name.equalsIgnoreCase(reversedName)){
            System.out.println("PALANDROME TEST PASSED");
        }else{
            System.out.println("PALANDROME TEST FAILED");
        }








    }
}
