package day57;

public class ExceptionExample {

    public static void main(String[] args) {

        System.out.println("Hello B15 in Class Friends");
        //int num = 2.5; COMPILE ERROR
        int[] nums = new int[3];
        nums[0] = 55;
        nums[1] = 56;
        nums[2] = 100;
        //nums[3] = 200;
// System.out.println("BYE BYE B15 in Class Friends");
        int result = 10 / 0;
    }
}
