package day52.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {
    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();

        accountList.add(new Account("Jon Snow",10000));
        accountList.add(new Account("Vlad",11000));
        accountList.add(new Account("Svetlana",13000));
        accountList.add(new Account("Muhammed",8000));
        accountList.add(new Account("Emme",17000));
        accountList.add(new Account("Ata",15000));

        System.out.println("accountList before  = \n " + accountList);
        Collections.sort(accountList);
        System.out.println("accountList after = " + accountList);

        // create another account with your name :
        //transfer everyone's money to your account


        Account huseyinAccount= new Account("Huseyin",0);

        for (int x = 0; x < accountList.size() ; x++) {
            accountList.get(x).transferAll(huseyinAccount);

        }
        System.out.println("------------------");
        System.out.println("huseyinAccount = " + huseyinAccount);
        System.out.println("---------------");
        System.out.println("accountList = " + accountList);


        // what can be the data type of a1

        //Account a1;
        //Comparable a1;
        //Transferable a1;
        //Object a1

        //An object can be refered by

        //it's own type
        //it's super class type
        //inheritance type that it implemented

        Account a1 = new Account("Polymorphism1",10000);
        Transferable t1 = new Account("Polymorphism2",10000);
        Object o1 = new Account("Polymorphism3",10000);










    }


}
