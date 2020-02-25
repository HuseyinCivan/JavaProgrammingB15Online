package repl;

import java.util.Scanner;

public class Repl_94 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 0;
        double totalProce = 0;

        do {
            System.out.println("Enter Item" + count+" and its price:");
            item = scan.next();
            price = scan.nextDouble();

            System.out.println("Add one more item?");
            countinue = scan.next();


            shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", ";
            totalProce += price;
            count++;

        }while (countinue.equals("yes") && count <= 10) ;


        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
        System.out.println("Total price: " + totalProce);

    }
}







