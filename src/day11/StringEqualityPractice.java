package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {


        //checking for String equality sholul be always
        //done using equals method of the String

        //oneString.equals(anotherString)---> true of false

        //just comparing 2 String literal direcly using equals method
        System.out.println("Java".equals("java"));

        String myStr="Java";
        System.out.println(myStr.equals("Java"));

        String yourStr=new String("Java");


        System.out.println( myStr.equals(yourStr)   );


        //create a program to check whether myStr value is Java
        //if yes----> CORRECT WORD !
        //if false -------SAY JAVA
        if(myStr.equals("Java")){
            System.out.println("CORRECT WORD");
        }else{
            System.out.println("SAY JAVA");
        }

        if(myStr.equals(yourStr)){
            System.out.println("CORRECT WORD");
        }else{
            System.out.println("SAY JAVA");
        }















    }
}
