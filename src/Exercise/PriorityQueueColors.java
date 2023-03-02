package Exercise;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueColors {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();

        // add colors
        pq.add("red");
        pq.add("blue");
        pq.add("yellow");
        pq.add("orange");
        pq.add("green");

        // print the elements
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
}
