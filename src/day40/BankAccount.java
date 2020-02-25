package day40;

public class BankAccount {

    String accountType;
    String accountHolder;
    long accountNumber;
    double balance;

    //setAllTheValue
    public void setAllTheValue(String newAccountType,String newAccountHolder, long newAccountNumber, double newBalance){
        accountType=newAccountType;
        accountHolder=newAccountHolder;
        accountNumber=newAccountNumber;
        balance=newBalance;
    }


    //showAccountBalance
        public void showAccountBalance(){
        System.out.println("current balance = " + balance);
    }

    //showAccountHolderAccountType
        public void accountHolderAccountType(){
            System.out.println("accountType = " + accountType);
        }


        //getBalance  -return the balance
    public double getBalance(){
        //after doing a lot of validation to make sure you have correct credential to view the balance
        return balance;
    }


    //deposit (+amount)
    public void deposit(double amount){
        balance+=amount;
    }


    //withdraw (-amount)
    public void withdraw(double amount){
        balance-=amount;
    }

    //withdraw100$Cash
    public void withdraw100$Cash(){
        withdraw(100);  //reusing the functionalituy we already have
    }

    //purchaseProduct( productPrice,count)
    public void purchaseProduct(double productPrice,int count){
        double totalPrice = productPrice * count;
        balance-=totalPrice;
        // withdraw(totalPrice);
    }

    //toString


    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
