/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose:  
*/

class Student
{

	String firstName;
	String lastName;
	String line1, line2, city, state;
	Address addr;
	int pinCode;
	int daydob, monthdob, yeardob;
	Date dob;
	String[] skills;
	Qualification[] qual;
	Project[] projects;
	String eMail;
	String contactNo;
	int k;

	Student(String firstName, String lastName, String line1, String line2, String city, String state, int pinCode, int monthdob, int daydob, int yeardob, /*String skills, String qualName, String university, String institute, float cgpa, int startmonth, int startday, int startyear, String name, int endmonth, int endday, int endyear, String role, String responsibilities,*/ String eMail, String contactNo, int s, int p, int q)
	{
	this.firstName = firstName;
	this.lastName = lastName;
	this.addr = new Address(line1, line2, city, state, pinCode);
	this.dob = new Date(daydob, monthdob, yeardob);
	this.skills = new String[s];
	this.qual = new Qualification[q];
	this.projects = new Project[p];
	this.eMail = eMail;
	this.contactNo = contactNo;
	}

	Student(String firstName, String lastName, String line1, String line2, String city, String state, int pinCode, int monthdob, int daydob, int yeardob, /*String skills, String qualName, String university, String institute, float cgpa,*/ String eMail, String contactNo, int s, int q)
	{
	this.firstName = firstName;
	this.lastName = lastName;
	this.addr = new Address(line1, line2, city, state, pinCode);
	this.dob = new Date(monthdob, daydob, yeardob);
	this.skills = new String[s];
	this.qual = new Qualification[q];
	this.eMail = eMail;
	this.contactNo = contactNo;
	}

/*	public void setFname(String firstName)
	{
		firstName = firstName;
	}

	public void setLname(String lastName)
	{
		lastName = lastName;
	}
	
	public void setAddr(String line1, String line2, String city, String state, int pinCode)
	{
		line1= line1;
        line2= line2;
        city= city;
  		state= state;
        pinCode= pinCode;	
    }
	
	public void setDob(int daydob, int monthdob, int yeardob)
	{
		daydob = daydob;
		monthdob = monthdob;
        yeardob = yeardob;
	}

	public void setSkills(String skills)
	{
		//for (int i= 0; i< k; i++) 
		{
			skills = skills;			
		}
	}
	
	public void setQual(String qualName, String university, String institute, float cgpa)
	{
		//for (int i= 0; i< k; i++) 
		{
			qualName = qualName;
			university = university;
			institute = institute;
			cgpa = cgpa;
		}
	}

	public void setProject(String name, int startday, int startmonth, int startyear, int endday, int endmonth, int endyear, String role, String responsibilities)
	{
		//for (int i= 0; i< k; i++) 
		{
		name = name;
		startday = startday;
		startmonth = startmonth;
		startyear = startyear;
		endday = endday;
		endmonth = endmonth;
		endyear = endyear;
		role = role;
		responsibilities = responsibilities;
		}
	}

	public void setEmail(String eMail)
	{
		eMail = eMail;
	}

	public void setContact(String contactNo)
	{
		contactNo = contactNo;
	}

	public String getFname()
	{
		return firstName;
	}

	public String getLname()
	{
		return lastName;
	}
	
	public Address getAddr()
	{
		return addr;
	}
*/
	public void setDob(int daydob, int monthdob, int yeardob)
	{
		this.daydob = daydob;
		this.monthdob = monthdob;
		this.yeardob = yeardob;
	}

	public String getDob()
	{
		dob.setDate(daydob, monthdob, yeardob);
		return dob.displayDate();
	}


	public void setAddress(String line1, String line2, String city, String state, int pinCode )
	{
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public Address getAddr()
	{
		System.out.println("Line1: " + line1 + "\nLine2: " + line2 + "\nCity: " + city + "\nState: " + state + "\nPincode: " + pinCode);
		return addr;
	}

	public void setSkills(String[] sk)
	{
		this.skills = sk;
	}

	public void getSkills(int s)
	{
		//for (int i= 0; i< s; i++) 
		//{
		System.out.println(skills);
		//	return skills;
		//}
	}

	public void setQual(Qualification[] ql)
	{
		qual = ql;
	}
	
	public Qualification[] getQual()
	{
		//for (int i= 0; i< k; i++) 
//		{
			return qual;			
//		}
	}

	public void setProject(Project[] pr)
	{
		projects = pr;
	}


	public Project[] getProject()
	{
		//for (int i= 0; i< k; i++) 
//		{
			return projects;
//		}
	}

/*	public String getEmail()
	{
		return eMail;
	}

	public String getContact()
	{
		return contactNo;
	}
*/


	public void displayDetails(int p, int q, int s)
	{
		int i;

		System.out.println("\nStudent Name: " + firstName + " " + lastName);
		System.out.println("Date of birth: " + dob.displayDate());
		System.out.println("Email: " + eMail);
		System.out.println("Contact Number: " + contactNo);		
		System.out.println("Address ");
		System.out.println(addr.displayAddress());
		System.out.println("Skills: ");
		for(i= 0; i< s; i++)
		{
		System.out.println(skills[i]);
		}
		System.out.println("\nQualifications ");
		for(i= 0; i< q; i++)
		{
		System.out.println(qual[i].displayQualifications());
		}
		System.out.println("Project Details: ");
		for(i= 0; i< p; i++)
		{
		System.out.println(projects[i].displayProjects());
		}
	}
}








/*
class Student 
{
//	String firstName, lastName, eMail, contactNo;
//	Address addr;
//	Date dob;
//	String[] skills;
//	Qualification[] qual;
//	Project[] projects;

	Student(String fn, String ln, String em, String cn, String l1, String l2, String c, String s, int p, int d, int m, int y, int x, int v, int b)
	{
		Scanner input = new Scanner(System.in);
		int j;
//		firstName=fn;
//		lastName=ln;
//		eMail=em;
//		contactNo=cn;
		addr=new Address(l1,l2,c,s,p);
	    dob=new Date(d,m,y);
	    skills=new String[x];
	    System.out.println("enter skills");
	    for(j=0;j<x;j++)
	    {
	    	skills[j]=input.next();
	    }
	    qual=new Qualification[v];
	    String q, u, i;
	    double cgpa;
	    for(j=0;j<x;j++)
	    {
	    	System.out.println("enter qualName, university, institute, cgpa of number "+(j+1)+" Qualification");
	    	q=input.next();
	    	u=input.next();
	    	i=input.next();
	    	cgpa=input.nextDouble();
	    	qual[j]=new Qualification(q,u,i,cgpa);
	    }
	    projects= new Project[b];
	    String n, r;
	    String resp[];
	    int ds, ms, ys, dl, ml, yl, z;
	    for(j=0;j<b;j++)
	    {
	    	System.out.println("enter name, role, no. of responsibilities, startday, startmonth, startyear, finishday, finishmonth, finishyear of project number "+(j+1));
	    	n=input.next();
	    	r=input.next();
	    	z=input.nextInt();
	    	//h=z;
	    	ds=input.nextInt();
	    	ms=input.nextInt();
	    	ys=input.nextInt();
	    	dl=input.nextInt();
	    	ml=input.nextInt();
	    	yl=input.nextInt();
	    	projects[j] = new Project(n,r,ds,ms,ys,dl,ml,yl,z);
	    }
	}

	void DisplayStudent(int x, int v, int b)
	{
		int j;
		System.out.print(firstName+" "+lastName+" "+eMail+" "+contactNo+" ");
		for (j=0;j<x;j++)
		{
			System.out.print(skills[j]+" ");
		}
		addr.DisplayAddress();
		dob.DisplayDate();
		for (j=0;j<v;j++)
		{
			qual[j].DisplayQualification();
		}
		for (j=0;j<b;j++)
		{
			projects[j].DisplayProject(projects[j].getz());
		}
	}
}*/