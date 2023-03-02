package Exercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListReverse {
    public static void main(String[] args) {
        List<Integer> numbersList = new LinkedList<>();

        //add some random numbers
        numbersList.add(100);
        numbersList.add(200);
        numbersList.add(300);
        numbersList.add(400);
        numbersList.add(500);
        numbersList.add(600);

        //Get a list iterator and iterate it in reverse order
        //Iterator<Integer> listIterator = numbersList.listIterator(numbersList.size());
        ListIterator<Integer> listIterator = numbersList.listIterator(numbersList.size());
        System.out.println("List in the Reverse order:");
        while (listIterator.hasPrevious()){
            int num = listIterator.previous();
            System.out.println(num);
        }

    }
}
