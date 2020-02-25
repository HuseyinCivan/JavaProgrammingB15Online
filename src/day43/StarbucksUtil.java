package day43;

public class StarbucksUtil {
    public static void main(String[] args) {

        Coffee c3=new Coffee("Blonde",5,1.6);
        printCoffeeInfo(c3);
        printStringInfo("abc");

        String myString=new String("Hello");
        printStringInfo(myString);

        Coffee c1=new Coffee();
        printCoffeeInfo(c1);

        printCoffeeInfo(new Coffee("Intensito",10));









    }
    //create a static method to accept a coffee object and print its information
    //like this : this coffee is : name , price is <price> , caffeine level is <level>;
    public static void printCoffeeInfo(Coffee co){
        System.out.println("this coffee is "+co.getType()+" , price is "+co.getPrice()+" , caffeine level is "+co.getCaffeinLevel());

    }

    /**
     *
     * s static method to print out first and last character of a string
     * @param str

     */
    public static void printStringInfo(String str){
        System.out.println("first character is "+str.charAt(0));
        System.out.println("last character is "+str.charAt(str.length()-1));
    }

}
