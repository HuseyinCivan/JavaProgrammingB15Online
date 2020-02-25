package day24;

import java.util.Arrays;

public class ArraysMethodSorting {
    public static void main(String[] args) {

   int[] scores={99,44,66,23,19,55};

        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));
        System.out.println("_____________________char_______________________________________________");
        char[] nameChars = {'G',' ','d','Z','9','A'};
        System.out.println("before sorting nameChars = " + Arrays.toString(nameChars) );
        Arrays.sort(nameChars);
        System.out.println("after sorting nameChars = " + Arrays.toString(nameChars) );

        System.out.println("_____________________String_______________________________________________");

        String[] superHeroes ={"Superman","Batman","Wonder Woman","Aquaman","Cyborg","Flash","100","9","09"} ;
        System.out.println(" before sorting = " + Arrays.toString(superHeroes));
// only first character matter when sorting a string ...alphabetically

        Arrays.sort(superHeroes);
        System.out.println("After sorting  = " + Arrays.toString(superHeroes));


        System.out.println("_______________________Boolean_____________SORT METHOD NOT WORK FOR BOOLEAN ARRAY___________________");

        boolean[] fiveSwitchOnOffs={true,false,false,true,true};
        System.out.println("before"+Arrays.toString(fiveSwitchOnOffs));
      //  Arrays.sort(fiveSwitchOnOffs);  does not work for boolean



// Arrays.sort(arrObj) does not return a value that we can store
        // it only takes action to reshuffle the index of original array object to keep it in sorted order




    }
}
