package day14;
import java.util.*;
public class repl57 {
    public static void main(String[] args) {
//        System.out.println("Please enter the text:");
//        Scanner scan=new Scanner(System.in);
//        String text=scan.next();
//
//        int length=text.length();
//
//        System.out.println("Length is: "+length);


        String name="Ismailis";

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(5));

        System.out.println("--------------------------------");

        System.out.println(name.indexOf("I"));
        System.out.println(name.indexOf("s"));
        System.out.println(name.indexOf("m"));
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("i"));
        System.out.println(name.indexOf("l"));
        System.out.println(name.indexOf("is"));
        System.out.println(name.indexOf("s"));
        System.out.println(name.indexOf("x"));

        System.out.println("--------------------------------");

        System.out.println(name.contains("3"));

        System.out.println(name.startsWith("Is"));

        System.out.println(name.indexOf("ail"));

        System.out.println("--------------------------------");

        System.out.println("Huseyin Civan".length());

        System.out.println("--------------------------------");

        String country=new String("Belize");

        System.out.println(country.toLowerCase());
        System.out.println(country.toUpperCase());
        System.out.println(country.startsWith("Be"));
        System.out.println(country.contains("liz"));

        System.out.println("--------------------------------");

        System.out.println(country.indexOf("i"));

        System.out.println("--------------------------------");

        System.out.println(country.substring(2));

        System.out.println(country.substring(2,5));

        System.out.println("--------------------------------");

        String country2 = "       Turkey     ";
        System.out.println(country2.trim());



    }
}