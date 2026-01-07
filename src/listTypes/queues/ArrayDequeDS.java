package listTypes.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDS {
    static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addLast("Task1");
        deque.addLast("Task1");
        deque.addFirst("Urgent Task3");
        deque.offerFirst("Urgent Task4");
        
        System.out.println("The deque is " + deque);
        
        String first = deque.peekFirst();
        String last = deque.peekLast();
        
        System.out.println("The first element is " + first);
        System.out.println("The last element is " + last);
        
        String removedFirst = deque.pollFirst();
        String removedLast = deque.removeLast();
        
        System.out.println("The removed first element is " + removedFirst);
        System.out.println("The removed last element is " + removedLast);
        
        System.out.println("The updated deque is " + deque);
    }
}
