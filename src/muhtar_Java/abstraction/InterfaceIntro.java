package muhtar_Java.abstraction;



public interface InterfaceIntro {

//    public InterfaceIntro(){    ---> can not create a constructor
//
//    }

    //we have not have constructor because there is no class.  there is no object instances what so ever

//    public void methodB(){            ---> instance method yapamazsin !!!
//        // if you can not have constructor you can not have instance method also , because you don't have object instances
//    }

    public static void mm(){   // ---> static method belongs to interface , so you can have static methods !!!

    }




    public abstract void MethodA(); // // we can have abstract methods
    // abstract method you can create only in abstract class or interface


    public default void methodC(){

    }
    int a = 100; //static variable
   //public static final   int a=100;
}

interface Data{

}
class Test implements InterfaceIntro, Data {
//     sub type         supertype     supertype

    @Override
    public void MethodA() {

    }
    class A{


    }
class B extends A implements InterfaceIntro,Data{
        public void MethodA(){

        }

}

// interface sadece Abstract method - static method ve default method kabul eder !!! + public static final ( constant field )


    public static void main(String[] args) {
        InterfaceIntro.mm();    // static metodu intercae in adiyla cagirabilirsin !!
        System.out.println(InterfaceIntro.a);  //variables are static by default
      //  a=200;   ---> static final oldugundan modify edemezsin !!!


    }


}
