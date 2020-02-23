package practice02_18_20;

import java.util.Arrays;

public class SortingArray {
    public static void main(String args[]) {
        int[] arr = {7, 3, 1, 2, 5};
        System.out.println("Before Sorting");

        System.out.println(Arrays.toString(arr));

       // Arrays.sort(arr);

        int temp;
        for (int x = 0; x < arr.length ; x++) {
            for (int y = 0; y <arr.length ; y++) {
                if(arr[x]>arr[y]){
                    temp=y;
                }
            }
        }
























//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) { temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }
//            }
//        }
                System.out.println("After Sorting");System.out.println(Arrays.toString(arr)); }
}

