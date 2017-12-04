import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SortedSets {
    public static<T extends Comparable<? super T>>
    void intersect(List<T> l1, List<T> l2, List<T> outList) {
        Iterator<T> iterator1 = l1.iterator();
        Iterator<T> iterator2 = l2.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()){
            T temp1 = iterator1.next();
            T temp2 = iterator2.next();
            while (temp1.compareTo(temp2) != 0 && iterator1.hasNext() && iterator2.hasNext()){
                if (temp1.compareTo(temp2)<0)
                temp1 = iterator1.next();
                else if (temp1.compareTo(temp2)>0)
                    temp2 = iterator2.next();
             }
             if (temp1.compareTo(temp2) == 0)
                 outList.add(temp1);
        }
        for (T item:outList)
            System.out.println(item);
    }

    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Integer> l2 = new LinkedList<>();
        l2.add(3);
        l2.add(4);
        l2.add(5);
        List<Integer> outlist = new LinkedList<>();
        SortedSets.intersect(l1,l2,outlist);
    }
}

