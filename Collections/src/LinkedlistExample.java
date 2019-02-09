import java.util.*;

public class LinkedlistExample
{
	public static void main(String args[])
	{
		// creating linked list
		LinkedList al; 
		al=new LinkedList();

		// adding elements
		al.add("Rachit");
		al.add("Rahul");
		al.add("Rajat");

		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
 	}
}