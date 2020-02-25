package day41;


import day40.BankAccount;

public class AccessModifierIntro {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();

        //what is default access mofifier
        //if there is no access modifier
        //in front or field
        //it means it has default access modifier
        //this will make the method of the field
        //only accesible within the same package
        b1.showAccountBalance();
        System.out.println("b1 = " + b1);

        //the bank account instance field from day40
        //does not have any access modifier
        //so it means it has default access modifier

      // b1.balance=1000;

        //access modifier can be used for fileds and methods, there are 4 of them
        //currently we care about of 3:
        //public ---> accessible anywhere
        //(default)---> accessible only withn the same class
        //private----> accessible only within the same class

        Person p1=new Person();
//        p1.name="Hasan";
//        p1.age=19;
//        p1.ssn=123456789;
        p1.setAll("Hasan",34,123456789);
        System.out.println("p1 = " + p1);
        System.out.println(p1.getName());

        p1.setName("Emma");
        System.out.println("p1.getName() = " + p1.getName());

        p1.setAge(21);
        int emmaAge=p1.getAge();
        System.out.println("emmaAge = " + emmaAge);


        System.out.println("p1 = " + p1);



    }
}
