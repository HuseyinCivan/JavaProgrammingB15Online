package day25;

public class CheckArrayIsSortedOrNot2 {
    public static void main(String[] args) {

       // int[] nums={13,31,8,5,21,2}   ;
        int[] nums={1,2,3,4,5,6}   ;

         // create a variable called isSortedAlready and assign value of true;
        // assume the array is already sorted
        //and if it is not then i change the value of isSortedAlready to false

      boolean isSortedAlready =true;

        for(int x=0;x<=nums.length-2;x++) {
          System.out.println(" is "+nums[x] + " less than " + nums[x + 1]  + " ? "+ ( nums[x]<nums[x+1]   )      );

if (  ! (nums[x]<nums[x+1])    ){
    System.out.println("ARRAY IS NOT SORTED , NO POINT CHECKING THE REST ");
    isSortedAlready=false;
    break;
}

            }

        System.out.println(isSortedAlready);



        }


    }

