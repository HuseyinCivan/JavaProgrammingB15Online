package repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repl_237 {


    // 3 instance fields type of ArrayList
    // has been initialized already
    // and ready to be used inside method to add items
    public ArrayList<String> items = new ArrayList<>();
    public ArrayList<Double> prices = new ArrayList<>();
    public ArrayList<Double> monthlyPayments = new ArrayList<>();

    /**
     * This method adds all listed items to <items> arraylist
     * that is already declared above
     */
    public void loadItems() {
        //TODO
		items.addAll( Arrays.asList("iPhone 6s",
                "iPhone 6s Plus",
                "iPhone X",
                "MacbookPro",
                "ThumbDrive",
                "Beats HeadPhones",
                "Mouse",
                "Charger",
                "iPad",
                "Dyson Vacuum",
                "TV",
                "Apple Watch"));



      /*
        "iPhone 6s"
		"iPhone 6s Plus"
		"iPhone X"
		"MacbookPro"
		"ThumbDrive"
		"Beats HeadPhones"
		"Mouse"
		"Charger"
		"iPad"
		"Dyson Vacuum"
		"TV"
		"Apple Watch"
       */
    }
    /**
     * This method adds all listed prices to <prices> arraylist
     * that is already declared above
     */
    public void loadPrices() {
        //TODO

        monthlyPayments.addAll(Arrays.asList(449.0,
        549.0,
        1149.0,
        1499.99,
        39.99,
        349.99,
        79.99,
        39.99,
        429.0,
        399.0,
        2199.0,
        559.0));
		/*449.0
		  549.0
		  1149.0
		  1499.99
		  39.99
		  349.99
		  79.99
		  39.99
		  429.0
		  399.0
		  2199.0
		  559.0
		 */
    }

    /**
     * This method adds all listed monthly payments to <monthlyPayments> arraylist
     * that is already declared above
     */

    public void loadMonthlyPayments() {
        //TODO

monthlyPayments.addAll( Arrays.asList(18.71, 22.88, 56.16, 79.49, 2.68, 15.12, 8.98, 4.56, 18.31, 16.25, 89.49, 21.18));
		/*
		  18.71
		  22.88
		  56.16
          79.49
          2.68
          15.12
		  8.98
		  4.56
		  18.31
		  16.25
		  89.49
		  21.18
		  */
    }

    /**
     * This method will load whole catalog data - <items>,<prices>,<monthlyPayments>
     * Call loadItems(),loadPrices(),loadMonthlyPayments() that you created above
     */
    public void loadWholeCatalog() {
        //TODO

        loadItems();
        loadPrices();
        loadMonthlyPayments();


    }

    /**
     * Write a method that reads values from above ArrayLists and
     * returns a stringbuilder with all item details:
     * return format(each item in new line and delimited by '-' ):
     * 	iPhone 6s-449.0-18.71
     iPhone 6s Plus-549.0-22.88
     ..
     *
     */

    public StringBuilder getWholeCatalog() {
        //LOAD WHOLE CATALOG HERE FIRST
    loadWholeCatalog();
        //TODO
        StringBuilder stb=new StringBuilder();
        for (int x = 0; x < items.size() ; x++) {
//            stb.append(items.get(x)+"-");
//            stb.append(prices.get(x)+"-");
//            stb.append(monthlyPayments.get(x));
            stb.append(items.get(x)+"-"+prices.get(x)+"-"+monthlyPayments.get(x)+"\n");
        }


        return stb;
    }

    /**
     * write a method that an item name and returns all details for it. If item
     * is not in the list then returns null
     *  ex:
     * getItemDetails("ThumbDrive") -->ThumbDrive-39.99-2.68
     * getItemDetails("Charger") --> Charger-39.99-4.56
     * getItemDetails("Potato") --> null
     *
     * @param item
     * @return
     */

    public String getItemDetails(String item) {
        //LOAD WHOLE CATALOG HERE FIRST
        loadWholeCatalog();
        for (int x = 0; x <items.size() ; x++) {
            if(items.get(x).equals(item)){
                return items.get(x)+"-"+prices.get(x)+"-"+monthlyPayments.get(x);
            }
        }

        //TODO

        return null;
    }

    /**
     * write a method that accepts a price and returns a ArrayList<String> with
     * items with all detail that have less than or equal monthly payments
     *
     * getItemsLessThanAMonthlyPrice(5.99) --> ThumbDrive-39.99-2.68
     * 										  Charger-39.99-4.56
     * getItemsLessThanAMonthlyPrice(1.99) --> ""
     *
    // * @param double price
     * @return ArrayList<String>
     */

    public ArrayList<String> getItemsLessThanAMonthlyPrice(double price) {


        //        public ArrayList<String> getItemsLessThanAMonthlyPrice(double price) {
        //            //LOAD WHOLE CATALOG HERE FIRST
        //            this.loadWholeCatalog();
        //            //TODO
        //            ArrayList<String> newList = new ArrayList<>();
        //            for (int i = 0; i < monthlyPayments.size(); i++) {
        //                if(monthlyPayments.get(i) <= price){
        //                    newList.add(items.get(i)+"-"+prices.get(i)+"-"+monthlyPayments.get(i));
        //                }
        //            }
        //            return newList;



            //LOAD WHOLE CATALOG HERE FIRST
        loadWholeCatalog();
        ArrayList<String> itemsLessThanAMonthlyPrice=new ArrayList<>();

        for (int x = 0; x < items.size(); x++) {
            if(monthlyPayments.get(x)>=price){
                itemsLessThanAMonthlyPrice.add(items.get(x)+"-"+prices.get(x)+"-"+monthlyPayments.get(x));

            }else{
                itemsLessThanAMonthlyPrice.add("");

            }

        }


        //TODO

        return itemsLessThanAMonthlyPrice;
    }

    /**
     * Method accepts a item name and updates total Price and monthly payments
     * for that item in <items>,<prices>,<monthlyPayments> arrayLists
     * When assigning monthlyPayments do =>  newPrice/12 <= to get monthly payments
     *
     * @param item name
     * @param newPrice
     */

    public void updatePrice(String item, double newPrice) {
        //LOAD WHOLE CATALOG HERE FIRST
        loadWholeCatalog();

        //TODO

        for (int x = 0; x <items.size() ; x++) {
            if(item.equals(items.get(x))){
                prices.set(x,newPrice);
                monthlyPayments.set(x,newPrice/12);

            }
        }

    }

    /**
     * Method looks for an item in the catalog and removes
     * all details for that item including item name, price, monthlypayments
     *
     *
     * @param item
     */

    public void deleteItemFromCatalog(String item) {
        //LOAD WHOLE CATALOG HERE FIRST
    loadWholeCatalog();
        //TODO

        for (int x = 0; x < items.size() ; x++) {
            if(items.get(x).equals(item)){
                items.remove(x);
                prices.remove(x);
                monthlyPayments.remove(x);

                x--;


            }
        }

    }

}
