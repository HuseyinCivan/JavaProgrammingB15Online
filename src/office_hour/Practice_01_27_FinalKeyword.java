package office_hour;

class data {

    private String password="123456";   // final keyword verirsen setPasword hata verir !

    public String getPassword(){
        return getPassword();
    }
    public void setPassword(String password){
        this.password=password;
    }
  public void printName(){          //final yaparsan override olmaz!
        System.out.println("Hasan");
    }

    public final int printName(int a){
        return 10;
    }
}


public class Practice_01_27_FinalKeyword extends data {
   final int a=200; // final keyword de hemen degeri atamazsan hata verir
   final static double b=100;   // final keyword de hemen degeri atamazsan hata verir
@Override
    public void printName(){
        System.out.println("Mohammed");
    }


    public final static void main(String[] args) {    //can not be overriden!! because it is static-----override olmasi icin subclass da olmasi gerekir.. static metodlar extend olmaz !!
     final  int num;  // cagirilincaya kadar hata vermez,
       // num=300;
      //  System.out.println(num);  local variable da final kullandiysan cagirdigin zaman hata verir

        System.out.println(b);    //you can print static variable
      //  System.out.println(a); local variable must be intialized to print





    }




}
