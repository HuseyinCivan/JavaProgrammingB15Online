package repl;

import java.util.Arrays;

public class Repl_171 {

        //Given a 8x8 two-dimensional array of strings named chessboard.
        // Initialize values inside an array accordingly to the chess board.
        // So first element in the array, chessboard[0][0] should have a value "1a",
        // and last element in the array, chessboard[7][7] should have a value "8h".
        public static void main(String[] args) {
            String[][] chessBoard = new String[8][8];
            //WRITE YOUR CODE HERE
            for(int x=0;x<8;x++){
                int z=0;
                for(char y='a';y<='h';y++){

                    chessBoard[x][z]=""+(x+1)+y;
                    z++;
                }
            }
            //DO NOT CHANGE
            System.out.println(Arrays.deepToString(chessBoard));
        }
}


