/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Create a class Stack (Last-in-first-out) that maintains a stack of Integers. 
            Write a test application named StackTest that demonstrates class Stack’s capabilities. 
*/
import java.util.*;

public class StackTest
{
  public static void main(String args[]) 
  { 
    int i, x, y, len= 10, count=0;
    int arr[]= new int[10];
    int cnt;

    Scanner elements= new Scanner(System.in);

    Stack s= new Stack();
    Stack s1= new Stack(); 

    System.out.println("Initial elements in Stack");
    s1.isEmpty(arr);

    System.out.println("enter elements");
    for (i= 0; i< len; i++) 
    {
      x = elements.nextInt();
      if (arr != null) 
      {
        arr[i]= x;
        s1.push(x);
        count++;
      }
    }

    System.out.println("Elements in Stack now");
     for (i= 0; i< len; i++) 
    {
      System.out.println(arr[i]);
    }
    
    cnt= s1.isFull(count);
    s1.SpaceLeft(cnt);

    System.out.println("Enter element to be popped");
    y= elements.nextInt();
    
    System.out.println("Element popped from the stack is " + y); 
    System.out.println("Elements in the Stack now"); 
    s1.pop(y);
    
    cnt= s1.isFull(count);
    
    s1.SpaceLeft(cnt);
    }
} 

class Stack
{ 
  int top, x; 
  int[] stack = new int[10];

  Stack()  // constructor 
  { 
    this.top = -1;
  } 
   // Method to delete an element from stack 
  public void pop(int y) 
  { 
    int i=1, j;
    for(j=0; j<10; j++)
    {
      if(stack[j] != y)
      {
        System.out.println(stack[j]);
      }
      else
      {
        stack[j]= 0;
        System.out.println(stack[j]);
      }
    }
  }
   // Method to insert an element x to stack
  public void push(int x) 
   { 
    if(top==9)
    {
      System.out.println("Stack is full");
    }
      //arr[top] = elements.nextInt();
    else
    {
      stack[++top] = x;
    }
   }  
   void isEmpty(int[] arr)
   {
    if (arr == null) 
    {
      System.out.println("Stack is Empty");
    }
   }

   int isFull(int count)
   {
    int i;
    int cnt = count;
    for(i= 0; i< 10; i++)
    {
      if(stack[i] == 0)
      {
        cnt= cnt-1;
      }
    }
      if (cnt == 10)
      {
        System.out.println("Stack is Full");
      }
      else
      {
        System.out.println("Stack is not full. It has " + cnt + " spaces empty");
      }
      return cnt;
    }
   void SpaceLeft(int cnt)
   {
      System.out.println("Space left="+ (10-cnt));
   }
}