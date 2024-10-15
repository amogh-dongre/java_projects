/*
Create a class Sum and a method series() to generate the series x+2x+3x+..+nx. Using throws, if the sum of the series is odd it has to raise an user defined exception "OddSumException" and print the message "Odd Sum Exception" and if it is even, it has to raise an user defined exception "EvenSumException" and print "
Even Sum Exception".
Class :Sum
Variable: private x, n (int)
Constructor to initialize the variable x and n
Method :void Series()

To create UDE, the steps to be followed:
1. create a class which should extend "RuntimeException" - Unchecked, or extend "Exception" - Checked.
2. In the class, based on the case which is mentioned in the given question, it is some times necessary to create instance variables to refer the type/status/etc., of exception.
3. in our example, it is not necessary to create any instance variable.
4. In the constructor, we create a statement "super(msg)" to give information to default exception handler.
5. We need to override toString() to print custom message for your exception.

*/
class OddSumException extends RuntimeException
{
	OddSumException()
	{
		super("OddSumException");
	}
	/*public String toString()
	{
		return("Sum is Odd.");
	}*/
}
class EvenSumException extends RuntimeException
{
	EvenSumException()
	{
		super("EvenSumException");
		
	}
	/*public String toString()
	{
		return("Sum is Even.");
	}*/
}
class Sum
{
	private int x,n;
	Sum(int x,int n)
	{
		this.x = x;
		this.n = n;
	}
	void Series()
	{
		int prod = 0;
		for(int i=1;i<=n;i++)
		{
			prod = prod + (i*x);
		}
		try
		{
			if(prod%2 == 0)
			throw new EvenSumException();
			else
			throw new OddSumException();
		}
		catch(EvenSumException ese)
		{
			//System.out.println(ese);
			ese.printStackTrace();
		}
		catch(OddSumException ose)
		{
			//System.out.println(ose);
			ose.printStackTrace();
		}
		
	}
	public static void  main(String ar[])
	{
		Sum s = new Sum(5,7);
		s.Series();
	}
}