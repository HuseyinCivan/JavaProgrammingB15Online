package day06;
import java.util.Scanner;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("what is your order ? i want the same ");
        String yourOrder= scan.nextLine();
        String myOrder= yourOrder;

        System.out.println("Your order is "+yourOrder+" My order is "+myOrder);





    }

}
