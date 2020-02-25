package day22;

public class ArrayIntro {
    public static void main(String[] args) {

  // syntax for creating a variable to store single item and assigning value
  // dataType variableName= value here
  //
 //
  //


   // this array can hold 4 items, it is also known as array size
   int[] scores=new int[4];

   scores[0]=95;
   scores[1]=70;
   scores[2]=88;
   scores[3]=100;

        System.out.println(  scores[0]     );
        System.out.println(  scores[1]     );
        System.out.println(  scores[2]     );
        System.out.println(  scores[3]     );


        //create a byte array with size 4
        // store it into a variable called data

        //assign value for each index location
        //print out the values at each index

        //update last indx value
        //then prnt it out
        System.out.println("____________________________");

        byte[] data=new byte[4];

      data[0]=10;
      data[1]=25;
      data[2]=99;
      data[3]=-40;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
        System.out.println("____________________________");
        data[3]=45;
        System.out.println(data[3]);










    }
}
