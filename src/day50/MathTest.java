package day50;

import java.util.Arrays;
import java.util.List;

public class MathTest {
    public static void main(String[] args) {
        Addition q1=new Addition(10,90);
        System.out.println("q1 = " + q1);  // before calculation

        q1.calculate();

        System.out.println("q1 = " + q1); // after calculation
        System.out.println("_____________________");

        Subtraction q2=new Subtraction(90,10);
        System.out.println("q2 = " + q2);

        q2.calculate();

        System.out.println("q2 = " + q2);

        System.out.println("________________");

        Subtraction q3=new Subtraction(10,70);
        System.out.println("q3 = " + q3);

        q3.calculate();

        System.out.println("q3 = " + q3);


        System.out.println("________________");

        Multiplication q4=new Multiplication(10,3);
        System.out.println("q4 = " + q4);

        q4.calculate();

        System.out.println("q4 = " + q4);

        System.out.println("________________");

        Division q5=new Division(10,5);
        System.out.println("q5 = " + q5);

        q5.calculate();

        System.out.println("q5 = " + q5);

        System.out.println("________________");

        Division q6=new Division(10,50);
        System.out.println("q6 = " + q6);

        q6.calculate();

        System.out.println("q6 = " + q6);

        System.out.println("________________");

        Division q7=new Division(10,0);
        System.out.println("q7 = " + q7);

        q7.calculate();

        System.out.println("q7 = " + q7);

        System.out.println("________________");
        System.out.println("________________");

        List<Question> allTestQuestion = Arrays.asList(q1,q2,q3,q4,q5,q6,q7) ;

        for( Question eachQ : allTestQuestion     ){
            System.out.println("eachQ = " + eachQ);
        }




    }
}
