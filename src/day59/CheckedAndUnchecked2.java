package day59;

import java.io.IOException;

public class CheckedAndUnchecked2 {

    //checked exception must be handed or declared
    //handled --> try catch
    //declare--> add it to the method signature to document
    public static void main(String[] args) throws IOException, InterruptedException {
        String x="abc";
        System.out.println("START");

//       try {
        //    throw new IOException("Just throwing this away");
        Thread.sleep(3000);

        System.out.println("End");
//        } catch (IOException e) {
 //          System.out.println("Exception caught");
 //     }

    }
}
