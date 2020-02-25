package office_hour;
import java.util.Scanner;
public class Practice_11_20 {
    //scanner issue
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("what is your age?");
        int age =scan.nextInt();

        scan.nextLine();  //this is just to capture enter
        //if you need to make this program run without an issue, enter age and name on same line
        System.out.println("what is your full name?");
        String fullname=scan.nextLine();

        System.out.println("your name is "+fullname+" , your age is "+age);









    }
}
