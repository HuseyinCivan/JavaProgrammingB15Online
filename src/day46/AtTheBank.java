package day46;

import day45.CheckingAccount;

import java.lang.reflect.Array;

public class AtTheBank {
    public static void main(String[] args) {


        CheckingAccount acc1=new CheckingAccount("Seda",123456,10000);
        acc1.deposit(100);
        System.out.println("acc1 = " + acc1);
        acc1.deposit(5000); // it gives us additional 200 by requirement
        System.out.println("acc1 = " + acc1);
        acc1.withdraw(5300);
        System.out.println("acc1 = " + acc1);








    }

}
