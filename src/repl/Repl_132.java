package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_132 {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
                float[] score = new float[7];
                //WRITE YOUR CODE HERE
                for(int x=1;x<=7;x++){
                    System.out.println("Enter score for judge "+x+":");
                    score[x-1]=input.nextFloat();
                }
                System.out.println("Enter difficulty:");
                float difficulty;
                difficulty=input.nextFloat();
                float sumWithoutDif=0;

                Arrays.sort(score);
                for(int x=1;x<score.length-1;x++){
                    sumWithoutDif=sumWithoutDif+score[x];
                }
                float sum=sumWithoutDif*difficulty;
                double total= (sum*0.6);

                // FINAL OUTPUT
                System.out.printf("Total: %.2f", total);
            }
        }


