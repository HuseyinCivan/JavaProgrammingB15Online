package day26;

import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {
        String[] marvelHeros = {"Iron Man", "Captain America", "Spiderman",
                "Black Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                "Captain America", "Spiderman",
                "Black Widow", "Wanda", "Captain Marvel",
                "Captain America"};

        System.out.println("Marvel Heroes" + Arrays.toString(marvelHeros));
        int sizeOfArray = marvelHeros.length;
        System.out.println("sizeOfArray = " + sizeOfArray);

        String itemToSearch="Black Widow";
        int counOfItem=0;

        for( String eachHero          : marvelHeros){
            if(eachHero.equals(itemToSearch)){
                counOfItem++;
            }
        }

        // count the hero with the name contains black

        System.out.println("counOfItem = " + counOfItem);

        int countOfBlackinHeroes=0;
        for( String eachHero   : marvelHeros  ){

            if(eachHero.toLowerCase().contains("black")){
            countOfBlackinHeroes++;
        }

    }
        System.out.println("countOfBlackinHeroes = " + countOfBlackinHeroes);

        String longerWordHero= marvelHeros[0];

        for( String eachHero    :marvelHeros   ){
            if(eachHero.length()>longerWordHero.length()){
                longerWordHero=eachHero;
            }
        }

        System.out.println("longerWordHero = " + longerWordHero);

        int counterUnique=0;
        for( String eachHero    :marvelHeros   ){
            //unique olanlari bul
            //burdan devam et



        }



    }
}
