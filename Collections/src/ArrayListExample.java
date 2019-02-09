import java.util.*;
 
 class ArrayListExample
 {
 	public static void main(String args[])
 	{
 		// creating array list
		ArrayList al=new ArrayList(); 

		// adding elements
		al.add("Jack");                 
		al.add("Tyler");
		
		Iterator itr=al.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
	}
}