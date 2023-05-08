/*
Q: Create a class Library with Bookno(int),void setBookNo(int), void display_BookNo() as members. Create another class Book which is a subclass of Library, String author, String title , void set_info(String author,String title), void disp_authntitle() are the members of class Book. Define an interface Branch, String sub_name="JAVA", void
disp_subname() are members of interface. Create another class Issue which extends Book class and implements the interface(Branch). Write a Test class to demonstrate the above (use classes and interface). Explain the output of the program.*/

class Library
{
	int Bookno;
	void setBookNo(int Bookno)
	{
		this.Bookno = Bookno;
	}
	void display_BookNo()
	{
		System.out.println("Book Number:"+Bookno);
	}
}
class Book extends Library
{
	String author;
	String title;
	void set_info(String author,String title)
	{
		this.author = author;
		this.title = title;
	}
	void disp_authntitle()
	{
		System.out.println("Author:"+author+" Title:"+title);
	}
}
interface Branch
{
	String sub_name = "Java";
	void disp_subname();
}
class Issue extends Book implements Branch
{
	Issue(String author, String title)
	{
		super.set_info(author,title);
	}
	public void disp_subname()
	{
		System.out.println("Subject Name:"+sub_name);
	}
}
class IssueTest
{
	public static void main(String ar[])
	{
		Issue i = new Issue("Rama","Java Programming");
		i.disp_authntitle();
		i.disp_subname();
	}
}