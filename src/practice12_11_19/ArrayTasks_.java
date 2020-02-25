package practice12_11_19;

import java.util.Arrays;

public class ArrayTasks_ {
    public static void main(String[] args) {
//        Create a String array of 6 items to store groceryItems
//        {"apple","banana","grape","strawberry","blueberry","kiwi"}
//        Create a float array of 6 float values to store prices
//        { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
//        assume that the order of grocery Items match the prices in same order.
//                Do below tasks :


//• 1, loop through each grocery items and print them in one line
        String[] groceryItems ={"apple","banana","grape","strawberry","blueberry","kiwi"};

        for (int x=0;x<=groceryItems.length-1;x++) {
            System.out.print(groceryItems[x]);
           if ( ! groceryItems[x].equals(groceryItems[groceryItems.length-1])          ){
           // if (!groceryItems[x].equals("kiwi")) {
                System.out.print("--->");
            }
        }
        System.out.println();

//        1.1 print each items at odd index
        for (int x=0;x<=groceryItems.length-1;x++) {
            if(x%2==1){
                System.out.print(groceryItems[x]+" ");

            }
        }
        System.out.println();

//        1.2 print all items in reverse order
        for (int x=groceryItems.length-1;x>=0;x--) {

            System.out.print(groceryItems[x]+" ");

        }
        System.out.println();
//        1.3 find out the index location of strawberry
        for (int x=0;x<=groceryItems.length-1;x++) {
            if(groceryItems[x].equals("strawberry")){
                System.out.println(x);
            }

        }

//        1.4 find out the count of groceries that contains berry in the name
        int counter=0;
        for (int x=0;x<=groceryItems.length-1;x++) {
            if(groceryItems[x].contains("berry")){
                counter++;

            }
        }
        System.out.println(counter);

//        1.5 print out all the character counts of the grocery items
        for ( String eachGroceryItem     :  groceryItems    ) {
            System.out.println(eachGroceryItem+" character count is "+eachGroceryItem.length());

        }
        System.out.println();
//        1.6 print out only those items with even character count

        for (int x=0;x<=groceryItems.length-1;x++) {
            if(groceryItems[x].length()%2==0    ){
                System.out.print(groceryItems[x]+" ");
            }
        }
        System.out.println();
        System.out.println();

//        1.7 print out only those items end with letter e
        for ( String eachGroceryItem     :  groceryItems    ) {
            if(eachGroceryItem.endsWith("e")){
                System.out.print(eachGroceryItem+" ");
            }

        }

        System.out.println();

//        1.8 print out only last 3 characters of all the items
        for ( String eachGroceryItem     :  groceryItems    ) {
            System.out.print(eachGroceryItem.substring(eachGroceryItem.length()-3)+" ");
        }
        System.out.println();


//        1.9 create String variable called allItems and store all the items inside array separated by comma.
        String allItems = Arrays.toString(groceryItems);
        System.out.println(allItems);


//        String allItem="";
//        for (int x=0;x<=groceryItems.length-1;x++) {
//
//            allItem=allItem+groceryItems[x];
//            if(! groceryItems[x].equals(groceryItems[groceryItems.length-1])   ){
//                allItem=allItem+" , ";
//            }
//        }
//        System.out.println(allItem);

        System.out.println("______________________________________");
        System.out.println("______________________________________");

//• 2, loop through each prices  and print them in one line
       Float[] prices= { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  };
        for (Float eachPrice : prices) {
            System.out.print(eachPrice+" ");

        }
        System.out.println();
//        2.1 print each prices in even index
        for(int x=0;x<=prices.length-1;x++){
            if(x%2==0){
                System.out.print(prices[x]+" ");
            }
        }
        System.out.println();
//        2.2 print only prices less that 3 dollars
        for(int x=0;x<=prices.length-1;x++){
            if(prices[x]<3){
                System.out.print(prices[x]+" ");
            }
        }
        System.out.println();

//        2.3 print the sum of all the prices and get average
        float sum=0;
        float avarage;
        for(int x=0;x<=prices.length-1;x++){
            sum=sum+prices[x];

        }
        System.out.println("sum = " + sum);
        avarage=sum/prices.length;
        System.out.println("avarage = " + avarage);
        System.out.println();
//        2.4 print only the second half of prices (last 3)
        for(int x=prices.length/2;x<=prices.length-1;x++){
            System.out.print(prices[x]+" ");
        }
        System.out.println();
//        2.5 print the sum of the middle two prices
        float sumMid2=prices[(prices.length/2)-1]+prices[(prices.length/2)];
        System.out.println("sumMid2 = " + sumMid2);

//        2.6 print only prices more than average price
        for(float eachNum:prices){
            if(eachNum>avarage){
                System.out.println(eachNum+" ");
            }
        }

//        2.7 find out max price and print out max price and  index of max price
       float max=prices[0];
        for (int x = 0; x <=prices.length-1 ; x++) {
            if(prices[x]>max){
                max=prices[x];
                System.out.println("index of max price is "+x);
            }

        }
        System.out.println("max = " + max);


//        2.8 find out the minimum price and index of minimum price
        float min=prices[0];
        for (int x = 0; x <=prices.length-1 ; x++) {
            if(prices[x]<min){
                min=prices[x];
                System.out.println("index of min price is "+x);
            }

        }
        System.out.println("min price is  = " + min);


//        2.9 find out second max price and index
        float secondMax=prices[0];
        for (int x = 0; x <=prices.length-1 ; x++) {
            if(prices[x]>secondMax && prices[x]<max ){
                secondMax=prices[x];
                System.out.println("index of second max price is "+x);
            }

        }
        System.out.println("second max is  = " + secondMax);
        System.out.println("________________________________");
        System.out.println("________________________________");
        System.out.println("________________________________");

//• 3, assume that the order of grocery Items match the prices in same order do below:
//        String[] groceryItems ={"apple","banana","grape","strawberry","blueberry","kiwi"};
//        Float[] prices= { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  };

//                3.1 print first item and first price in one print statement -->>  apple price is 1.99
        System.out.println(groceryItems[0]+" price is "+prices[0]);

        System.out.println("___________");
//        3.2 print last item and last price in one print statement-->>  kiwi price is 2.88
        System.out.println(groceryItems[groceryItems.length-1] +" price is " + prices[prices.length-1]);

//        3.2 print all items and prices in one for loop together
        for (int x = 0; x <= groceryItems.length-1 ; x++) {
            System.out.println(groceryItems[x]+" price is "+prices[x]);

        }

        System.out.println("________________");
//        3.3 print only those items with price more than 3.11
        for (int x = 0; x <= groceryItems.length-1 ; x++) {


            if (prices[x]>3.11) {

                System.out.println(groceryItems[x] + " price is " + prices[x]+" is more than 3.11 ");
            }
        }

//        3.4 print only those items with price more than average

        for (int x = 0; x <= groceryItems.length-1 ; x++) {


            if (prices[x]>avarage) {

                System.out.println(groceryItems[x] + " price is " + prices[x]+" is more than average ");
            }
        }

        System.out.println("___________________");
//        3.5 print only those prices of grocery items that contains letter b
        for (int x = 0; x <= groceryItems.length-1 ; x++) {


            if (groceryItems[x].contains("b")) {

                System.out.println(groceryItems[x] + " price is " + prices[x]+" that contains b ");
            }
        }

//        3.6 print the item name with max price
        System.out.println("____________");
        for (int x = 0; x <= groceryItems.length-1 ; x++) {


            if ( prices[x]==max           ) {

                System.out.println(groceryItems[x] + " price is " + prices[x]+" that is max price item");
            }
        }
        System.out.println("____________");

//        3.7 print the item name with min price
        for (int x = 0; x <= groceryItems.length-1 ; x++) {


            if ( prices[x]==min           ) {

                System.out.println(groceryItems[x] + " price is " + prices[x]+" that is min price item");
            }
        }
        System.out.println("_________________________________");
        System.out.println("_________________________________");
        System.out.println("_________________________________");
        System.out.println("_________________________________");


//• 4 , Below tasks will modify array :  (for each loop should not be used, try and see why)
//        4.1 swap the value of first item in array with last item of array , swap apple with kiwi
        String temp="";
        temp=groceryItems[0];

        groceryItems[0]=groceryItems[groceryItems.length-1];
        groceryItems[groceryItems.length-1]=temp;

        System.out.println( groceryItems[0]   );
        System.out.println(  groceryItems[groceryItems.length-1]  );
        System.out.println("====================");
//        4.2 use for loop to loop through your groceryItems array and modify your items like this :
//        itemValue+itemCharacterCount
        for (int x = 0; x <= groceryItems.length-1 ; x++) {
            groceryItems[x]=""+groceryItems[x]+groceryItems[x].length();
            System.out.print(groceryItems[x]+" ");
        }
        System.out.println();
//        For example : {"apple5","banana6","grape5","strawberry10","blueberry9","kiwi4"}

//        4.3 increase the value of each prices by one  in prices array

        for (int x = 0; x <=prices.length-1 ; x++) {
            prices[x]=prices[x]+1;
        }
        System.out.println(Arrays.toString(prices));

//        4.4 double the value of each prices in your array 1.99-->> 1.99*2
        for (int x = 0; x <=prices.length-1 ; x++) {
            prices[x]=prices[x]*2;
        }
        System.out.println(Arrays.toString(prices));
        System.out.println("________________________________");
        System.out.println("________________________________");

        System.out.println("groceryItems = " + Arrays.toString(groceryItems));
        System.out.println("prices = " + Arrays.toString(prices));

        System.out.println("________________________________");
        System.out.println("________________________________");


        groceryItems= new String []{"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        prices=new Float[] { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  };

        System.out.println("groceryItems = " + Arrays.toString(groceryItems));
        System.out.println("prices = " + Arrays.toString(prices));

//        4.5 triple the value of each prices if it is less than 2 1.99 -->> 1.99*3
        System.out.println("________________________________");

        for(int x=0 ; x<=prices.length-1;x++) {

            if (prices[x] < 2) {
                prices[x] = prices[x] * 3;
            }
        }
        System.out.println("prices = " + Arrays.toString(prices));


//        4.6 now find out highest price after the modification

        for(int x=0 ; x<=prices.length-1;x++) {
            if(prices[x]>max){
                max=prices[x];

            }

        }
        System.out.println("max = " + max);
        System.out.println("___________________________");
//        4.7 find out the most expensive item name. (edited)

        for(int x=0 ; x<=prices.length-1;x++) {
            if(prices[x]==max){
                System.out.println("the most expensive item after modification is "+groceryItems[x]+" and the price is "+prices[x]);
            }
        }


    }
}

