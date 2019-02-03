/*
Author: Shagun Bhardwaj(18csu202)
Version: 1.0.0
Purpose: Demonstrate that a derived-class constructor cannot catch exceptions thrown by its base-class constructor.
*/

class X
{
    public X() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
}

class Y extends X 
{
    public Y() throws CloneNotSupportedException
    {
   		/*try 
   		{ 
     		super(); 
   		} 			
   		catch (CloneNotSupportedException e) 
   		{*/
  			System.out.println("Exception from the base-class constructor occurred!");
   		//}
	}
}

public class BaseClassException
{
    public static void main(String[] args) 
    {
        try 
        {
            Y y = new Y();
        }
        catch(CloneNotSupportedException e) 
        {
            e.printStackTrace();
        }
        catch(RuntimeException re)
        {
        	re.printStackTrace();
        }
    }
}