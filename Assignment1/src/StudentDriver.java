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
		String firstName, lastName, eMail, contactNo, line1, line2, city, state, qualName, university, institute, name, role;
		float cgpa;
		int i, j, k, l, s, t, pinCode, daydob, monthdob, yeardob, startday, startmonth, startyear, endday, endmonth, endyear;		
		
		Scanner data= new Scanner(System.in);

		System.out.println("Enter First Name");
		firstName = data.next();
		
		System.out.println("Enter Last Name");
		lastName = data.next();

		System.out.println("Enter Address");
		
		System.out.println("Enter first line");
		line1 = data.nextLine();

		System.out.println("Enter second line");
		line2 = data.nextLine();

		System.out.println("Enter city");
		city = data.nextLine();

		System.out.println("Enter state");
		state = data.nextLine();

		System.out.println("Enter pincode");
		pinCode = data.nextInt();

		Address addr = new Address(line1, line2, city, state, pinCode);
		

		System.out.println("Enter Date of Birth");
		daydob = data.nextInt();
		monthdob = data.nextInt();
		yeardob = data.nextInt();
		Date dob = new Date(daydob, monthdob, yeardob);
		

		System.out.println("Enter number of Skills");
		k= data.nextInt();

		String [] skills = new String[k];

		for (i= 0; i< k; i++) 
		{
			System.out.println("Enter Skills");
			skills[i] = data.next();
		}

		System.out.println("Enter number of Qualifications");
		s= data.nextInt();
		Qualification[] qual = new Qualification[k];

		for (i= 0; i< s; i++) 
		{
			
			System.out.println("Enter details of Qualification" + (i+1));

			System.out.println("Enter qualification name");
			qual[i].qualName = data.next();

			System.out.println("Enter university");
			qual[i].university = data.next();

			System.out.println("Enter institute");
			qual[i].institute = data.next();

			System.out.println("Enter cgpa");
			qual[i].cgpa = data.nextFloat();
		}

		System.out.println("Enter Project Details");
		
			System.out.println("Enter number of projects");
			t = data.nextInt();

			Project[] projects = new Project[k];

			for(i= 0; i< t; i++)
			{
				System.out.println("Enter project name");
				projects[i].name = data.next();

				System.out.println("Enter start date");
				startday = data.nextInt();
				startmonth = data.nextInt();
				startyear = data.nextInt();
				Date startDate = new Date(startday, startmonth, startyear);
				projects[i].startDate = startDate;

				System.out.println("Enter end date");
				endday = data.nextInt();
				endmonth = data.nextInt();
				endyear = data.nextInt();
				Date endDate = new Date(endday, endmonth, endyear);
				projects[i].endDate = endDate;


				System.out.println("Enter role");
				projects[i].role = data.next();
				
				System.out.println("Enter number of responsibilities");
				l = data.nextInt();

				String[] responsibilities = new String[l];

				for (j= 0; j< l; j++) 
				{
					responsibilities[i] = data.nextLine();
				}
			}

		System.out.println("Enter Email");
		eMail = data.next();

		System.out.println("Enter Contact Number");
		contactNo = data.next();

		Student s1 = new Student(firstName, lastName, addr, dob, skills, qual, projects, eMail, contactNo);
		//System.out.println("Enter ");

		//System.out.println("Enter ");

		s1.setFname(firstName);
		s1.setLname(lastName);
		//s1.setAddr(line1);
		//s1.setAddr(line2);
		//s1.setAddr(city);
		//s1.setAddr(state);
		s1.setAddr(line1, line2, city, state, pinCode);
		s1.setDob(dob);
		s1.setSkills(skills);
		s1.setQual(qual, s);
		s1.setUniversity(university);
		s1.setInstitute(institute);
		s1.setCgpa(cgpa);
		s1.setName(name);
		s1.setStartDate(startDate);
		s1.setEndDate(endDate);
		s1.setRole(role);
		s1.setResp(responsibilities, j);
		s1.setProject(projects, t);
		s1.setEmail(eMail);
		s1.setContact(contactNo);


	}
}
