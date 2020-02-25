package repl;

import java.util.ArrayList;

public class Repl_211 {

    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel)
    {
        int sum=0;
        for(int x=0; x<deliveries.size(); x++     ){
            sum+=deliveries.get(x);
        }
        return (sum%max_fuel==0)? sum/max_fuel:sum/max_fuel+1;
    }

    public static void main(String[] args)
    {

        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr,3);
        System.out.print(times);//should output 5


    }//end main
}




