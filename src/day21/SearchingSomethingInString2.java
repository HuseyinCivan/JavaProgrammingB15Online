package day21;

public class SearchingSomethingInString2 {
    public static void main(String[] args) {

      // looking two char in string

      // looking <an> on the string

      String name="Hasan Mammadov";

      for (int x=0;x<=name.length()-2;x++){

          String twoChar=name.substring(x,x+2);

          if(twoChar.equalsIgnoreCase("ma")){

              System.out.println("the index of < > is "+x);

          }

      }
// find the location of a or n in the sentence





    }
}
