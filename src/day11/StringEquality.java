package day11;

public class StringEquality {
    public static void main(String[] args) {

        String name="Huseyin";
        String name2= new String("Huseyin");
        String name3="Huseyin";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println(name==name2);
        System.out.println(name==name3);


        // the correct way of comparing String to get consistent result is
        //using one of the String object behaviour / method called
        //equals method
        //str1.equals(str2)

        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));













    }
}
