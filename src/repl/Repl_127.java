package repl;
import java.util.*;
public class Repl_127 {
    public static void main(String[] args) {
//[3, 6, 0, 4, 3, 2, 7, 1]
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line. 
// looking to find max populated city
        int indexOfMax=0;
        for(int x=0;x<inhabitants.length;x++) {
            if (inhabitants[x] > inhabitants[indexOfMax]) {
                indexOfMax = x;
            }
        }
        System.out.println("Day " + 0 + " " + Arrays.toString(inhabitants));
        //
        for (int y = 1; inhabitants[indexOfMax]!=0 ; y++) {
                for (int z = 0; z < inhabitants.length; z++) {
                    inhabitants[z] = inhabitants[z] / 2;
                    }
                System.out.println("Day " + y + " " + Arrays.toString(inhabitants));
                }
        System.out.println("---- EXTINCT ----");
            }
    }

