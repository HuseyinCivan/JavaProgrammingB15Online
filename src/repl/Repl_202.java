package repl;

import java.util.ArrayList;

public class Repl_202 {
    public static void main(String[] args) {




    }
    public static void timesTwo(ArrayList<Integer> nums){
        for(int x=0 ; x< nums.size() ; x++){
            nums.set(x,nums.get(x)*2);

        }
        System.out.println(nums);
    }


}
