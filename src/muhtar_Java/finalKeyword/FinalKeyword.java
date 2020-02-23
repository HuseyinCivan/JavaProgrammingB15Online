package muhtar_Java.finalKeyword;

class Credentials{
    private String userName="cybertek";
    private final String password="Batch12";

    public String getUserName(){
        return userName;                // final variables can use get method

    //public void setUserName(String userName){    //final oldugu icin set metoduyla degistiremezsin !!!
        //this.userName=userName;        //final variables can not re assigned

    }


}



class Holly{
   final public void printName(){
       System.out.println("Erhan");
   }

}


public class FinalKeyword extends Holly {

   // @Override
//    public void printName(){                  final methods cannot be override  //
////        System.out.println("Medina");
////    }

    //instance variable  and static variable
  // final int age;   // you have to assign value immediately in instance field
    final int age=18;




    public static void main(String[] args) {
        final String SSN="123456";
       // SSN="654321";    final variables are constant and can not be reassigned
        System.out.println(SSN);

      final String DateOfBirth;           // you have to assign it before use it !!!
        // System.out.println(DateOfBirth);  //

        // in local variables you have to assign it before use it
        //in instance variable you dont have to assign t before you use it

        FinalKeyword obj=new FinalKeyword();
        System.out.println(obj.age);




    }

    private final static void add(int a,int b){
        System.out.println(a+b);
    }
    public static double add(double x, double y){
        return x+y;
    }



}
