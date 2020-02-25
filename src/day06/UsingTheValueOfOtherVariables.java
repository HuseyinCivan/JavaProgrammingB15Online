package day06;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {

        int myFavoriteNumber= 300;
        int yourFavoriteNumber=myFavoriteNumber;

        System.out.println("My favotite Number "+myFavoriteNumber);
        System.out.println("Your favotite Number "+yourFavoriteNumber);

        yourFavoriteNumber=100;
        System.out.println("My favotite Number "+myFavoriteNumber);
        System.out.println("Your favotite Number "+yourFavoriteNumber);

        //create a variable called yourOrder , type String and assign a value
        // create another variable called yourOrder and assign the value
        //to same value as yourOrder by coping
        //and just print them out

        String myOrder= "pizza";
        String yourOrder=myOrder;

        System.out.println("My order is "+myOrder+" and your order is "+yourOrder);





    }
}
