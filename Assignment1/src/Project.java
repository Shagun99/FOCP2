/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: 
*/
class Project
{

	String name;
	Date startDate;
	Date endDate;
	String role;
	String[] responsibilities;

	Project(String name, int startday, int startmonth, int startyear, int endday, int endmonth, int endyear, String role, int j)
	{
		this.name = name;
		this.startDate = new Date(startday, startmonth, startyear);
		this.endDate = new Date(endday, endmonth, endyear);
		this.role = role;
		this.responsibilities = new String[j];
	}
/*	Project()
	{
		this.name = "";
		this.startDate = 01/01/2000;
		this.endDate = 01/01/2001;
		this.role = "Manager";
		this.responsibilities = "";
	}

	public void setName(String name)
	{
		name = name;
	}

	public void setRole(String role)
	{
		role = role;
	}
	
	public void setStart(int startday, int startmonth, int startyear)
	{
		startDate = startDate;
	}
	
	public void setEnd(int endday, int endmonth, int endyear)
	{
		endDate = endDate;
	}
*/

	public void setResp(String[] resp)
	{
		//for (int i= 0; i< j; i++) 
		//{
			responsibilities = resp;
		//}
	}
/*
	public String getName()
	{
		return name;
	}

	public String getRole()
	{
		return role;
	}
	
	public Date getStart()
	{
		return startDate;
	}
	
	public Date getEnd()
	{
		return endDate;
	}
*/
	public String[] getResp()
	{
		//for (int i= 0; i< j; i++) 
		//{
			return responsibilities;
		//}
	}


	public String displayProjects()
	{
		//int i;
		System.out.println("Name of project: "+ name);
		System.out.println("Start date: ");
		startDate.displayDate();
		System.out.println("End date: ");
		endDate.displayDate();
		System.out.println("Role: "+ role);		
		System.out.println("Responsibilities: ");
		//for (i= 0; i< j; i++)
		//{
			System.out.println(getResp());
		//}
			return "";
	}	

}