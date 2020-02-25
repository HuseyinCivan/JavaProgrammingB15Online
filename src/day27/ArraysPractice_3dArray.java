package day27;

import java.util.Arrays;

public class ArraysPractice_3dArray {
    public static void main(String[] args) {
        int [][][] arr3D={ { {1,2,3}  ,{4,5,6}  } , {  {7,8,9},{10,11,12}   }  };

        for (int x = 0; x <arr3D.length ; x++) {   // each index of 2d array
            for (int y = 0; y < arr3D[x].length ; y++) {   // each index number of 1d array
                for (int z = 0; z <arr3D[x][y].length ; z++) { //index number of the values

                    System.out.print(arr3D[x][y][z]+" ");
                }
            }

        }
        System.out.println();
        System.out.println(    Arrays.deepToString(arr3D).replace("[","").replace("]","").replace(",","")       );













    }
}
