import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Example of PriorityQueue in Java Collections Framework.
 * 
 * This program demonstrates how to use a PriorityQueue with reverse order (max-heap).
 * It shows the usage of important methods:
 * - offer(): Add elements to the queue.
 * - poll(): Remove and return the element with the highest priority.
 * - peek(): View the highest priority element without removing it.
 * 
 * Author: Palak Satija
 * Date: 2025-09-07
 */

public class LearnPriorityQueue { 
	
    public static void main(String[] args) { 
	
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
	
        System.out.println(pq);
	
        System.out.println(pq.poll());
	
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
