package day11;

public class StringEqualityPractice_Condition2 {
    public static void main(String[] args) {
        String myString="Cava";

//        if(myString.equals("Java")){
//            System.out.println("Correct Word!!!! ");
//        }else{
//            System.out.println("Say Java!!!!!");
//        }


//update this program to add more condition
        //using else if in the middle

        /*
        * check the value of myStr
        * if it is Java----->correct word
        * if it is Cava-----> Pumpkin!!
        * else say NOT JAVA NOR PUMPKIN
        *
        * */

        if(myString.equals("Java")){
            System.out.println("Correct Word");
        }else if(myString.equals("Cava")){
            System.out.println("Pumpkin!!!");
        }else{
            System.out.println("NOT JAVA NOR PUMPKIN");
        }

















    }

}
