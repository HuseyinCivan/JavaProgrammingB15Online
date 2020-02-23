package day46;

public class SavingAccount extends BankAccount{



    //    String accountHolder;
    //    long accountNum;
    //    double balance;
    double interestRate;

    /***
     *
     * @param accountHolder
     * @param accountNum
     * @param balance
     * @param interestRate
     */
    public SavingAccount(String accountHolder,long accountNum,double balance,double interestRate){
        super(accountHolder,accountNum,balance);
        this.interestRate=interestRate;
    }
    //in our SavingAcoount , if we withdraw amount you withdraw
    //you get 30$ penalty
    //so we will override the withdraw method to reflect this requirement
@Override
    public void withdraw(int amount){
        super.withdraw(amount);   //super.withdraw(amount+30);
        super.withdraw(30);
        //balance-=30;

       //balance=balance-amount-30;


    }
    //override deposit method
    //in saving account , every depisit you make you will get interest added
    //according to your interest rate
    //if you deposit 100$  your interest rate is 4.2 /100  then
    //your actual balance will increase with added interest

    @Override
    public void deposit(int amount){
        super.deposit(amount);
        balance+=amount*(interestRate/100);
    }









    @Override  // its optional , onece being used, it will enforce overriding rule
                //if any rule does not match it will not even compile
                //so it is always good to use it to prevent accidental errors

    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }

    //BAD IDEA TO HAVE MAIN HERE !! NORMALLY DON'T COOK ON YOUR RECEIPT !!!
    public static void main(String[] args) {

        SavingAccount s1 = new SavingAccount("Seda", 123456789, 50000, 8.9) ;
        System.out.println("s1 = " + s1);

        s1.withdraw(10000);
        System.out.println("s1 = " + s1);

        s1.deposit(10000);
        System.out.println("s1 = " + s1);












    }
}
