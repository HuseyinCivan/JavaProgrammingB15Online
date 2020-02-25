package day21;

public class LoopControlStatement {
    public static void main(String[] args) {

        // break
        // if line contains break the loop will stop !!!

//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(i);
//            break;
//
//        }
// while iterating over 1 to 10;
        // break out of the loop when it's 5

//        for (int i = 1; i <10 ; i++) {
//            System.out.println(i);
//            if(i==5){
//                break;
//            }
//
//        }
        int sum = 0;
        for (int x = 1; x <= 10; x++) {

            if (sum+x >= 12) {
                break;
            }
            sum = sum + x;
            System.out.println("sum = " + sum);



            //WE CAN USE break and continue for any type of loop;
//

        }

        //continue
        // if line contains continue the loop will skip to next iteration !!!

        //WE CAN USE break and continue for any type of loop;


    }
}
