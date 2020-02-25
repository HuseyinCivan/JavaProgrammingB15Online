package repl;

import java.util.ArrayList;

public class Repl_215 {
    public static void main(String[] args)
    {

    }
    //create your method below
    public static ArrayList<Integer> twoTimes(ArrayList<Integer>lst  ){

//        ArrayList<Integer> lstTemp=new ArrayList<>();
//        int indexOfLst=0;
//        for(int x=0;x<lst.size()*2;x=x+2){
//            lstTemp.set(x,lst.get(indexOfLst));
//            lstTemp.set(x+1,lst.get(indexOfLst));
//            indexOfLst++;
//        }
//        return lstTemp;
       ArrayList<Integer>lstTemp=new ArrayList<>();
       for(int x=0; x<lst.size(); x++){
           lstTemp.add(lst.get(x));
           lstTemp.add(lst.get(x));

       }
        return lstTemp;


    }

}
