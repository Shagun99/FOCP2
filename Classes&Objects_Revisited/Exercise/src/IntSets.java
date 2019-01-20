/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Create class IntegerSet. Each IntegerSet object can hold integers in the range 0–100. 
            The set is represented by an array of booleans. Array element a[i] is true if integer i is in the set. 
            Array element a[j] is false if integer j is not in the set. The no-argument constructor initializes the array to the "empty set" (i.e., all false values).
            Provide the following methods: 
            The static method union creates a set that’s the set-theoretic union of two existing sets (i.e., an element of the new set’s array is set to true if that element is true in either or both of the existing sets—otherwise, the new set’s element is set to false). 
            The static method intersection creates a set which is the set-theoretic intersection of two existing sets (i.e.,an element of the new set’s array is set to false if that element is false in either or both of theexisting sets—otherwise, the new set’s element is set to true). 
            Method insertElement inserts a new integer k into a set (by setting a[k] to true). 
            Method deleteElement deletes integer m (by settinga[m] to false).
            Method toString returns a String containing a set as a list of numbers separated by spaces. 
            Include only those elements that are present in the set. Use --- to represent an emptyset. 
            Method isEqualTo determines whether two sets are equal. 
            Write a program to test class IntegerSet. Instantiate several IntegerSet objects. Test that all your methods work properly.
 */

import java.util.*;

class IntegerSet
{
    private boolean[] set;

    public IntegerSet()  //no-argument constructor
    {
        this.set = new boolean[101];
        for(int i = 0; i < 101; i++)
        {
        this.set[i] = false;  // initializing elements of array to false 
        }
    }

    public void insertElement(int k)  // method to insert number to the set 
    {
        this.set[k] = true;
    }
    
    public void deleteElement(int m)  // method to delete number to the set 
    {
        this.set[m] = false;
    }

    public static IntegerSet union(IntegerSet set1, IntegerSet set2)  // method to find union of the 2 sets
    {
        IntegerSet ans = new IntegerSet();
        for(int i = 0; i < 101; i++)
        {
            ans.set[i] = (set1.set[i] || set2.set[i]);
        }
        return ans;
    }

    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2)  // method to find intersection of the 2 sets
    {
        IntegerSet ans = new IntegerSet();
        for(int i = 0; i < 101; i++)
        {
            ans.set[i] = (set1.set[i] && set2.set[i]);
        }
        return ans;
    }
    
    public String toString()  // method to return a String containing a set as a list of numbers separated by spaces
    {
        String ans=" ";
        boolean count = true;
        for(int i = 0; i < 101; i++)
        {
            if(this.set[i])
            {
                count = false;
                ans += i + " "; 
            }
        }
        if(count)
        {
            return ("[ --- ]");  // return value for empty set
        }
        return ("[" + ans + "]");  // return value for non-empty set
}
   
    public boolean isEqualTo(IntegerSet s) 
    {
        for(int i = 0; i < 101; i++)
        {
            if(this.set[i] != s.set[i])
            {
                return false;
            }
        }
        return true;
    }
}

public class IntSets
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int n;

        IntegerSet intset1 = new IntegerSet();
        IntegerSet intset2 = new IntegerSet();

        System.out.println("Initial elements in Set1 and Set2 are:");

        System.out.println("Set1");
        System.out.println(intset1.toString());
        System.out.println("Set2"); 
        System.out.println(intset2.toString());

        System.out.println("Add elements to set1");

        n= num.nextInt();
        intset1.insertElement(n);
        n= num.nextInt();
        intset1.insertElement(n);
        n= num.nextInt();
        intset1.insertElement(n);
         n= num.nextInt();
        intset1.insertElement(n);
        n= num.nextInt();
        intset1.insertElement(n);

        System.out.println("Add elements to set2");

        n= num.nextInt();
        intset2.insertElement(n);
        n= num.nextInt();
        intset2.insertElement(n);
        n= num.nextInt();
        intset2.insertElement(n);
        n= num.nextInt();
        intset2.insertElement(n);
        n= num.nextInt();
        intset2.insertElement(n);

        System.out.println("Elements in Set1 and Set2 after adding elements:");

        System.out.println("Set1");
        System.out.println(intset1.toString());
        System.out.println("Set2");
        System.out.println(intset2.toString());

        IntegerSet union = IntegerSet.union(intset1, intset2);
        IntegerSet intersection = IntegerSet.intersection(intset1, intset2);

        System.out.println("Union");
        System.out.println(union.toString());
        System.out.println("Intersection");
        System.out.println(intersection.toString());

        System.out.println("Delete elements from set1");

        n= num.nextInt();
        intset1.deleteElement(n);
        n= num.nextInt();
        intset1.deleteElement(n);
        n= num.nextInt();
        intset1.deleteElement(n);
        n= num.nextInt();
        intset1.deleteElement(n);
        n= num.nextInt();
        intset1.deleteElement(n);

        System.out.println("Delete elements from set2");

        n= num.nextInt();
        intset2.deleteElement(n);
        n= num.nextInt();
        intset2.deleteElement(n);
        n= num.nextInt();
        intset2.deleteElement(n);
        n= num.nextInt();
        intset2.deleteElement(n);
        n= num.nextInt();
        intset2.deleteElement(n);

        System.out.println("Remaining elements in Set1 and Set2 are:");

        System.out.println("Set1");
        System.out.println(intset1.toString());
        System.out.println("Set2"); 
        System.out.println(intset2.toString());

        if(union.isEqualTo(intersection))
        {
            System.out.println("Elements of Set1 and Set2 are the same");
        }
        else
        {
            System.out.println("Elements of Set1 and Set2 are different");
        }
    }
}