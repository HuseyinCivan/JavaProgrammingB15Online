package day28;

import java.util.Arrays;

public class ExcellVisualizer2 {
    public static void main(String[] args) {

        int[][] myExcel={ {  10,27,88,99   },   // this is first 1d array
                            { 87,100   },       //this is second 1d arra
                            { 90,45,65 }        // this is third 1d array
                            } ;   // this is the ending of teh 2d array object

        // what does deepToString method do :
        // it takes an multiD array and turn it into a String with all items,
        // what external data do we provide;
        // the miltiD aarray object or the multiD array variable
        //what do i get out of it --------------> string representation of multiD array object
       // System.out.println(Arrays.deepToString(myExcel));

        for( int[] eachRow    :myExcel     ){
            //System.out.println(Arrays.toString(eachRow));
for (int eachCell : eachRow ){
    System.out.print(eachCell+" ");
}
            System.out.println();
        }



















    }
}
