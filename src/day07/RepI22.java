package day07;
import java.util.Scanner;
public class RepI22 {
    public static void main(String[] s) {


        String item1;
        String item2;
        String item3;
        double report ;
        double price1 , price2 , price3 , totalPrice;

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter Item1 and its price:");
        item1=scan.next();
        price1=scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        item2=scan.next();
        price2=scan.nextDouble();

        System.out.println("Enter Item3 and its price:");
        item3=scan.next();
        price3=scan.nextDouble();

        totalPrice= price1+price2+price3;

        report= totalPrice;

        System.out.println("Item1: "+item1+" Price: "+price1+", item2: "+item2+" Price: "+price2+
                ", item3: "+item3+" Price: "+price3);

        System.out.println("Total price: "+report);












    }
}
