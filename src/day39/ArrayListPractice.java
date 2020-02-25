package day39;

import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        /*
        Create an ArrayList of String to store 12 elements.
        Each element should contains product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18")
        );


        String itemDetails = "iPhone 6s,449,18.71";
        System.out.println("item name = " + itemDetails.split(",")[0]);
        System.out.println("item price = " + itemDetails.split(",")[1]);
        System.out.println("item monthly = " + itemDetails.split(",")[2]);


        System.out.println("________________________________");

//         * Task 1 : print only items name
        // we get each product, then we split by comma to split into  3 part,
        //and get first part of 3 ----> NAME
        for (String eachProduct : productLst) {   // this is each loop version
            System.out.println("eachProduct name = " + eachProduct.split(",")[0]);
        }

        // we get each product,by using get method of Array list in for loop,
        //then we split by comma to split into  3 part,
        //and get first part of 3 ----> NAME
        for (int x = 0; x < productLst.size(); x++) {  // this is for loop version
            String namePart = productLst.get(x).split(",")[0];
            System.out.println("eachProduct name = " + namePart);
            System.out.println("________________________________");

//         * Task 2 : print all the prices more than 500
            for (String eachProduct : productLst) {
                double price = Double.parseDouble(eachProduct.split(",")[1]);
                //System.out.println("price = " + price);
                if (price > 500) {
                    System.out.println("price = " + price);
                }

            }

        }
        System.out.println("________________________________");

//         * Task 3 : print average price

        double sum = 0;
        double average = 0;

        for (String eachProduct : productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum += price;
        }
        System.out.println("sum = " + sum);
        average = sum / productLst.size();
        System.out.println("average = " + average);


        System.out.println("________________________________");

//         * Task 4 : print all the items name that has less than 20$ monthly payment.
        for (String eachProduct : productLst) {
            String name = eachProduct.split(",")[0];
            double price = Double.parseDouble(eachProduct.split(",")[2]);

            if (price < 20) ;
            System.out.println(name + " " + price);

        }


        System.out.println("________________________________");
//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.

        for (String eachProduct : productLst) {
            String name = eachProduct.split(",")[0];
            double price = Double.parseDouble(eachProduct.split(",")[2]);

            if (name.contains("iPhone")) {
                System.out.println(name + " " + price);

            }

        }
        System.out.println("________________________________");

//         * Task 6 : Print all information about most expensive items.
        int indexOfMax = 0;
        double maxPrice = 0;
        for (int i = 0; i < productLst.size(); i++) {
            if (Double.parseDouble(productLst.get(i).split(",")[1]) > maxPrice) {
                maxPrice = Double.parseDouble(productLst.get(i).split(",")[1]);

            }
        }
        System.out.println("most expensive item details = " + productLst.get(indexOfMax));
        System.out.println("________________________________");

//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)


        for (int x = 0; x < productLst.size(); x++) {

            String currentItemName = productLst.get(x).split(",")[0];
            double currentPrice = Double.parseDouble(productLst.get(x).split(",")[1]);
            double currentMonthly = Double.parseDouble(productLst.get(x).split(",")[2]);

            if (currentItemName.contains("Dyson")) {

                productLst.set(x,currentItemName+","+ currentPrice * 0.2 +","+ currentMonthly * 0.2);

//                currentPrice = currentPrice * 0.2;
//                currentMonthly = currentMonthly * 0.2;
//                System.out.println(currentItemName + "," + currentPrice + "," + currentMonthly);
            }
        }
        System.out.println("productLst = " + productLst);
        System.out.println("_________________________________________________________");
//         * Task 8 : Count the items prices more than average price.

        int counter=0;
        for (String eachItem : productLst) {
            double price=Double.parseDouble(eachItem.split(",")[1]);

            if(price>average){
                System.out.println("eachItem = " + eachItem);
            }
        }
        System.out.println("_________________________");

//         * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.
        for (int x = 0; x <productLst.size() ; x++) {
            double price=Double.parseDouble(productLst.get(x).split(",")[1]);
           // System.out.println("price = " + price);
            String currentItem=productLst.get(x);

            if(price>average){
                productLst.remove(currentItem);
                x--;
            }
        }
        for (String eachItem : productLst) {
            System.out.println(eachItem);
        }

//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :


    }

}
