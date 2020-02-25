package day31;
//// Create a class called MethodPractice3
//// no need for object when being called                : static
//// it should be accessible anywhere in your project    : public
//// it does not return any value                        : void
//// does not need any external data when being called   : (nothing inside)

//// Create a method called countDownFrom20tillOne
//// Create a method to print odd numbers from 1-100 : printOddNumbers1to100()
//// Create a method to spell your name :  Seda -->> S-e-d-a

public class MethodPractice3 {
    public static void main(String[] args) {
     countDownFrom20tillOne();
printOddNumbers1to100();
spellYourName();

    }
public static void countDownFrom20tillOne(){
    for (int i = 20; i >=1 ; i--) {
        System.out.print(i+" ");
    }
    System.out.println();
}
public static void printOddNumbers1to100(){
    for (int i = 1; i <100 ; i+=2) {
        System.out.print(i+" ");
    }
    System.out.println();
}
public static void spellYourName(){
        String name="Seda";
    for (int i = 0; i <name.length() ; i++) {
        System.out.print(name.charAt(i));
        if(name.charAt(i)!=name.charAt(name.length()-1) ){
            System.out.print("-");
        }

    }
}
}
