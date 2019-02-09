import java.util.*;
class QueueExample 
{
	public static void main(String args[])
	{
		// creating PriorityQueue
		PriorityQueue queue = new PriorityQueue();

		// adding elements
		queue.add("A"); 
		queue.add("B");
		queue.add("C");

		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek());

		System.out.println("iterating the queue elements:");
		Iterator itr=queue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		queue.remove();
		queue.poll();

		System.out.println("after removing two elements:");

		Iterator itr2=queue.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
}