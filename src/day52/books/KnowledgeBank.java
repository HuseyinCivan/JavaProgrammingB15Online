package day52.books;
//create an interface KnowledgeBank
//	abstract method takeNote();
//	default method showTableOfContent(){
//	}

public interface KnowledgeBank {

    public abstract void takeNote();

    default void showTableOfContent(){

    }
}
