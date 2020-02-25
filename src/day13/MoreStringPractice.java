package day13;

public class MoreStringPractice {
    public static void main(String[] args) {
        String name="Pumpkin";


//        System.out.println( name );
//        name="Cat";

        System.out.println(name);

        name.toUpperCase();
        System.out.println(name);


        //String is immutable, one created It can not be changed
        //any String actions / methods that looks like changing the value
        //actually creating a new String object



        System.out.println(name.toUpperCase());

        //what if i really want to change the name

        name=name.toUpperCase();
        System.out.println(name);









    }
}
