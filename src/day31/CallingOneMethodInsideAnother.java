package day31;

public class CallingOneMethodInsideAnother {


    public static void main(String[] args) {
     finallyAwake();
     drinkCoffee();


    }
   public static void finallyAwake(){
        wakeUp();
        drinkCoffee();


   }
    public static void wakeUp(){
        System.out.println("open your eyes");
        System.out.println("close your eye");
        System.out.println("hear your alarm ? open it again ");
        System.out.println("----------------------");

    }
    public static void drinkCoffee(){
        System.out.println("put coffee in your coffee machine");
        System.out.println("press the button make your coffee");
        System.out.println("---------------------------------");

    }


}
