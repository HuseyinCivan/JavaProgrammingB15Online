package day11;

public class LogicalNotOperator {
    public static void main(String[] args) {

        // LOGICAL NOT OPERATOR ! exclamation mark is used to negate the boolean value
        // IT CAN NOT BE USED WITH ANY OTHER DATA TYPE OTHER THAN BOOLEAN

        System.out.println(true);
        System.out.println(false);
        //first we can use directly to boolean value like true and false

        System.out.println("result of !true ");
        System.out.println(!true); // flip the coin and make it false
        System.out.println("result of !false ");
        System.out.println(!false); // flip the coin and make it false

    boolean isRecording=false;
        System.out.println("result of ! isRecording ");
        // second you can use it in front of a bloolean variable and it will give opposite value
        System.out.println(!isRecording);

        //THIRD..........

        System.out.println("result of !(7>5) ");
        System.out.println(   !(7>5)   );


        int x=7;
        System.out.println("result of x>10 ");
        System.out.println(   x>10  );

        System.out.println("result of !(x>10) ");
        System.out.println(   !(x>10)  );

        // !(x>10) -----> x<==10




    }
}
