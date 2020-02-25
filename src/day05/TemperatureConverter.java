package day05;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("What is the temperature in F ? : ");

        double fahrenheit=scan.nextDouble();
        double celcius= (fahrenheit-32)*(5.0/9);

        System.out.println(fahrenheit+ " F is "+celcius+ " C ");
        System.out.println("The temperature is "+celcius+ " in Celcius");











    }
}
