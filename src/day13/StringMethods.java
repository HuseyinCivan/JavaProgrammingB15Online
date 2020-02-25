package day13;

public class StringMethods {
    public static void main(String[] args) {

   // String actions that we already know so far

   //equals
   String s1="Hello";
        System.out.println(s1.equals("abc"));
   //equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("HELLO"));

        //toUpperCase method of String is used to make String all character uppercase

        System.out.println(s1);
        System.out.println(   s1.toUpperCase()      );

        //toLoverCase method of String is used to make all character Lower Case

        System.out.println(s1.toLowerCase());

        //store your name into a variable

        String name="Huseyin";

        System.out.println("MY NAME IS :"+name.toUpperCase());
        System.out.println("my name is :"+name.toLowerCase());

        //in order to get how many character we have inside String
        //we can use lengt method of String

        System.out.println(s1.length());
        System.out.println(name.length());

        int lengtOfstr=s1.length();
        if(lengtOfstr>4){
            System.out.println("More than 4 character");
        }else{
            System.out.println("not more than 4");
        }

    }
}
