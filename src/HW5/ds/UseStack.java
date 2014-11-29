package ds;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		// Write Stack to store data into Stack and retrieve it using Iterator/Loop.
		
		 Stack<String>stack =new Stack<String>();
	        String player1="Winner", player2="runner up", player3="looser";
	        
	        stack.add(player1);
	        stack.push(player2);
	        stack.add(player3);	        
	        System.out.println("There are " +stack.size()+" elements in this stack and "+stack.peek()+" is on top of them");//althou
	       
	        Iterator<String> it = stack.iterator();
	        while (it.hasNext()) {
	            System.out.print(it.next() + " ");

	}

	}
}
