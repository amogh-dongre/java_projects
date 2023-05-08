/*
Write an application in which you assign data to a mix of eight IncomingPhoneCall and OutgoingPhoneCall objects into an array. Use a for loop to display the data. Save the file as PhoneCallArray.java.
*/
import java.util.Scanner;
class PhoneCallArray
{
	public static void main(String ar[])
	{
		Scanner ip = new Scanner(System.in);
		PhoneCall pc[] = new PhoneCall[8];
		
		int choice;
		String pn;
		int time;
		for(int i=0;i<8;i++)
		{
			System.out.println("Enter 0 or 1 for Incoming call or Outgoing call:");
			choice = ip.nextInt();
			switch(choice)
			{
				case 0: System.out.println("Enter Phone Number:");
						pn = ip.next();
						pc[i]=new IncomingPhoneCall(pn);
						break;
				case 1: System.out.println("Enter Phone Number:");
						pn = ip.next();
						System.out.println("Call duration in minutes: ");
						time = ip.nextInt();
						pc[i]=new OutgoingPhoneCall(pn,time);
						break;
			}
		}
		for(int i=0;i<8;i++)
		{
			pc[i].displayCallInfo();
		}
	}
}