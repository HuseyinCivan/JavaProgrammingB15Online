package repl;

import java.util.ArrayList;

public class Repl_201 {
    public static void main(String[] args) {
//<[1, 4, 6, 7, 18]>


    }
    public static ArrayList<Integer> appendPosSum ( ArrayList<Integer> nums  ){

        ArrayList<Integer> newNums=new ArrayList<>();

        int sum=0;
        //int newIndex=0;

        for(int x=0; x<nums.size(); x++){
            if(nums.get(x)>0){
                newNums.add(nums.get(x));

                sum += nums.get(x);
            }
        }
        newNums.add(sum);

        return newNums;

    }

}