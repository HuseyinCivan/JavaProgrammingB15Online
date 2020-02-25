package day35;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int x=10;
        // primitive data types are pure value has no attribute or behaviour

        //each primitive types has wrapper class that turn it into object so we can treat it as object

        // this is the old not recomenede way of create Integer Object
        //Integer xObj1 = new Integer(12);

        // value mrthod of Integer class
        //return an integer object by wrapping up the value you passed
        // it has 2 overloaded version one that accept int , another accept String
        Integer xObj2=Integer.valueOf(10);
        Integer xObj3=Integer.valueOf("15");


        //since xObj2 is pointing to INteger Object
        // we can call all the methods of Integer class using this Object
        byte bValue = xObj2.byteValue();
        System.out.println("bValue = " + bValue);

        double dValue=xObj2.doubleValue();
        System.out.println("dValue = " + dValue);

        float f6=Float.parseFloat("3.14f");   //WITH f
        System.out.println("f6 = " + f6);

        float f7=Float.parseFloat("3.14");    //WITHOUT f
        System.out.println("f7 = " + f7);


        String sentence="I bought 3 tomato and the price was 3.14 each";
        //how much is your final check out
        //the count is always 3rd word
        //the price is always at 2nd word from the last

        String countStr=sentence.split(" ")[2];
        String priceStr=sentence.split(" ")[sentence.split(" ").length-2];

        int count=Integer.parseInt(countStr);
        double price=Double.parseDouble(priceStr);

        double sum=(price*count);
        System.out.println("sum = " + sum);
        }



    }

