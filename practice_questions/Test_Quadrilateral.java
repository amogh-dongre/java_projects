class Point
{
	int x;
	int y;
	Point()
	{
		x=y=-1;
	}
	Point(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return "X val: "+x+" Y val: "+ y;
	}
}
class Quadrilateral
{
	Point p1,p2,p3,p4;
	Quadrilateral(Point p1,Point p2,Point p3,Point p4)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	double area()
	{
		return 0.0;
	}
	public String toString()
	{
		return "P1:"+p1.toString()+"P2:"+p2.toString()+"P3:"+p3.toString()+"P4:"+p4.toString();
	}
}
class Parallelogram extends Quadrilateral
{
	int base;
	int height;
	Parallelogram(Point p1,Point p2,Point p3,Point p4)
	{
		super(p1,p2,p3,p4);
	}
	Parallelogram(Point p1,Point p2, Point p3, Point p4, int base, int height)
	{
		this(p1,p2,p3,p4);
		this.base = base;
		this.height =  height;
	}
	double area()
	{
		return base * height;
	}
	public String toString()
	{
		return super.toString();
	}
}
class Rectangle extends Parallelogram
{
	int length;
	int width;
	Rectangle(Point p1,Point p2,Point p3,Point p4)
	{
		super (p1,p2,p3,p4);
	}
	Rectangle(Point p1,Point p2,Point p3,Point p4,int length,int width)
	{
		this(p1,p2,p3,p4);
		this.length = length;
		this.width = width;
	}
	double area()
	{
		return length*width;
	}
	public String toString()
	{
		return super.toString();
	}
}
class Square extends Rectangle
{
	int side;
	Square(Point p1,Point p2,Point p3,Point p4)
	{
		super(p1,p2,p3,p4);
	}
	Square(Point p1,Point p2,Point p3,Point p4, int side)
	{
		this(p1,p2,p3,p4);
		this.side = side;
		
	}
	double area()
	{
		return side * side;
		
	}
	public String toString()
	{
		return super.toString();
	}
}
class Test_Quadrilateral
{
	public static void main(String ar[])
	{
		Rectangle r = new Rectangle( new Point(30,20), new Point(60,20), new Point(30,50), new Point(60,50), 30,20);
		Quadrilateral q;
		q = r;
		double area  = q.area();
		System.out.println(r);
		System.out.println(area);
		Square s = new Square(new Point(30,20), new Point(45,20),new Point(30,35),new Point(45,35),15);
		q = s;
		area = q.area();
		System.out.println(s);
		System.out.println(area);
	}
}
