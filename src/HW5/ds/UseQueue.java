package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		// Demonstrate how to use Queue.
    
	        Queue<String> qu=new LinkedList<String>();
	        qu.add("First");
	        qu.add("Second");
	        qu.add("Third");
	        qu.add("Fourth");

	        qu.remove();
	        Iterator<String> iter=qu.iterator();
	        while (iter.hasNext()) {
	            System.out.println(iter.next());
	        }

	}

}
