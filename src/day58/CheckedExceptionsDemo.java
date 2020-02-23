package day58;

public class CheckedExceptionsDemo {
    public static void main(String[] args) {
        System.out.println("checked exception in next line ");
        try {
            Thread.sleep(4000);
            System.out.println("Thread.sleep");
        }catch (Exception e){
            System.out.println("catched");
        }

    }




}
