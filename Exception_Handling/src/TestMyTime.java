import java.util.*;

class MyTime
{
// Private member variables 
	private int hour;
	private int minute;
	private int second;

	public MyTime() //non-parameterized constructor
	{
		this.hour = 00;
		this.minute = 00;
		this.second = 00;
	}

	public MyTime(int hour, int minute, int second)  //parameterized constructor
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	void setTime(int hour, int minute, int second)
	{
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	void setHour(int hour) // Setters which validates input with exception handling
	{
		if (hour >= 0 && hour <= 23)
		{
			this.hour = hour;
		} 
		else
		{
			throw new IllegalArgumentException("Invalid hour!");
		}
	}

	void setMinute(int minute)
	{
		if (minute >= 0 && minute <= 59)
		{
			this.minute = minute;
		}
		else
		{
			throw new IllegalArgumentException("Invalid minute!");
		}
	}

	void setSecond(int second)
	{
		if (second >= 0 && second <= 59)
		{
			this.second = second;
		}
		else
		{
			throw new IllegalArgumentException("Invalid second!");
		}
	}

	public int getHour()
	{
		return hour;
	}
	public int getMinute()
	{
		return minute;
	}
	public int getSecond()
	{
		return second;
	}

	public String toString()
	{
	return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public MyTime nextSecond()
	{
		++second;
		if (second == 60)
		{
			second = 0;
			++minute;
			if (minute == 60)
			{
				minute = 0;
				++hour;
				if (hour == 24)
				{ 
					hour = 0;
				}
			}
		}
		return this;
	}

	public MyTime nextMinute()
	{
		++minute;
		if (minute == 60)
		{
			minute = 0;
			++hour;
			if (hour == 24)
			{ 
				hour = 0;
			}

		}
		return this;
	}

	public MyTime nextHour()
	{
		++hour;
		if (hour == 24)
		{ 
			hour = 0;
		}
		return this;
	}

	public MyTime previousSecond()
	{
		--second;
		if (second == -1)
		{
			second = 59;
			--minute;
			if (minute == -1)
			{
				minute = 59;
				--hour;
				if (hour == -1)
				{ 
					hour = 23;
				}
			}
		}
		return this;	
	}
	
	public MyTime previousMinute()
	{
		--minute;
		if (minute == -1)
		{
			minute = 59;
			--hour;
			if (hour == -1)
			{ 
				hour = 23;
			}
		}
		return this;
	}
	
	public MyTime previousHour()
	{
		--hour;
		if (hour == -1)
		{ 
			hour = 23;
		}
		return this;
	}
}

public class TestMyTime
{
	public static void main(String[] args)
	{
		try
		{

			int h, m, s;
			Scanner time = new Scanner(System.in);

			System.out.println("Enter time in HH:MM:SS format");
			h = time.nextInt();
			m = time.nextInt();
			s = time.nextInt();

			MyTime mt1 = new MyTime();
			MyTime mt2 = new MyTime(h, m, s);

			mt2.setTime(h, m, s);

			System.out.println("Initial values of time");
			System.out.println(mt1.toString());
			System.out.println(mt2.toString());

			System.out.println("Displaying output of nextSecond");
			System.out.println(mt1.nextSecond());
			System.out.println(mt2.nextSecond());

			System.out.println("Displaying output of nextMinute");
			System.out.println(mt1.nextMinute());
			System.out.println(mt2.nextMinute());

			System.out.println("Displaying output of nextHour");
			System.out.println(mt1.nextHour());
			System.out.println(mt2.nextHour());

			System.out.println("Displaying output of previousSecond");
			System.out.println(mt1.previousSecond());
			System.out.println(mt2.previousSecond());

			System.out.println("Displaying output of previousMinute");
			System.out.println(mt1.previousMinute());
			System.out.println(mt2.previousMinute());

			System.out.println("Displaying output of previousHour");
			System.out.println(mt1.previousHour());
			System.out.println(mt2.previousHour());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}