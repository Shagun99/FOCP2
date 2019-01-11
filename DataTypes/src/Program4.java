class Program4
{
  public static void main(String args[]) 
  {
    int min=560000, min1, min2;
    int years, months, days, minyear=60*24*365, minmonth=60*24*30;
    years= min/minyear;
    min1= min%minyear;
    months= min1/minmonth;
    min2= min1%minmonth;
    days= min2/(60*24);
    System.out.println(years + " years\t" + months + " months\t" + days +" days");
  }
}
