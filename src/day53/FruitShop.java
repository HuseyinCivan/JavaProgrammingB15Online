package day53;


//Only Reference Type Decide what you can access at compile time
// if we have Fruit as reference type , getDigested method will point to the one under Fruit class
//Actual object type decide what method will be called at run time
// since actual object is Apple|Orange , at run time it will call overriden version of the method
// and that's the power of polymorphism , making the correct decision at runtime according to the actual object

public class FruitShop {
    public static void main(String[] args) {

        Apple a1=new Apple("sweet","red","Fuji");


        //what can i access using rference variable a1
        //what decide what you can access
        //a1 has Apple as reference type, so we can access anyhing inside aplle
        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);

        a1.getDigested();

        System.out.println("=======================================");





        Fruit f1= a1; //new Apple("sweet","red","Fuji");
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);

         // f1.type we can not access type coming form apple if we refer it as fruit

        //let say if fruit does not have digested method
        //below will not compile
        //because only reference type decide what you can access
        f1.getDigested();  //
        new Apple("sweet","red","Fuji").getDigested();   //==> f1.digested();    SAME !!
        f1=new Orange("sour=sweet","redish",11);   //REASSIGN
        f1.getDigested();   //orange version we will get

        System.out.println(f1.toString());
        System.out.println("f1 = " + f1);


        String str = null;
        //System.out.println(str.charAt(0));
        //System.out.println(str.bark());
        //System.out.println(str.digested());



        // list of custon type: collection of custom type
        //Fruit is reference type , Apple is actual Object Type
        Fruit f2= new Apple("crispy but tasteless","red hot","Gala");
        Fruit f3= new Orange("sour","orange",12);
        Fruit f4=new Orange("very sweet","Blood Red",10);
        System.out.println("=============================");
        Fruit[] myFruit={f1,f2,f3,f4};

        for (Fruit each : myFruit) {
            each.getDigested();
        }


















    }
}
