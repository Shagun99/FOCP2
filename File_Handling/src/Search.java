import java.io.*;
import java.util.*;

class Search
{
	public static void main(String[] args) 
	{
            Scanner sc = new Scanner(System.in);

		int sno;
		String fname, s;
		double cgpa;
		char grade;
		File f = null;

		try
		{   
                  f = new File("file.txt");
			FileWriter fout = new FileWriter(f);
                  BufferedWriter bout= new BufferedWriter(fout);

                  System.out.println("Enter a serial no:");
                  sno = sc.nextInt();
                  bout.write(Integer.toString(sno));
                  bout.newLine();

                  System.out.println("Enter name");
                  fname = sc.next();
                  bout.write(fname);
                  bout.newLine();

                  System.out.println("Enter cgpa ");
                  cgpa = sc.nextDouble();
                  bout.write(Double.toString(cgpa));
                  bout.newLine();

                  System.out.println("Enter grade");
                  grade = sc.next().charAt(0);
                  bout.write(grade);
                  bout.newLine();

                  bout.close();
	      
                  System.out.println("Enter word to be searched");
                  String word = sc.next();

                  String str;
                  
                  boolean flag = false;
                  FileReader fin = new FileReader(f);
                  BufferedReader bin= new BufferedReader(fin);
                  while((str = bin.readLine()) != null)
                  {
                        //System.out.println(str);
                        String[] strs = str.split("");
                        for(String st : strs)
                        {
                              //System.out.println(st);
                        if(st.equals(word))
                              {
                              flag = true;
                              break;
                              }
                        }
                  }

                  if((str = bin.readLine()) == null && flag == true)
                  {
                        System.out.println("Word found!");
                  }
                  else
                  {
                        System.out.println("Word not found!");
                  }
	      }
            catch(Exception e)
            {
                  e.printStackTrace();
            }
      }
}      