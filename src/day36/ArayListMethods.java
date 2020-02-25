package day36;

import java.util.ArrayList;

public class ArayListMethods {
    public static void main(String[] args) {

        //cretae a ArrayList object of long and assign in to a varable

        ArrayList<Long> lst= new ArrayList<>();

        //C.R.U.D.

        //add item ,insert an item,  read item, update item, remove the item, check the location ...

        lst.add(  12L  ); //12L is automatically converted to new Long(12L) : because Arraylist only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);

        System.out.println(lst);

        //counting items inside arrayList

        System.out.println("ArrayList size "+lst.size());

        //getting items inside ArrayList object
        System.out.println("first item is : list.get(0) = " + lst.get(0));

        //task
        //get the sum of above arraylist items

        long sum=0;
        for (int x = 0; x < lst.size() ; x++) {
            sum=sum+  lst.get(x);

        }
        System.out.println("sum = " + sum);
        sum=0;

        for (Long aLong : lst) {
            sum+=aLong;

        }
        System.out.println("sum = " + sum);

        //get the max of above ARRAYlist items

        long max=lst.get(0);
        for (int x = 0; x <lst.size() ; x++) {
            if(lst.get(x)>max);
            max=lst.get(x);

        }






    }
}
