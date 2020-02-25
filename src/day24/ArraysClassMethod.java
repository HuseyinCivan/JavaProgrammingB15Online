package day24;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {

     //Arrays class a coming from java.util package
     //it is a lot of pre built method to work with array object

     // for printing the content of array
     //toString -----> Arrays.toString(yourArrayHere)
        // this method will give you string representation of any type of array
        // the result will look ---> [ item1,item2,item3........lastItem]
     String[] superHeroes ={"Superman","Batman","Wonder Woman","Aquaman","Cyborg","Flash"} ;

       // System.out.println(superHero);
        System.out.println(Arrays.toString(superHeroes));

        String savingSuperHeroesAsString=Arrays.toString(superHeroes);
        System.out.println("superHeroesAsString = " + savingSuperHeroesAsString);

        System.out.println(savingSuperHeroesAsString.charAt(0));
        System.out.println("__________________________________");

int[] numbers={10,44,55,3,78};
        System.out.println(Arrays.toString(numbers));

        System.out.println("__________________________________");
        System.out.println("__________________________________");
        System.out.println("__________________________________");


        double[] prices={10.5,14,99,89,14};
        String pricesString=Arrays.toString(prices);

        for(int x=0;x<=pricesString.length()-1;x++){
            System.out.println("character at index "+x+" is : "+pricesString.charAt(x));


        }






     //for sorting an array in ascending order
     //sort--------> Arrays.sort(yourArrayHere)

     //for checking for equality if 2 array object content
        //equals-> Arrays.equals(firstArray,secondArray)




















    }
}
