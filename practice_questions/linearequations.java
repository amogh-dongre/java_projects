class LinearEquation
{
	int a,b,c,d,e,f;
	//Assume that we have get and set methods.
	LinearEquation(int a,int b,int c,int d,int e,int f)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	boolean isSolvable()
	{
		return (a*d-b*c)!=0?true:false;
	}
	double getX()
	{
		return (e*d - b*f)/(a*d-b*c);
	}
	double getY()
	{
		return (a*f - e*c)/(a*d-b*c);
	}
}
class TestLinearEquation
{
	public static void main(String ar[])
	{
		LinearEquation le =  new LinearEquation(2,3,4,5,6,7);
		if(le.isSolvable())
		{
			System.out.println("x val: "+le.getX()+" y val: "+le.getY());
		}
		else
		{
			System.out.println("The linear equation with given values are not solvable.");
		}
	}
}
