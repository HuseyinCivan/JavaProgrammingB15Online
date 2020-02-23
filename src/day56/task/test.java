package day56.task;


import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {


        List<Product> denisList = Arrays.asList(new Product("cookie", 2),
                new Product("tea", 3),
                new Product("coffee", 7),
                new Product("muffins", 5),
                new Product("nut", 7),
                new Product("Frappecino", 8),
                new Product("double shot", 15)
        );

        Store s1=new Store("denis",denisList);

        s1.mostExpensiveProduct();






    }
}
