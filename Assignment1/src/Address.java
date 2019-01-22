/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose:  
*/

class Address
{

  String line1;
  String line2;
  String city;
  String state;
  int pinCode;

  	Address(String line1, String line2, String city, String state, int pinCode)
    { 
        this.line1= line1;
        this.line2= line2;
        this.city= city;
  		  this.state= state;
        this.pinCode= pinCode;
    }
/*
    Address()
    { 
        this.line1= "56A";
        this.line2= "South City-1";
        this.city= "Gurgaon";
  		this.state= "Haryana";
        this.pinCode= 122001;
    }
*/
    public void setAddr(String line1, String line2, String city, String state, int pinCode)
    {
      this.line1 = line1; 
      this.line2 = line2;
      this.city= city;
      this.state= state; 
      this.pinCode = pinCode;
    }
/*
    public String getAddr()
    {
      line1= line1;
      line2= line2;
      city= city;
      state= state;
      pinCode= pinCode;
      return (line1 + " " + line2 + " " + city + " " + state + " " + pinCode);
    }
*/

    public String displayAddress()
    {
      System.out.println("Line1: " + line1 + "\nLine2: " + line2 + "\nCity: " + city + "\nState: " + state + "\nPincode: " + pinCode);
      return "";
    	//System.out.println(line1 + " " + line2 + " " + city + " " + state + " " + pinCode);
    }

}