/*
* Priority Queue is a D
* */

package listTypes.queues;

import java.util.PriorityQueue;


public class PriorityQueueDS {
    static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
        
        System.out.println(pq);
        
    }
}
