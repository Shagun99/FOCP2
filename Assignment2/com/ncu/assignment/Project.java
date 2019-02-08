/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: 
*/

package ncu.assignment;

import ncu.assignment.Date;

class Project
{

	String name;
	Date startDate;
	Date endDate;
	int startday, startmonth, startyear, endday, endmonth, endyear, r;
	String role;
	String[] responsibilities;

	Project(String name, int startday, int startmonth, int startyear, int endday, int endmonth, int endyear, String role, int j)
	{
		this.name = name;
		this.startDate = new Date(startday, startmonth, startyear);
		this.endDate = new Date(endday, endmonth, endyear);
		this.role = role;
		this.responsibilities = new String[j];
		this.r = j;
	}
	Project()
	{
		this.name = "";
		this.startDate = new Date(01,01,2000);
		this.endDate = new Date(01,01,2000);
		this.role = "";
		this.responsibilities = new String[100];
	}
/*
	public void setName(String name)
	{
		name = name;
	}

	public void setRole(String role)
	{
		role = role;
	}
*/
	public void setStart(int startday, int startmonth, int startyear)
	{
		this.startday = startday;
		this.startmonth = startmonth;
		this.startyear = startyear;
	}
	
	public void setEnd(int endday, int endmonth, int endyear)
	{
		this.endday = endday;
		this.endmonth = endmonth;
		this.endyear = endyear;	
	}

	public void setResp(String[] resp)
	{
		for (int i= 0; i< r; i++) 
		{
			this.responsibilities[i] = resp[i];
		}
	}
/*
	public void setNresp(int l)
	{
		this.l = l;
	}

	public int getNresp()
	{
		return l;
	}

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
		int i; 
		//Project p = new Project();
		System.out.println("Name of project: "+ name);
		System.out.println("Start date: ");
		System.out.println(startDate.displayDate());
		System.out.println("End date: ");
		System.out.println(endDate.displayDate());
		System.out.println("Role: "+ role);		
		System.out.println("Responsibilities: ");
		//int r = p.getNresp();

		for (i= 0; i< r; i++)
		{
			System.out.println(responsibilities[i]);
		}
			return "";
	}	

}