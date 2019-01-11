class Program3
{
  public static void main(String args[]) 
  {
    int count=1;
    System.out.println("Sno.\t DATATYPE \t SIZE \t\t MINIMUM VALUE \t\t MAXIMUM VALUE");
    System.out.println(count++ +"\t" + "Character"+"\t" + Character.SIZE +" bytes\t" + (int)Character.MIN_VALUE +"\t\t\t" + (int)Character.MAX_VALUE);
    System.out.println(count++ +"\t" + "Integer" +"\t\t" + Integer.SIZE +" bytes\t" + Integer.MIN_VALUE +"\t\t" + Integer.MAX_VALUE);
    System.out.println(count++ +"\t" + "Long" +"\t\t" + Long.SIZE +" bytes\t" + Long.MIN_VALUE +"\t" + Long.MAX_VALUE);
    System.out.println(count++ +"\t" + "Float" + "\t\t" + Float.SIZE +" bytes\t" + Float.MIN_VALUE +"\t\t\t" + Float.MAX_VALUE);
    System.out.println(count++ +"\t" + "Double" +"\t\t" + Double.SIZE +" bytes\t" + Double.MIN_VALUE +"\t\t" + Double.MAX_VALUE);
  }
}
