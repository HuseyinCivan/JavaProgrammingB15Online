package day23;

public class WarmUp_Array {
    public static void main(String[] args) {
        //create an int array of 7 items
        //assign value
        //1, print out in reverse order
        //2, store last item in a variable called last item
        //print it out seperately

        //3, print the item right in the middle,
        //optionally
        //4, find sum find average, find max, find min,

        int[] number=new int[7];

        number[0]=0;
        number[1]=10;
        number[2]=20;
        number[3]=30;
        number[4]=40;
        number[5]=50;
        number[6]=60;

        // 2nd way
        int[] nums2=new int[]{10,11,23,4,53,2,15};

        // 3rd way
        int[] num3={12,18,7,45,1,45,96,77};

        /////////////////////
        System.out.println("_________________________________________");

        int arraySize= num3.length;
        int lastItemIndex=arraySize-1;

        int lastItemValue=num3[lastItemIndex];
        System.out.println("lastItemValue = " + lastItemValue);





       for(int x=number.length-1;x>=0;x--) {
           System.out.print(number[x]+" ");
       }
        System.out.println();
       int lastItem=number[number.length-1];
        System.out.println("lastItem = " + lastItem);

        System.out.println("middle number "+number[number.length/2] );

        int sum=0;
        for (int x=0; x<=number.length-1;x++){
            sum+=number[x];

        }
        System.out.println("sum = " + sum);
        System.out.println("avarage is "+sum/(number.length));




















    }
}
