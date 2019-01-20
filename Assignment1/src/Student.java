class Student
{

	String firstName;
	String lastName;
	Address addr;
	Date dob;
	String [] skills = new String[50];
	Qualification[] qual = new Qualification[10];
	Project [] projects = new Project[100];
	String eMail;
	String contactNo;
	int k;

	Student(String firstName, String lastName, Address addr, Date dob, String [] skills, Qualification[] qual, Project [] projects, String eMail, String contactNo)
	{
	this.firstName = firstName;
	this.lastName = lastName;
	this.addr = addr;
	this.dob = dob;
	this.skills = skills;
	this.qual = qual;
	this.projects = projects;
	this.eMail = eMail;
	this.contactNo = contactNo;
	}

	Student(String firstName, String lastName, Address addr, Date dob, String [] skills, Qualification[] qual, String eMail, String contactNo)
	{
	this.firstName = firstName;
	this.lastName = lastName;
	this.addr = addr;
	this.dob = dob;
	this.skills = skills;
	this.qual = qual;
	this.eMail = eMail;
	this.contactNo = contactNo;
	}

	public void setFname(String firstName)
	{
		firstName = firstName;
	}

	public void setLname(String lastName)
	{
		lastName = lastName;
	}
	
	public void setAddr(Address addr)
	{
		addr = addr;
	}
	
	public void setDob(Date dob)
	{
		dob = dob;
	}

	public void setSkills(String[] skills, int k)
	{
		for (int i= 0; i< k; i++) 
		{
			skills[i] = skills[i];			
		}
	}
	
	public void setQual(Qualification[] qual, int k)
	{
		for (int i= 0; i< k; i++) 
		{
			qual[i] = qual[i];
		}
	}

	public void setProject(Project[] projects, int k)
	{
		for (int i= 0; i< k; i++) 
		{
			projects[i] = projects[i];
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
	
	public Date getDob()
	{
		return dob;
	}

	public String[] getSkills()
	{
		//for (int i= 0; i< k; i++) 
		{
			return skills;
		}
	}
	
	public Qualification[] getQual()
	{
		//for (int i= 0; i< k; i++) 
		{
			return qual;			
		}
	}

	public Project[] getProject()
	{
		//for (int i= 0; i< k; i++) 
		{
			return projects;
		}
	}

	public String getEmail()
	{
		return eMail;
	}

	public String getContact()
	{
		return contactNo;
	}

}