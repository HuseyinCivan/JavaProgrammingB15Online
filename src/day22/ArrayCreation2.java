package day22;

public class ArrayCreation2 {
    public static void main(String[] args) {

        int num;     //we are declaring a variable
            num=10;  // we are assigning a value on different line



    int[] ages;
          ages=new int[]{ 3,5,11,33,57,18};

          // int[] ages={ 3,5,11,33,57,18}; en kisa yolu yazmanin

        int itemCount=ages.length;
        System.out.println("itemCount = " + itemCount);

       //System.out.println("ages = " + ages);

        for (int x = 0; x < itemCount ; x++) {
            System.out.println(ages[x]);


        }

       int[] areaCodes ={703,300,954,665};
        //if you do it this way : IT MUST HAPPEN IN ONE LINE TOGETHER

        //int[] areaCodes ;
        //areaCodes ={703,300,954,665};  ------> boyle calismaz !!!  tek seferde yazman gerekir .

        for (int x = 0; x <areaCodes.length ; x++) {
            System.out.print(areaCodes[x]+" ");

        }












    }
}
