package muhtar_Java.abstraction;

public interface Interface_VS_AbstractClass {

//    public Interface_VS_AbstractClass(){
//        //can not have constructor
//    }
//    public void m(){
//        // can not !
//    }

    public abstract void method1();

    public abstract int method2();

    void method3();   //---> public abstract

    void method4();

    public default void mm() {
        //predicate
    }

   // abstract void method5();

    int a=10;   // public final  static int a=10;
    // final static int a;
    //

    public static void main(String[] args) {
        System.out.println(a);   //static only accepts static
        System.out.println(Interface_VS_AbstractClass.a);
    }
// can you call it through the object --> no ! you can not . interface is not a class -- abstraction is not concrete, object has to be concrete



}
class Test2 implements Interface_VS_AbstractClass{


    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void mm() {

    }

}
