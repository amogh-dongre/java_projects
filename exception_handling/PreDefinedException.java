/*
Problem is:
1. we want to generate two random numbers between 0 to 10 to assign those values to a and b. If either of the values are '0' throw ArithmeticException and if their product greater than 50, throw IndexOutOfBoundsException.
2. the above process is to repeated up to n times, where n value may be between 20 to 30.
int fortune = (int)(n * Math.random()) - to generate random numbers between 0 to n.
*/
class PreDefinedException
{
	public static void main(String ar[])
	{
		int iterCount = (int) (11*Math.random()) + 20;
		int a,b;
		for(int i=0;i<iterCount;i++)
		{
			a = (int) (11*Math.random());
			b = (int) (11*Math.random());
			try
			{
				if(a==0 || b==0)
					throw new ArithmeticException("Both a and b should not be zero.");
				else if ((a*b) > 50)
					throw new IndexOutOfBoundsException("Product of a and b greater than 50.");
				else
					System.out.println("The product is:"+(a*b));
			}
			catch(ArithmeticException ae)
			{
				ae.printStackTrace();
			}
			catch(IndexOutOfBoundsException iob)
			{
				iob.printStackTrace();
			}			
			
		}
	}
}