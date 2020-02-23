package day52.books;

import java.util.Arrays;

//AudioBook
//	double duration
//	implement abstract method
//	instance method
//		listen()
//		toString()
public class AudioBook extends Book{
    double duration;
    public AudioBook(String name, String author,double duration) {
        super(name, author);
        this.duration=duration;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Audio Book display book info");
    }

    @Override
    public void takeNote() {
        System.out.println("Audio Book take note");
    }

    @Override
    public void showTableOfContent() {
        System.out.println("Audio Book  show table of content");
    }
    public void listen(){
        System.out.println("Audio Book listen");
    }



    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static String capitalize(String word) {
        if(word.length()==0){
            return "";
        }else{
            word=word.toLowerCase();
            word=word.substring(0,1).toUpperCase()  + word.substring(1);
            return word;
        }
    }


}
