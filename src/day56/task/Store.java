package day56.task;

import java.util.ArrayList;
import java.util.List;

public class Store {
    String name;
    List<Product> allProducts;

    public Store (){
        this.name="CyberTek Store";
        this.allProducts=new ArrayList<>();

    }
    public Store(String name,List<Product>otherProducts  ){
        this();
        this.name=name;
        allProducts.addAll(otherProducts);
    }
    public void addProduct(Product p){
        allProducts.add(p);

    }
    //add product 2way
    public void addProduct(String name, int price){
        Product newP=new Product(name,price);
        allProducts.add(newP);

    }



    public void removeProduct(Product p){
        if(allProducts.contains(p)){
            allProducts.remove(p);
        }
        else{
            System.out.println("there is no "+p.toString());
        }

    }
    public boolean checkIfProductExist(Product p){
        return allProducts.contains(p);
    }
    //display all products

    public void displayAllProducts(){
        System.out.println("store has these products");
        for (int x = 0; x < allProducts.size() ; x++) {
            System.out.println(allProducts.get(x));
        }
    }

    //getProductCount
    public int getProductCount(){
        return allProducts.size();

    }

    //getSumOfAllPrices

    public double getSumOfAllPrices(){
        double sum=0;
        for (Product each : allProducts) {
            sum+= each.getPrice();

        }
        return sum;
    }

    //getAveragePrice
    public double getAveragePrice(){
        return getSumOfAllPrices()/getProductCount();
    }

    //Find list of products more than average  (edited)

    public void moreThanAverage(){
        for (Product each : allProducts) {
            if(each.getPrice()>getAveragePrice()){
                System.out.println("each = " + each);
            }
        }
    }

    //find and return max price product

    public void mostExpensiveProduct(){
//        double maxPrice=Double.MIN_VALUE;
//        int indexOfMax=-1;
//        for (int x = 0; x < allProducts.size() ; x++) {
//            if(allProducts.get(x).getPrice()>maxPrice){
//                indexOfMax=x;
//            }
//        }
//        System.out.println("most expensive item is "+allProducts.get(indexOfMax).getName());

        double maxPrice=Double.MIN_VALUE;
        Product maxValue=null;

        for (Product each : allProducts) {
            if(each.getPrice()>maxPrice){
                maxPrice=each.getPrice();
                maxValue=each;
            }
        }
        System.out.println("most expensive product = " + maxValue);

    }



























}
