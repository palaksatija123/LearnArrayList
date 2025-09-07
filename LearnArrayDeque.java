import java.util.ArrayDeque;

/**
 * Example of ArrayDeque in Java Collections Framework.
 * 
 * This program demonstrates how to use ArrayDeque methods:
 * - offer(), offerFirst(), offerLast()
 * - peek(), peekFirst(), peekLast()
 * - poll(), pollFirst(), pollLast()
 * 
 * Author: Palak Satija
 * Date: 2025-09-07
 */

public class LearnArrayDeque {
	
    public static void main(String[] args) {
		
        ArrayDeque<Integer> adq = new ArrayDeque<>();
		
        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(45);
        adq.offer(26);
        System.out.println(adq);
	    
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
	  
        System.out.println(adq.poll());
        System.out.println("poll() " + adq);
	    
        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() " + adq);
	    
        System.out.println(adq.pollLast());
        System.out.println("pollLast() " + adq);
    }
}
