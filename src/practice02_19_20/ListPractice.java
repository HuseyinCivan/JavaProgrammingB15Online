package practice02_19_20;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {

        List<Double> lst = new LinkedList<>(Arrays.asList(3d,4d,27d,66d,3d,3d,44d));

        System.out.println("lst = " + lst);

        System.out.println("first item lst.get(0) = " + lst.get(0));

        lst.add(1,5d);
        System.out.println("lst = " + lst);
        
        lst.set(1,99.0);
        System.out.println("lst = " + lst);

        System.out.println("lst.indexOf(4.0) = " + lst.indexOf(4.0));
        System.out.println("lst.indexOf(3.0) = " + lst.indexOf(3.0));

        System.out.println("lst.lastIndexOf(3.0) = " + lst.lastIndexOf(3.0));

        System.out.println("lst.indexOf(100d) = " + lst.indexOf(100d));   // item not found  ---> -1

        System.out.println("lst.remove(1) = " + lst.remove(1));   //returns which number will remove   --> remove index number yaptik
        System.out.println("lst = " + lst);
        System.out.println("lst.remove(44d) = " + lst.remove(44d));   // returns true or false !!!   ---> remove direkt object yaptik !!
        System.out.println("lst = " + lst);


        lst.addAll(2,Arrays.asList(99d,89d));
        System.out.println("lst = " + lst);

        lst.replaceAll(each -> each+5);  // adding 5 to all !!!

       // lst.replaceAll(each -> 100d);  // butun rakalmlari 100 le degistirir !!!!!!

        System.out.println("lst = " + lst);
        System.out.println("_______________________________");
    //    lst.sort(null);
        lst.sort(Comparator.naturalOrder());
        System.out.println("lst = " + lst);

        lst.sort(Comparator.reverseOrder());
        System.out.println("lst = " + lst);

        System.out.println("_______________________________");


        Collections.sort(lst);
        Collections.sort(lst,Comparator.reverseOrder());



        System.out.println("lst = " + lst);

        System.out.println("Collections.max(lst) = " + Collections.max(lst));
        System.out.println("Collections.min(lst) = " + Collections.min(lst));

        System.out.println(lst);

        Collections.reverse(lst);


        System.out.println("lst = " + lst);

        System.out.println("_____________________");
        System.out.println("_____________________");

        //  System.out.println("lst = " + lst);


        // getting view out of list object
        // view is part of your original list object

        System.out.println("lst.subList(3,7) = " + lst.subList(3,7));
        System.out.println("-----------------------");

        List<Double> partOfList = lst.subList(2, 5);
        System.out.println("partOfList = " + partOfList);
        System.out.println("lst = " + lst);

        System.out.println("-----------------------");
        partOfList.set(0,199.99);
        System.out.println("partOfList = " + partOfList);
        System.out.println("lst = " + lst);

        System.out.println("_____________ listIterator()___________");

            //List has its own iterator ! a little bit more functionality it has
            //iterator() => has 3 methods : hasNext() ; next() ; remove() ;
            //listIterator() => has more methods : add, hasNext , hasPrevious , next , nextIndex, previous, previousIndex, remove , set
        ListIterator<Double> lstIter = lst.listIterator();
        System.out.println("lstIter.hasNext() = " + lstIter.hasNext());
        //System.out.println("lstIter.nextIndex() = " + lstIter.nextIndex());

        System.out.println("=====================================");
        while (lstIter.hasNext()){

            System.out.print(" next index is  = " + lstIter.nextIndex());
            Double item = lstIter.next();
            System.out.println(" | item is = " + item);
            if(item<10){
                lstIter.remove();
            }

        }
        lstIter.add(3d);
        System.out.println("lst = " + lst);

        System.out.println("ls = " + lstIter.hasPrevious());
        System.out.println("lstIter.previousIndex() = " + lstIter.previousIndex());
        //System.out.println("lstIter.previous() = " + lstIter.previous());

        while (lstIter.hasPrevious()){
            System.out.println("lstIter.previousIndex() = " + lstIter.previousIndex());
            Double item = lstIter.previous();
            System.out.println("item is = " + item);
            if(item<60){
                //lstIter.remove();
                //lstIter.set(200d);
                lstIter.add(1000d);

            }

        }
        System.out.println("lst = " + lst);




        









    }

}
