package day59;

public class FinallyBlock {
    public static void main(String[] args) {


        //in some cases we want to run certain code
        //no matter exception or not
        //as part of try catch


        int[] nums={1,4,6};

        try {
            System.out.println("nums[100] = " + nums[100]);
            // This is exactly what happen when above code get executed

            // an ArrayIndexOutOfBoundsException object is created and thrown to the runtime system

//             throw new ArrayIndexOutOfBoundsException("Index 100 out of bounds for length 3");
        }catch (Exception e){
            System.out.println("Exception caught \n"+e.getMessage());
        }finally {
            System.out.println("THIS CODE WILL ALWAYS RUN NO MATTER WE HAVE EXCEPTION OR NOT ");
        }


        System.out.println("THE END ");

    }
}
