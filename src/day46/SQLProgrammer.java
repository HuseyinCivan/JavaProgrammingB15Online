package day46;

public class SQLProgrammer extends Programmer {


    //access modifier in sub class
    //can have same visibility or more visibility

    @Override
    protected void code() {
        System.out.println("writing sql querry");
    }

    @Override
    public void test() {
        System.out.println("testing sql querry");
    }
    public void writeSQLQerry(){
        System.out.println("writing SQL Querry");
    }



}
