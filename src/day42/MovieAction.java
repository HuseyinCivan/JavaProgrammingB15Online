package day42;

import java.util.ArrayList;
import java.util.List;

public class MovieAction {
    public static void main(String[] args) {

       Movie m1=new Movie();
        System.out.println("m1 = " + m1);

        Movie m2=new Movie("Joker",2.2,"Drama");
        Movie m3=new Movie("Frozen2",1.5,"Family");
        Movie m4=new Movie("Pursuit of Happiness",2.0,"Drama");

        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);
        System.out.println("m4 = " + m4);

        // i want to get the name of M2 separataly SO I CAN DO SOME stuff
        // i can not access the field directly because it 's private
        //i need a getter method to accss
        //sout(m2.name)
        System.out.println(m2.getName());


        //Add Setters to Movie Class
        //Create List<Movie> myFavoriteMovieLst  add 10 Movie Objects




        //Find out longest Movie name
        System.out.println("===================================");
       List<Movie> myFavoriteMovieLst = new ArrayList<>();

        myFavoriteMovieLst.add( new Movie  ("The Shawshank Redemption", 2.22,"Drama") ) ;
        myFavoriteMovieLst.add( new Movie ("The Godfather", 2.55,"Drama") ) ;
        myFavoriteMovieLst.add( new Movie ("The Dark Knight", 2.32,"Action") ) ;
        myFavoriteMovieLst.add( new Movie ("12 Angry Men", 1.36,"Drama") ) ;
        myFavoriteMovieLst.add( new Movie ("Schindler's List", 3.15," Biography") ) ;
        myFavoriteMovieLst.add( new Movie ("The Lord of the Rings", 3.21,"Fantasy") ) ;
        myFavoriteMovieLst.add( new Movie ("Pulp Fiction", 2.34,"Crime") ) ;
        myFavoriteMovieLst.add( new Movie ("Fight Club", 1.99,"Drama") ) ;
        myFavoriteMovieLst.add( new Movie ("Forrest Gump", 2.22,"Drama") ) ;
        myFavoriteMovieLst.add( new Movie ("Inception", 2.28,"Action") ) ;


       // System.out.println(myFavoriteMovieLst);

        //Print the name of the movies less than 2 hours

        for (int x = 0; x <  myFavoriteMovieLst.size(); x++) {
            if(myFavoriteMovieLst.get(x).getLength()<2){
                System.out.println(myFavoriteMovieLst.get(x).getName());
            }

        }

        //Print all the Action movies

        for (int x = 0; x < myFavoriteMovieLst.size() ; x++) {
            if(myFavoriteMovieLst.get(x).getType().equals("Action")){
                System.out.println(myFavoriteMovieLst.get(x));
            }

        }

        System.out.println("===================================");

        //If any Movie is longer than 2 hours Update the movie type to  Long(MovieType)
        //     for example : if type was Action -->> LongAction , Drama--> LongDrama

        for (Movie eachMovie : myFavoriteMovieLst) {

            if(eachMovie.getLength()>2){
                eachMovie.setType("Long "+eachMovie.getType());
                System.out.println(eachMovie);
            }

        }

        System.out.println("===================================");

        //Find out longest Movie name

        String longestName=myFavoriteMovieLst.get(0).getName();
        for (int x = 0; x <myFavoriteMovieLst.size() ; x++) {
            if(longestName.length() < myFavoriteMovieLst.get(x).getName().length()){
                longestName=myFavoriteMovieLst.get(x).getName();

            }

        }
        System.out.println("longestName = " + longestName);

























    }
}
