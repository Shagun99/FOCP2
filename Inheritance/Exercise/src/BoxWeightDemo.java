import java.util.*;

class Box1
{
	float height;
	float width;
	float depth;

	Box1()
	{
		this.height = 0;
		this.width = 0;
		this.depth = 0;
	}

	Box1(float h, float w, float d)
	{
		this.height = h;
		this.width = w;
		this.depth = d;
	}

	Box1(Box1 b)
	{
		this.height = b.height;
		this.width = b.width;
		this.depth = b.depth;
	}

	public void setDimension(float h, float w, float d)
	{
		this.height = h;
		this.width = w;
		this.depth = d;
	}

	public float getHeight()
	{
		return height;
	}

	public float getWidth()
	{
		return width;
	}

	public float getDepth()
	{
		return depth;
	}

	public float getVolume()
	{
		float volume = height*width*depth;
		return volume;
	}

}

class BoxWeight extends Box1
{
	float weight;
	BoxWeight()
	{
		super();
		this.weight = 0;
	}

	BoxWeight(float h, float w, float d, float wt)
	{
		super(h,w,d);
		this.weight = wt;
	}

	BoxWeight(BoxWeight bw)
	{
		/*this.height = bw.height;
		this.width = bw.width;
		this.depth = bw.depth;*/
		super(bw.height,bw.width,bw.depth);
		this.weight = bw.weight;
	}

	public void setDimensions(float wt)
	{
		this.height = super.height;
		this.width = super.width;
		this.depth = super.depth;
		this.weight = wt;
	}

	public float getHeight()
	{
		return super.height;
	}

	public float getWidth()
	{
		return super.width;
	}

	public float getDepth()
	{
		return super.depth;
	}

	public float getWeight()
	{
		return weight;
	}

	public float displayVol()
      {
    	return super.getVolume();
      }
}

class BoxWeightDemo
{
	public static void main (String args [])
 	{
 		Scanner num = new Scanner(System.in);

 		float h, w, d, wt;

 		BoxWeight b1 = new BoxWeight();
 		

 		System.out.println("Enter height");
 		h = num.nextFloat();

 		System.out.println("Enter width");
 		w = num.nextFloat();

		System.out.println("Enter depth");
		d = num.nextFloat();

		System.out.println("Enter weight");
		wt = num.nextFloat();		

 		BoxWeight b2 = new BoxWeight(h, w, d, wt);
 		b2.setDimensions(wt);


 		System.out.println("Details of Box 1");

 		System.out.println( "Width = "+  b1.getWidth());
 		System.out.println( "Height = "+ b1.getHeight()); 		
 		System.out.println( "Depth = "+ b1.getDepth());
 		System.out.println( "Weight = "+ b1.getWeight());
		System.out.println( "Volume = ");
		System.out.println(b1.displayVol()); 	
 		System.out.println("Details of Box 2");

 		System.out.println( "Width = "+  b2.getWidth());
 		System.out.println( "Height = "+ b2.getHeight()); 		
 		System.out.println( "Depth = "+ b2.getDepth());
 		System.out.println( "Weight = "+ b2.getWeight());
		System.out.println( "Volume = ");
		System.out.println(b2.displayVol());
 	}

}