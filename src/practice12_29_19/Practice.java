package practice12_29_19;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {


   //create a method called twoDPrinter
   //accept one 2d int array object as parameter
   //and print them all out in excel like row and column

       // create a method called get2DArray
        //accept 2 int as parameters, row,col
        //return 2d array object in below logic:

        //get2DArray(2,3)-->{ {1,2,3},{ 1,2,3 }  };


        //
        int[][] arr123={  {1,2,3},  {9,8,7}  };

        twoDPrinter(    arr123    );
        System.out.println("_____________________");

        int row=3;
        int col=3;

        int[][] arrRowCol=get2DArray(row,col);
        System.out.println(Arrays.deepToString(arrRowCol));



    }
    public static void twoDPrinter(int[][] arr){
//        for (int x = 0; x < arr.length; x++) {
////            for (int y = 0; y <arr[x].length ; y++) {
////                System.out.print(arr[x][y]+" ");
////
////            }
        for (int[] each1 : arr) {
            for(int each2   : each1   ){
                System.out.print(each2);

        }
            System.out.println();
        }

    }
    // create a method called get2DArray
    //accept 2 int as parameters, row,col
    //return 2d array object in below logic:

    //get2DArray(2,3)-->{ {1,2,3},{ 1,2,3 }  };

    public static int[][] get2DArray( int row,int col    ){
        int[][] get2DArr=new int[row][col];
        for(int x=0;x<row;x++){
            for (int y=0;y<col;y++){
                get2DArr[x][y]=y+1;
            }
        }

        return get2DArr;
    }



}
