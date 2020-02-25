package day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays_Practice {
    public static void main(String[] args) {

        // N dimensional Arrays MUST contain N-1 dimensional arrays

        // 2 dimensional Arrays MUST contain 1 dimensional arrays//
        //                              0                   1
        String[][] names = {{"Rukhshona", "Ghoya"}, {"Hasan", "Tetiana"}};
        //                      0           1           0        1
        // print Hasan
        System.out.println(names[1][0]);

        System.out.println(names[1][1]);

        names[1][1] = "Dilshat";
        System.out.println(names[1][1]);

        // print Hasan  Dilshat
        System.out.println(Arrays.toString(names[1]));

        System.out.println(Arrays.deepToString(names));

        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12, 13}};
        System.out.println(Arrays.toString(numbers[1]));
        System.out.println("____________________________________");

        for (int i = 0; i < numbers.length; i++) {  // check each index of two dimensional array
            //System.out.println(Arrays.toString(numbers[i]));

            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println(Arrays.deepToString(numbers));


        System.out.println("=========================================================");

        // print out entire even numbers

        for (int x = 0; x < numbers.length; x++) {
            for (int y = 0; y < numbers[x].length; y++) {
                if (numbers[x][y] % 2 == 0) {
                    System.out.print(numbers[x][y] + " ");
                }
            }

        }

        int[][] ages = {  {10}, {12, 13, 14, 16, 17},{19, 20, 21, 22, 23} } ;

            for (int x = 0; x < ages.length; x++) {
                for (int y = 0; y < ages[x].length; y++) {
                    if (ages[x][y] % 2 == 0) {
                        System.out.print(ages[x][y] + " ");
                    }
                }

            }
        System.out.println();
        System.out.println("______________________________________");

            int [] arr1D={1,2,3};
        System.out.println();
        for (int each : arr1D) {
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("______________________________________");

        int [][]arr2D={ {10,20,30},{40,50,60,70,80,90,100}  };

        for (int[] each1DArray : arr2D) {
           // System.out.println(Arrays.toString(each1DArray));

           for (int eachNum : each1DArray) {
               System.out.print(eachNum+" ");


           }

            }

        }


    }

