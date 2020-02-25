package repl;

public class Repl_150 {
    public static void printHollowRect() {
//Instructions from your teacher:
//Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
//
//
//*****
//*   *
//*   *
//*   *
//*****
//
//hint:you will need to use two nested for loops for that,
// and an if that checks if its the last or first iteration of the loop
// (so you will know whet to print "*" or " ")
        for (int x = 1; x <= 5; x++) {
            String hollow = "*";
            String space = " ";
            for (int y = 1; y <= 5; y++) {
                if (x == 1 || x == 5) {
                    System.out.print(hollow);

                }else if( (x>1&&x<5) && (y==1||y==5    )   ){
                    System.out.print(hollow);

                }else if((x>1&&x<5) && (y!=1||y!=5    )){
                    System.out.print(space);

                }

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        printHollowRect();
    }


}