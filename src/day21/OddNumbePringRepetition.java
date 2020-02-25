package day21;

class OddNumbePrintRepetition {
    public static void main(String[] args) {
        /*
* // count from 1 to 10 --> print only odd numbers
*
 // repeat this 4 times
* */

        for (int i = 0; i <=4 ; i++) {
            System.out.println("iteration :"+i);
            for (int x =1; x <10 ; x++) {
                if(x%2==0) {
                    continue;
                }else{
                    System.out.print (x+" ");
                }
            }
            System.out.println();
        }

    }
}
