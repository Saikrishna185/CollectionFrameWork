package listTypes.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {
    static void main() {
        Queue<String> queue = new LinkedList<>();
        
        // Here add method will give error if the Queue is full.
        queue.add("Task1");
        queue.add("Task2");
        // Here offer method will return false if Queue is full saying "NO".
        queue.offer("Task3");
        
        System.out.println(queue);
        
        queue.offer("Task4");
        String comTask = queue.poll();
        System.out.println("Task has been Completed and polled out is: " + comTask);
        String comTask2 = queue.remove();
        System.out.println("Is the queue Empty " +  queue.isEmpty());
        String inProcessTask = queue.peek();
        System.out.println("The Task in process is " + inProcessTask);
        queue.clear();
        System.out.println("Is the queue Empty " +  queue.isEmpty());
    }
}
