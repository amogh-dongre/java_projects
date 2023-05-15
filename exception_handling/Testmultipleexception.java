import java.util.*;
class exceptiondemo
{
int c;
void div(int a,int b)
{
try
{
c=a/b;
System.out.println("Result:"+c);
}
catch(ArithmeticException e)
{
System.out.println("Cannot divide by 0");
}
}
public static void main(String s[])
{
exceptiondemo ex=new exceptiondemo();
Scanner sc= new Scanner(System.in);
System.out.println("Enter a,b values:");
int a=sc.nextInt();
int b=sc.nextInt();
ex.div(a,b);
}
}
