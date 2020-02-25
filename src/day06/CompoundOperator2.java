package day06;

import java.util.Scanner;

public class CompoundOperator2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        // Assignment Operator =
        // ---->will save the result of whatever operation on the right side
        //and assign the result to the left side variable.

        //+= -= *= /= %=

        int studentOnline = 263;
        //studentOnline=studentOnline+5;
        studentOnline+=5;
        System.out.println(studentOnline);

        studentOnline-=3;
        System.out.println(studentOnline);

        studentOnline*=2;
        System.out.println(studentOnline);

        studentOnline/=3;
        System.out.println(studentOnline);





    }
}
