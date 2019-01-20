class Date 
{
 
    int month;
    int day;
    int year;
     
    Date(int month, int day, int year) 
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /*Date()
    {
        this.day = 01;
        this.month = 01;
        this.year = 2000;
    }*/

    public void setDay (int day) 
    {
        day = day;
    }
     
    public int getDay() 
    {
        return day;
    }
     
    public void setMonth (int month) 
    {
        month = month;
    }
     
    public int getMonth() 
    {
        return month;
    }
     
    public void setYear (int year ) 
    {
        year = year;
    }
     
    public int getYear() 
    {
        return year;
    }
     
    public String displayDate () 
    {
        return (day + "/" + month + "/" + year);
    }
 
}
