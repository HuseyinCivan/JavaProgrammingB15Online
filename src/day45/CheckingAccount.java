package day45;

import day46.BankAccount;

public class CheckingAccount extends BankAccount {
    // no additional field in checking account lets assume

    //    String accountHolder;
    //    long accountNum;
    //    double balance;


    @Override
    public String toString() {
        return super.toString();
    }

    public CheckingAccount(String accountHolder, long accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    //this awesome bank account will give you 200$ if you deposit 3000$


    @Override
    public void deposit(int amount) {
        if(amount>=3000){
            super.deposit(amount+200);
        }else{
            super.deposit(amount);
        }
    }

}
