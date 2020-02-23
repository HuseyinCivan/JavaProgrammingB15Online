package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {
    // I added this name as new requirement so we can identify our store by name
    String name;  // adding a field so we can give a name to store object when we create one
  private   List<Product> allProducts;  //  store has List of products


    public List<Product> getAllProductsMoreThanAvaragePrice(){
    List<Product> myList = new ArrayList<>();
    double avarage=getAveragePrice();

        for (Product each : allProducts) {
            if(each.getPrice()>avarage){
                myList.add(each);
            }
        }
        return myList;
}


    /**
     * max price object in the list
     * @return
     */
    public Product getMostExpensiveProduct(){
        Product maxProduct=null;
        int max=Integer.MIN_VALUE;
//assume my max price is lowest number in Integer range so it will be replaced by any price
        for (Product each : allProducts) {
            if(each.getPrice()>max){
                max=each.getPrice();
                maxProduct=each;
            }
        }
        return maxProduct;


//        int maxIndex= -1;  //assuming our index is -1 before we actually find it // this will be recplaced anyway

//        for (int x = 0; x < allProducts.size() ; x++) {
//            if(allProducts.get(x).getPrice()>max){
//                max=allProducts.get(x).getPrice();
//                maxIndex=x;
//            }
//        }

//        System.out.println("max = " + max);
//
//        return allProducts.get(maxIndex);
    }



    /**
     * a method to calculate the avarage price
     * @return
     */
    public double getAveragePrice(){
    return findSumOfAllProductPrice()/getProductCount();

}



    /**
     * calculate the sum of all products price
     * @return
     */
    public int findSumOfAllProductPrice(){
        int sum=0;
        for (Product each : allProducts) {
            sum+=each.getPrice();
        }

        return sum;
    }



    /**
     * display all products un human readable manner
     */
    public void displayProducts(){
        System.out.println(name+"'s Store has below products");
        for( Product each    :allProducts){
            System.out.println("\t each = " + each);
        }
    }

    /**
     * it will check whether we have the product in the list
     * @param p
     * @return true if the list contains the product
     */
    public boolean checkIfProductExists(Product p){
        return allProducts.contains(p);
    }

    /**
     * find out 0 based location of the product in the store
     * @param p
     * @return
     */
    public int indexOfProduct(Product p){
        return allProducts.indexOf(p);
    }

    public void removeProduct(Product p){
        if(checkIfProductExists(p)==true){
            allProducts.remove(p);
        }else{
            System.out.println("we don't have "+p);
        }
    }


    /**
     * counting how many products we have in the store
     * @return
     */
    public int getProductCount(){
        return allProducts.size();
    }

    /**
     * this version od addProduct will directly accept ready Product object
     * so it can be added to the allProducts list
     * @param p
     */
   public void addProduct (Product p){
       System.out.println("calling addProduct (Product p)");
       allProducts.add(p);


   }

    /**
     * this version of addProduct will accept data that necessary to
     * create product object so it can be eventually added to the list
     * @param productName
     * @param productPrice
     */
   public void addProduct(String productName, int productPrice){
       //not to deal with new keyword all the time

      // Product newP= new Product(productName,productPrice);
       //allProducts.add(newP);
       allProducts.add(new Product(productName,productPrice));

   }


    public Store(){

        this.name="CyberTek Store";
        this.allProducts=new ArrayList<>();  //kaldirirsan null alirsin

    }

    public Store(String name, List<Product> otherList) {
        this();  //calling no arg constructor here
        this.name=name;
        //
        allProducts.addAll(otherList);

    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }
}
