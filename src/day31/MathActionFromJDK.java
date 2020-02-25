package day31;

public class MathActionFromJDK {
    public static void main(String[] args) {

        // where is String class coming from ?
        // it is coming from a package callaed java.lang
        // it is a special package
        // and any class in it, does not need importing when being used
        // for example String class

        // what if i really want to explicitly import String class
        // import java.lang.String
   String str="Hello";

   //there is a class under java.lang called Math
        //and it has lots of math utility methods that ready to be used

       int sum= Math.addExact(10,20);
        System.out.println(sum);

        System.out.println( Math.max(10,20) );





    }
}
