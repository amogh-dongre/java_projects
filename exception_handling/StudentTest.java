/*
Problem:
I want to clone student objects,where each object consists student id(int), student name(String).
Whenever we want to clone existing object
- the corresponding class should implement Cloneable interface
- the class should override clone() of Object's class. while overriding, you need to include the following statement: super.clone();
- clone() throws CloneNotSupportedException - Checked exception - we need to handle it.
- when ever we want to clone, use clone() with class object.
-Whenever we want to perform cloning, if the current object consists multiple sub objects, we need to recursively apply cloning for all subobjects. - deep cloning.
*/
class Address implements Cloneable
{
	String city;
	String state;
	Address(String city,String state)
	{
		this.city = city;
		this.state = state;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class Student implements Cloneable
{
	int sid;
	String sname;
	Address addr;
	Student(int sid,String sname,Address addr)
	{
		this.sid = sid;
		this.sname = sname;
		this.addr = addr;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		Student temp = (Student) super.clone();
		temp.addr = (Address)this.addr.clone();
		return temp;
	}
}
class StudentTest
{
	public static void main(String ar[]) throws CloneNotSupportedException
	{
		Address addr = new Address("Vijayawada","Andhra Pradesh");
		Student s1 = new Student(1,"Rama",addr);
		Student s2 = (Student)s1.clone();
		
		System.out.println(s2.sid+" "+s2.sname+" "+s2.addr.city+ " "+s2.addr.state);
	}
}