package day25;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {

        String sentence = "I love Java";
        String[] allWord=sentence.split(" ");

        System.out.println(Arrays.toString(allWord));

        System.out.println("how many word do i have in this sentence? "+allWord.length);

        // how do i get the last word of the sentence using array i got from string

        System.out.println(allWord[allWord.length-1]);


// are we wlimited to split by space or can split by anything ? ------->.anything

        String sentence2 = "Everything is Awesome!!!!";
        //split by letter e
        String [] splitByE=sentence2.split("e");
        System.out.println("splitByE = " + Arrays.toString(splitByE));
        System.out.println("____________________________________________________");
        for ( String eachPieces : splitByE      ){
            System.out.println("eachPieces = <" + eachPieces+">");
        }
        System.out.println("____________________________________________________");
        //split this sentence by is and print your result

        String[] splitby_is_ = sentence2.split("is");

        for (String eachPieces         :  splitby_is_      ){
            System.out.println("eachPieces = " + eachPieces);
        }






















    }
}
