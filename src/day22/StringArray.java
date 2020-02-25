package day22;

public class StringArray {
    public static void main(String[] args) {
        //create a string array with size that you define
        // and store all yor household member name

        String[] houseHold=new String[2];

        houseHold[0]="Seda";
        houseHold[1]="Huseyin";

        System.out.println(houseHold[0]);
        System.out.println(houseHold[1]);

        //immutable means you can not change the internal structure of the object
        // if you have String abc = "hello"
        //if you do abc.toUpperCase ----> it will create new String object "HELLO"
        // and it does not change hello at all !!!

        //not resizable ---> specifically for array
        // we can not change the size of array once we create them with certain size
        //and it means ; IT IS NOT IMMUTABLE



    }
}
