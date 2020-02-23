package repl;

public class Book {
    String title;
    String author;
    static String tableOfContents="";
    static int nextPage=1;

    public Book(String title,String author ){
        this.title=title;
        this.author=author;
    }
    public void addChapter(String title,int numberOfPages){

        tableOfContents="\n"+title+"..."+numberOfPages;
        nextPage+=numberOfPages;

    }
    public int getPages(){
        return nextPage-1;
    }
    public String getTableOfContents(){
        return tableOfContents;
    }
    public String toString(){
        return title+"\n"+author;
    }

}

