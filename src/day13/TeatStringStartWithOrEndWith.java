package day13;

public class TeatStringStartWithOrEndWith {
    public static <car> void main(String[] args) {

   String name ="Huseyin";

   //check if a String start with another string
   // it is case sensitive
        System.out.println(name.startsWith("Hu"));
        System.out.println(name.startsWith("hu"));
        System.out.println(name.startsWith("Hue"));

        // //check if a String end with another string

        System.out.println(name.endsWith("yin"));
        System.out.println(name.endsWith("n"));
        System.out.println(name.endsWith("N"));
        System.out.println(name.endsWith("Huseyin"));

//        car myCar;
//        System.out.println(new car)();







    }
}
