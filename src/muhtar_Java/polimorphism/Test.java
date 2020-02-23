package muhtar_Java.polimorphism;

abstract class AbstractClass{

    public static void ByLinkText(){
        System.out.println("Link Test Super");
    }

    public void get(){
        System.out.println("Chrome");
    }




}


public class Test extends AbstractClass {

    public static void ByLinkText(int a){
        System.out.println("Link Test Sub");
    }


    public static void Test(){

    }
    public  void get(){
        System.out.println("Fire Fox");

    }
    public static void main(String[] args) {

       // AbstractClass obj=new AbstractClass();  --> we can not create obj from abstract class

       AbstractClass obj=new Test();


        AbstractClass obj2= new Test();
        obj.ByLinkText();
        obj.get();

        Test obj3= new Test();
        obj3.ByLinkText(10);
        obj3.ByLinkText();











    }

}
