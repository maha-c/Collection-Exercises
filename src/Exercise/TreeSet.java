package Exercise;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {

       // create a new TreeSet
        Set<Integer> numberSet = new java.util.TreeSet<>();

        //add numbers to the set

        numberSet.add(2);
        numberSet.add(3);
        numberSet.add(5);
        numberSet.add(7);
        numberSet.add(0);
        numberSet.add(1);
        numberSet.add(9);

        //print numbers less than 7
        System.out.println("Numbers less than 7 are:");
        for (int number : numberSet ){
            if (number < 7){
                System.out.println(number);
            }

        }
    }
}
