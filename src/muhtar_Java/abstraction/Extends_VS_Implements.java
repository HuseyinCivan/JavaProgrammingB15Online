package muhtar_Java.abstraction;

interface B{
    void method3();
}

public interface Extends_VS_Implements extends B {  // bir interface e baska bir interface sadece   EXTENDS olur. implement degil !!!
    //                 subtype                superType
    void method1();
    void method2();

//void method3();   ---> extended from interface B





}
 class A implements Extends_VS_Implements {


    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

     @Override
     public void method3() {

     }

     class C extends A implements B, Extends_VS_Implements{

     }


 }
