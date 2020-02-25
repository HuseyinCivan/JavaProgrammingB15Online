package day44;

//what is inherited from superclass
//fields and methods that visible to the sub class are inherited
//constructors ar not inherited



public class Train extends Vehicle{

//    String make;
//    int year;
      int wagonCount;

      public void makeChoChoSound(){
          System.out.println("CHOOO CHOOO ");
      }

    public static void main(String[] args) {

          Train t1=new Train();
          t1.makeChoChoSound();
          //these attributes we got from vehicle
          t1.make="Thomas";
        //  t1.year=1999;
       // System.out.println("t1.year = " + t1.year);
        //calling the meyhod we got from Vehicle
        t1.start();
        t1.goForward();
















    }





}
