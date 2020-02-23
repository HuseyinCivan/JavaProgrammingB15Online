package office_hour.feb_13_2020;

public class ExceptionPractice_Throws {
    public static void main(String[] args) throws Exception {

        Thread.sleep(4000);


        System.out.println("Step 3");

        System.out.println("Step 4");

        Thread.sleep(4000);

        System.out.println("Step 5");


    }

    public static void method() throws Exception {
        main(new String[]{"A"});

    }

    public static void method2(){
        try{
            method();
        }catch (Exception e){

        }

    }

    public static void method3() throws Exception {
        method();
    }


}
