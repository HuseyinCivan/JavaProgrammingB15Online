package day52.books;

//PaperBook
//	int weight
//	-- add cosntructor to set all the fileds
//	implement abstract method
//	instance method
//		read()
//		toString()


public class PaperBook extends Book  implements Readable {

   int weight;

    public PaperBook(String name, String author,int weight) {
        super(name, author);
        this.weight=weight;
    }



    @Override
    public void displayBookInfo() {
    System.out.println("Paper Book's name is: "+name+"," +
            " and the author is: " +author +
            " and it's weight "+weight+ " pound");
}

    @Override
    public void takeNote() {
        System.out.println("Bookmark and Taking note from "+name);
    }

    @Override
    public void showTableOfContent() {
        System.out.println("Paperbook show table of content");
    }
    public void read(){
        System.out.println("Paperbook read");
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
