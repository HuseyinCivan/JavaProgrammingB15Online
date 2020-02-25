package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArayListParameter {
    public static void main(String[] args) {

       List<String> nameLst =new ArrayList<String>();

        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");


        printAList(nameLst);
        System.out.println("____________________");

        System.out.println(getLOngestElement(nameLst));

    }


   //create a method that accept a List of String as argument
   //same thing as a method that has List of String parameter
   //and print out each and every item in the list vertically
   //return nothing

    /**
     *this method will print out the content of passed List object vertically
     * @param lst of String
     * @retun nothing
     */
   public static void printAList ( List<String> lst ){
       for (String each : lst) {
           System.out.println("each = " + each);

       }
   }
public static String getLOngestElement(List<String> nameLst){
    String longestName="";
    for (int x = 0; x <  nameLst.size(); x++) {
        if(nameLst.get(x).length()>=longestName.length()){
            //> will give you first longest name if you have more than one
            //>= will give you last longest name if you have more than one

            longestName=nameLst.get(x);
        }

    }


       return longestName;
}


}
