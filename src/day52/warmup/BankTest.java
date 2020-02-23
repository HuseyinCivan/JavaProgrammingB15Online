package day52.warmup;

public class BankTest {
    public static void main(String[] args) {


        Account a1 = new Account("John snow", 10000);
        Account a2 = new Account("Hannah", 10000);

        System.out.println("a1 before = " + a1);
        System.out.println("a2 before = " + a2);

        a1.transferAll(a2);

        System.out.println("------------------");

        System.out.println("a1 after = " + a1);
        System.out.println("a2 after = " + a2);

        a1.deposit(50000);
        a1.withdraw(10000);

        System.out.println("a1 after deposit and withdraw = " + a1);

        a2.transferAll(a1);
        System.out.println("------------------");
        System.out.println("a1 after new transfer = " + a1);
        System.out.println("a2 after new transfer = " + a2);

        System.out.println("------------------");

        System.out.println("is a2 name palindrome = " + a2.isPalindrome());
        System.out.println("is a1 name palindrome = " + a1.isPalindrome());



    }
}
