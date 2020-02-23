package office_hour;
class Test{

    public Test(){
        System.out.println("Hola");
    }

    public Test(String str){
        System.out.println(str);
    }
    public Test(int a){
        this(); //constructor cagirmak icin this() kullanilir!!!
       // this("abc");   -> sadece 1 tane constructor cagirilabilir !!   en ustte olacak tek olan da!!
        System.out.println("Hello");
    }
    //constructor can not overriden
    //can be overloaded
    public static void main(String[] args) {
    Test obj=new Test(10);

    }

}



public class Practice_01_27_This_Super_Keyword {



    int a=100;

    public void method1(){

        System.out.println(this.a);

        //this();
        //this() use to call constructor

        //this() & super () rules;
        //  1 only constructor call another constructor



    }
    //object instances : constructor , iinstance variables and instance methods
    //this keyword .........



public void method2(){
 this.method1();
}

    public static void main(String[] args) {
       // this.a     there is no object instance in static method !!!

    //    System.out.println(Practice_01_27_This_Super_Keyword.a);   a is not static !!! error

        Practice_01_27_This_Super_Keyword obj=new Practice_01_27_This_Super_Keyword();
        System.out.println(obj.a);


    }



}
