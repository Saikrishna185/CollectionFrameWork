package listTypes.queues;

import java.util.Scanner;
import java.util.PriorityQueue;

public class PriorityQueueImpl {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read the number of initial tasks (n)
        int n = sc.nextInt();
        // TODO: Create a PriorityQueue to store task priorities
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // TODO: Read and add n task priorities to the PriorityQueue
        for(int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }
        // TODO: Read the new task priority to insert
        int ntp = sc.nextInt();
        pq.add(ntp);
        // TODO: Remove the highest-priority task from the queue
        pq.poll();
        // TODO: Print the updated queue of task priorities
        System.out.println("Updated Queue of Task Priorities : ");
        for(int x : pq) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
