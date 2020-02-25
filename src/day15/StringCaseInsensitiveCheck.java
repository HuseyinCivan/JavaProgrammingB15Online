package day15;

import java.util.jar.JarOutputStream;

public class StringCaseInsensitiveCheck {
    public static void main(String[] args) {

        String name= "Arya Stark";

        System.out.println(name.contains("st"));

        // i wnat to check whether this name contains st no mather the case
        //so i want to store the uppercase version of this nema and then check for ST,

        String upperCaseName=name.toUpperCase();
        System.out.println("uppercaseName contains ST or not ? "+upperCaseName.contains("ST"));

        String lowerCaseName=name.toLowerCase();
        System.out.println("lowercaseName contains st or not ? "+lowerCaseName.contains("st"));

        // this is called method chaining, combining multible method  call
        // make my name all lowercase (String) then check whether it contains lowercase st

        System.out.println(name.toLowerCase().contains("st"));
        //System.out.println(     name.length().toUppercase()   );






    }
}
