package day49;
//CAN A CLASS BOTH EXTEND ANOTHER CLASS AND IMPLEMENT AN INTERFACE?
// a class can only extend one other class
// a class can implements multible interfaces

public class IceCream extends Object implements Edible {
    @Override
    public void eat() {
        System.out.println("eat with spoon !!!");
    }

    @Override
    public void drink() {
        System.out.println("drink it if it has melted in the cup");
    }

    @Override
    public  void digest(){
        System.out.println("Digesting burger by chewing more ");
    }

    public static void main(String[] args) {

        IceCream i1=new IceCream();
        i1.drink();
        i1.eat();
        System.out.println(i1.toString());

        //since Object class exists, we can create object out of it
      //  Object i2=new IceCream();
      // Object i2=new Object();
        i1.digest();

    }
}
