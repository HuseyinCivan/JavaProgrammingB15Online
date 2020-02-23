package day48;

public class Company {
    public static void main(String[] args) {
        HourlyEmployee h1 = new HourlyEmployee("Huseyin", 123456, 60, 2080);
        h1.calculateAnnualSalary();
        System.out.println("h1 = " + h1.toString());


        FullTimeEmployee s1 = new FullTimeEmployee("Seda", 654321, 10000);
        s1.calculateAnnualSalary();
        System.out.println("s1.toString() = " + s1.toString());

//each and every class we create, it will become a data type ( reference type )


    }
}
