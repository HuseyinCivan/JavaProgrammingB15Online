package repl.repl_235;

import java.util.ArrayList;
import java.util.List;

public class TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        //TODO
        regularItems=new ArrayList<>();
        onSaleItems=new ArrayList<>();


    }

    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {
       regularItems.add(item);

    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);

    }

    /**
     * getter for regularItems
     * @return
     */
    public List<Item> getRegularItems() {
        //TODO change from null
        return regularItems;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {
        //TODO change from null
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
        //TODO change from -1
        return regularItems.size();
    }
    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public List<String> getAllItemNames() {

        List<String > allItems=new ArrayList<>();
        for (int x = 0; x <regularItems.size(); x++) {
            allItems.add(regularItems.get(x).getName());
        }
        for (int x = 0; x <onSaleItems.size(); x++) {
            allItems.add(onSaleItems.get(x).getName());
        }
        return allItems;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber)
    {
        for (int x = 0; x < regularItems.size(); x++) {
            if(regularItems.get(x).getCatalogNumber()==catalogNumber){
                return regularItems.get(x).getPrice();
            }
        }
        for (OnSaleItem each : onSaleItems) {
            if(each.getCatalogNumber()==catalogNumber){
                return each.getPrice();
            }

        }

        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name) {
        for (OnSaleItem eachOnSale : onSaleItems) {
            if (eachOnSale.getName().equalsIgnoreCase(name)) {
                return eachOnSale;
            }
        }
        return null;
    }


    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {

        for (int x = 0; x <regularItems.size() ; x++) {
            if(regularItems.get(x).getCatalogNumber()==catalogNumber){
                regularItems.remove(x);
                x--;
            }
        }
        for (int x = 0; x <onSaleItems.size() ; x++) {
            if(onSaleItems.get(x).getCatalogNumber()==catalogNumber){
                onSaleItems.remove(x);
                x--;
            }
        }

    }



    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {

        for (Item eachRegular : regularItems) {
            if(eachRegular.getCatalogNumber()==catalogNumber){
                if(eachRegular.getQuantity()>1) {
                    eachRegular.setQuantity(eachRegular.getQuantity() - 1);
                }
                if(eachRegular.getQuantity()==0){
                    regularItems.remove(eachRegular);
                }
            }

        }
        for (OnSaleItem eachOnSale : onSaleItems) {
            if(eachOnSale.getCatalogNumber()==catalogNumber){
                if(eachOnSale.getQuantity()>1) {
                    eachOnSale.setQuantity(eachOnSale.getQuantity() - 1);
                }
                if(eachOnSale.getQuantity()==0){
                    onSaleItems.remove(eachOnSale);
                }
            }
        }


    }


}
