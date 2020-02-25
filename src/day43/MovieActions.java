package day43;

//this class has a lot of static methods to deal with movie object
//this class does not serve as template for creating object
// just like arrays class does not serve as template for creating array object


import day42.Movie;

public class MovieActions {

    public static void main(String[] args) {

        Movie m1=new Movie("Joker",2.5,"Drama")  ;
        printMovieInformation(m1);




    }

    public static void printMovieInformation(Movie movieObj) {
        //TODO YOUR CODE HERE
        // expected to print The movie Joker is 2.2 hour long and it's genre is Drama

        System.out.println("The movie " + movieObj.getName() + " is " + movieObj.getLength() + " hour long and it's genre is " + movieObj.getType());

    }




}
