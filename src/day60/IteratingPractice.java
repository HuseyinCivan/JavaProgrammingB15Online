package day60;

import java.util.*;

public class IteratingPractice {
    public static void main(String[] args) {

        Collection<Integer> nums= new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println("nums = " + nums);

        for (Integer eachNum : nums) {
            System.out.println("eachNum = " + eachNum);
        }
        System.out.println("_______________________________________________");
        
        List<Integer> numsList=(List) nums;

        for (int x = 0; x < numsList.size() ; x++) {
            System.out.println("numsList.get(x) = " + numsList.get(x));
        }

        System.out.println("_______________________________________________");


        Iterator<Integer> iterated= nums.iterator();

//        for (; iterated.hasNext() ;) {
//            System.out.println("iterated.next() = " + iterated.next());
//        }

        while(iterated.hasNext()){
            //System.out.println("iterated.next() = " + iterated.next());
            if(iterated.next()>5){
                iterated.remove();
            }

        }
        System.out.println("nums = " + nums);







    }
}
