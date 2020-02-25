package day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays {
    public static void main(String[] args) {

    /*
    Single dimensional array = contains values
    int [] = { 1,2,3};

    Multi dimensional array = an Array that can contain another array(s)
                                N dimensional Array contains (N-1) dimensional arrays
                              ex= 2 dimensional array : contains 1 dimensional arrays
                                  int[][] arr2D = {  {1,2,3} , { 4,5,6}         }
     */

    int[] arr1D={1,2,3};

    //arr1D[1] ===> 2
        //[index number of elemets]


    //2D array = is an array that contains single dimensional arrays

        int [][] arr2D={  {1,2,3} , {4,5,6,}       };
        //index :            0         1
        // arr2D[0] ====> {1,2,3}

        // [index num of 1D arrays] [ index of elements ]


        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));



        System.out.println( arr2D[0][2]);

        System.out.println(Arrays.toString(arr2D[1])   );  // Arrays.toString is only applicable to single dimensional arrays

        // Arrays.deepToString ( multi-D Arrays

        System.out.println(Arrays.deepToString(arr2D));











    }

}
