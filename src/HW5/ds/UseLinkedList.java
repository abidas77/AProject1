package ds;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		// Create a LinkeList to store data into it. then use Iterator to retrieve data from it.
		
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Kaniz");
		list.add("Mamun");
		list.add("Rabeya");
		list.add("Sajjad");
		list.add("Munni my Sweet heart");
		list.add("Azim my baby brother");
		list.add("Shermin");
		list.add("Papree");
		list.add("Nayeem - we are proud of you bro!");
		list.add("Sayeem");
		list.add("Towfiq");
		list.add("Singapore - I miss you a lot");		
			
		
		System.out.println("Before remove : " +list.size());
		list.removeFirst();
		System.out.println("after remove : " + list.size());
		Iterator<String> it = list.listIterator();
		while(it.hasNext()){
			
			System.out.println(it.next());
			
		}
	}
	
	

	}


