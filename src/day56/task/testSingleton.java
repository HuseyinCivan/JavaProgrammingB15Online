package day56.task;

public class testSingleton {
    public static void main(String[] args) {


        Singleton2 s1=Singleton2.getInstance();
        Singleton2 s2=Singleton2.getInstance();
        Singleton2 s3=Singleton2.getInstance();
        Singleton2 s4=Singleton2.getInstance();
        Singleton2 s5=Singleton2.getInstance();

        System.out.println("(s1==s2) = " + (s1==s2));
        System.out.println("(s2==s3) = " + (s2==s3));
        System.out.println("(s3==s4) = " + (s3==s4));
        System.out.println("(s4==s1) = " + (s4==s1));
        System.out.println("(s5==s4) = " + (s5==s4));






    }
}
