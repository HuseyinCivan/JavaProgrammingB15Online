package day52.books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Create List<Book> add all your books
//	displayInfo on all of them
//	find out how many paperbook is there
public class PolymorphicBookTest {
    public static void main(String[] args) {

//       reference type is book , actual object type is PaperBook
        Book b1= new PaperBook("PaperBook1","PaperBookAuthor1",3);
        Book b2= new AudioBook("AudioBook1","AudioBookAuthor1",45.50);
        Book b3= new PaperBook("PaperBook2","PaperBookAuthor2",5);
        Book b4= new PaperBook("PaperBook3","PaperBookAuthor3",4);
        Book b5= new AudioBook("AudioBook2","AudioBookAuthor2",52.10);
        Book b6= new AudioBook("AudioBook3","AudioBookAuthor3",80.45);
        Book b7= new PaperBook("PaperBook4","PaperBookAuthor4",6);

        KnowledgeBank kb=b1;
        kb.takeNote();
        kb.showTableOfContent();
        System.out.println("______________________________");

        System.out.println("b1.author = " + b1.author);
        System.out.println("b1.name = " + b1.name);
        b1.displayBookInfo();
        b1.takeNote();
        b1.toString();
        System.out.println("--------------------");



//        List<Book> allBooks=new ArrayList<>();
//
//        allBooks.add(b1);
//        allBooks.add(b2);
//        allBooks.add(b3);
//        allBooks.add(b4);
//        allBooks.add(b5);
//        allBooks.add(b6);
//        allBooks.add(b7);
        System.out.println("__________________------------_____________-----------");
       List<Book> allBooks= Arrays.asList(b1,b2,b3,b4,b5,b6,b7);

       // System.out.println("allBooks = " + allBooks);

        for (Book each : allBooks) {
            each.displayBookInfo();
        }

        int counterPaperbook=0;

        for (int x = 0; x <allBooks.size() ; x++) {
            if(allBooks.get(x).getClass().getSimpleName().equalsIgnoreCase("PaperBook")){
                counterPaperbook++;
            }
        }
        System.out.println("counterPaperbook = " + counterPaperbook);

















    }
}
