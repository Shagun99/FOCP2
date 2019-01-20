class Qualification
{
	String qualName;
	String university;
	String institute;
	float cgpa;

  	Qualification(String qualName, String university, String institute, float cgpa)
    { 
        this.qualName = qualName;
        this.university = university;
        this.institute = institute;
  		this.cgpa = cgpa;
  	}

	/*Qualification()
    { 
        this.qualName = "B.Tech (CSE)";
        this.university = "NorthCap University";
        this.institute = "ABC Institute" ;
  		this.cgpa = 9.4;
  	}*/

  	public void setQualname(String qualName)
  	{
  		qualName = qualName;
  	}

  	public void setUniversity(String university)
  	{
  		university = university;
  	}

  	public void setInstitute(String institute)
  	{
  		institute = institute;
  	}

  	public void setCgpa(float cgpa)
  	{
  		cgpa = cgpa;
  	}

  	public String getQual()
  	{
  		return qualName;
  	}

  	public String getUniversity()
  	{
  		return university;
  	}

  	public String getInstitute()
  	{
  		return institute;
  	}

  	public float getCgpa()
  	{
  		return cgpa;
  	}
}