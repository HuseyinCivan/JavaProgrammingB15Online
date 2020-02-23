package practice02_17_20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedList {
    public static void main(String[] args) {

        ArrayList<Integer> lst1 = new ArrayList<>();
        LinkedList<Integer> lst2 = new LinkedList<>();

        calculateTime(lst2);
        // calculateTime(lst1);

    }

    public static void calculateTime(List<Integer> lst) {
        long start = System.currentTimeMillis();
        long finish;

        for (int x = 0; x < 10000000; x++) {
            lst.add(0, x);
        }

        finish = System.currentTimeMillis();

        System.out.println(finish - start);

    }
}





//        LinkedList<Integer> linkedlist  = new LinkedList<Integer>();
//        ArrayList<Integer> arraylist =  new ArrayList<Integer>();
//
//        zamanhesapla("LinkedList",linkedlist);
//        //zamanhesapla("ArrayList",arraylist);
//
//
//    }
//    public static void zamanhesapla(String veri_tipi, List<Integer> list) {
//
//        // Listin sonuna değer ekleme
//        long baslangic;
//        long bitis;
//
//        baslangic = System.currentTimeMillis();
//
//        for (int i = 0 ; i< 1000000 ; i++) {
//
//            list.add(0,i);
//
//        }
//        bitis = System.currentTimeMillis();
//
//        System.out.println(veri_tipi + " ekleme süresi " + (bitis - baslangic) + " ms");
//
//
//    }

