class Project
{
	String name;
	Date startDate;
	Date endDate;
	String role;
	String [] responsibilities = new String[50];
	int j;

	Project(String name, Date startDate, Date endDate, String role, String[] responsibilities)
	{
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.role = role;
		this.responsibilities = responsibilities;
	}
	/*Project()
	{
		this.name = "Ruby";
		this.startDate = 01/01/2000;
		this.endDate = 01/01/2001;
		this.role = "Manager";
		this.responsibilities = "";
	}*/

	public void setName(String name)
	{
		name = name;
	}

	public void setRole(String role)
	{
		role = role;
	}
	
	public void setStart(Date startDate)
	{
		startDate = startDate;
	}
	
	public void setEnd(Date endDate)
	{
		endDate = endDate;
	}

	public void setResp(String[] responsibilities, int j)
	{
		for (int i= 0; i< j; i++) 
		{
			responsibilities[i] = responsibilities[i];
		}
	}

	public String getName(String name)
	{
		return name;
	}

	public String getRole(String role)
	{
		return role;
	}
	
	public Date getStart(Date startDate)
	{
		return startDate;
	}
	
	public Date getEnd(Date endDate)
	{
		return endDate;
	}

	public String[] getResp(String[] responsibilities)
	{
		//for (int i= 0; i< j; i++) 
		{
			return responsibilities;
		}
	}
	
}

