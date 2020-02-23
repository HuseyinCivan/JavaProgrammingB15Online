package day46;

public class BankAccount {
    String accountHolder;
    long accountNum;
    double balance;

    //always add no arg constructor in suer class
    //to avoid in error in sub class
    public BankAccount(){

    }

    public BankAccount(String accountHolder,long accountNumber,double balance){
        //super();
        this.accountHolder=accountHolder;
        this.accountNum=accountNumber;
        this.balance=balance;
    }



    public void withdraw(int amount){
        balance-=amount;
    }

    public void deposit(int amount){
        balance += amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
