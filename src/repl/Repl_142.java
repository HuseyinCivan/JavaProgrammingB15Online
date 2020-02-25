package repl;

import java.util.Scanner;

public class Repl_142 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows


        //TODO write your code below


        int max=arr[0][0];

        for(int x=0; x<arr.length ;x++    ){
            for(int y=0 ; y<arr[x].length ; y++){
                if(arr[x][y]>max){
                    max=arr[x][y];
                }
            }
        }
        System.out.println(max);






    }//end main
}
