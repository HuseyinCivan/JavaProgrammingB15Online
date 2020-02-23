package day46;

public class JavaProgrammer extends Programmer {

    @Override
    void code() {
        System.out.println("I code Java!!!");
    }

    @Override
    void test() {
        super.test();
        System.out.println("we do test in JUnit");
    }

    //    //unique behaviour : drinkCoffee , doRepl , doJavaDevelopment

   void  drinkCoffee (){
       System.out.println("JavaProgrammer drinkCoffee lots of coffee");
       //super.code();
   }

    void  doRepl (){
        System.out.println("JavaProgrammer doRepl");
    }
    void  doJavaDevelopment  (){
        System.out.println("JavaProgrammer do Java Development ");
    }


}
