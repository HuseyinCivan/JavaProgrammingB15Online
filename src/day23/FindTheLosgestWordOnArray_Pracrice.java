package day23;

public class FindTheLosgestWordOnArray_Pracrice {
    public static void main(String[] args) {




String[] groceryList={"apple","banana","grape","strawberry","blueberry","kiwi77777777777"};

        String longestWord=groceryList[0];

        for(int x=0;x<=groceryList.length-1;x++){

            if(groceryList[x].length()>longestWord.length());
            longestWord=groceryList[x];

        }
        System.out.println("longestWord = " + longestWord);
        longestWord=groceryList[0];
        System.out.println("______________________________________________________________");

        for( String items : groceryList              ){
            if( items.length() > longestWord.length()         ){
                longestWord=items;
            }
        }
        System.out.println("longestWord = " + longestWord);

























    }
}
