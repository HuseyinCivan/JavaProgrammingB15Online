package repl;

import java.util.Scanner;

public class Repl_172 {
    //1 2 3
    //4 5 6
    //7 8 9
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
        };
        int result = 0;

   //    result=( matrix[0][0]+matrix[1][1]+matrix[2][2] )-( matrix[0][2]+matrix[1][1]+matrix[2][0] );
        int cross1=0;
        int cross2=0;

        for (int x = 0; x <matrix.length ; x++) {

                cross1+=matrix[x][x];
                cross2+=matrix[x][matrix.length-1-x];

        }
        result=cross1-cross2;



        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}
