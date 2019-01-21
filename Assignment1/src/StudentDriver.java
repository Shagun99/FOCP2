/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Create classes as defined: i) Student  ii) Address  iii) Qualification  iv) Project. 
   			Also create the associated and desired methods to input the student information from user and display it.
*/
import java.util.*;

public class StudentDriver
{
	public static void main(String args[])
	{
		String firstName, lastName, eMail, contactNo, line1, line2, city, state;
		String qualName, institute, university, name, role;
		float cgpa;
		int i, j, k, l, m, n, p, q, s, pinCode, daydob, monthdob, yeardob, startday, startmonth, startyear, endday, endmonth, endyear;		
		
		Scanner data= new Scanner(System.in);

		System.out.println("Enter the number of students");
		n = data.nextInt();
		Student[] student = new Student[n];
		for (i= 0; i< n; i++)
		{

		System.out.println("Enter First Name");
		firstName = data.next();
		
		System.out.println("Enter Last Name");
		lastName = data.next();

		System.out.println("Enter Address");
		
		System.out.println("Enter line1");
		line1 = data.next();

		System.out.println("Enter line2");
		line2 = data.next();

		System.out.println("Enter city");
		city = data.next();

		System.out.println("Enter state");
		state = data.next();

		System.out.println("Enter pincode");
		pinCode = data.nextInt();		

		System.out.println("Enter Date of Birth");
		daydob = data.nextInt();
		monthdob = data.nextInt();
		yeardob = data.nextInt();		

		System.out.println("Enter number of Skills");
		s= data.nextInt();
//		String skills;
		String[] sk = new String[s];
		for (m= 0; m< s; m++) 
		{
			System.out.println("Enter Skills");
			sk[m] = data.next();
		}

		System.out.println("Enter number of Qualifications");
		q= data.nextInt();
		Qualification[] ql = new Qualification[q];
		
		for (m= 0; m< q; m++) 
		{
			
			System.out.println("Enter details of Qualification" + (m+1));

			System.out.println("Enter qualification name");
			qualName = data.next();

			System.out.println("Enter university");
			university = data.next();

			System.out.println("Enter institute");
			institute = data.next();

			System.out.println("Enter cgpa");
			cgpa = data.nextFloat();
			
			ql[m]= new Qualification(qualName, university, institute, cgpa);

		}

		//Qualification qual = new Qualification(qualName, university, institute, cgpa);

		//System.out.println("Enter Project Details");
		
			System.out.println("Enter number of projects");
			p = data.nextInt();

			Project[] pr = new Project[p];
			//Project projects= new Project();
			for(m= 0; m< p; m++)
			{
			
				System.out.println("Enter project name");
				name = data.next();

				System.out.println("Enter start date");
				startday = data.nextInt();
				startmonth = data.nextInt();
				startyear = data.nextInt();
				//Date startDate = new Date(startday, startmonth, startyear);
				//pr[i].startDate = startDate;

				System.out.println("Enter end date");
				endday = data.nextInt();
				endmonth = data.nextInt();
				endyear = data.nextInt();
				//Date endDate = new Date(endday, endmonth, endyear);
				//pr[i].endDate = endDate;

				System.out.println("Enter role");
				role = data.next();
				
				System.out.println("Enter number of responsibilities");
				l = data.nextInt();

				String[] resp = new String[l];
		//		System.out.println("Enter responsibilities");
		//		String responsibilities;

				for (j= 0; j< l; j++) 
				{
					resp[j] = data.nextLine();
				}

				pr[m] = new Project(name, startday, startmonth, startyear, endday, endmonth, endyear, role, l);
			}
			
		//	Project projects= new Project(name, startday, startmonth, startyear, endday, endmonth, endyear, role, responsibilities);

		System.out.println("Enter Email");
		eMail = data.next();

		System.out.println("Enter Contact Number");
		contactNo = data.next();

		student[i] = new Student(firstName, lastName, line1, line2, city, state, pinCode, daydob, monthdob, yeardob, eMail, contactNo, s, q, p);
		student[i].setProject(pr);
		student[i].setSkills(sk);
		student[i].setQual(ql);
		student[i].displayDetails(p, q, s);

		}
	}
}	