/*The Talk-A-Lot Cell Phone Company provides phone services for its customers. Create an abstract class named PhoneCall that includes a String field for a phone number and a double field for the price of the call. Also include a constructor that requires a phone number parameter and that sets the price to 0.0. Include a set method for the price. Also include three abstract get methods—one that returns the phone number, another that returns the price of the call, and a third that displays information about
the call. 
Create two child classes of PhoneCall: IncomingPhoneCall and OutgoingPhoneCall. The IncomingPhoneCall constructor passes its phone number parameter to its parent’s constructor and sets the price of the call to Rs.2/- per minute. The method that displays the phone call information displays the phone number, the rate, and the price of the call (which is the same as the rate). The OutgoingPhoneCall class includes an additional field that holds the time of the call in minutes. The constructor requires both a phone number and the time. The price is Rs. 4/- per minute, and the display method shows the details of the call, including the phone number, the rate per minute, the number of minutes, and the total price. Write an application that demonstrates you can instantiate and display both IncomingPhoneCall and OutgoingPhoneCall objects. Save the files as PhoneCall.java, IncomingPhoneCall.java, OutgoingPhoneCall.java, and DemoPhoneCalls.java.*/

abstract class PhoneCall
{
	String PhoneNum;
	double price;
	PhoneCall(String PhoneNum)
	{
		this.PhoneNum = PhoneNum;
		price = 0.0;
	}
	void setPrice(double price)
	{
		this.price = price;
	}
	abstract String getPhoneNum();
	abstract double getPrice();
	abstract void displayCallInfo();	
}
class IncomingPhoneCall extends PhoneCall
{
	IncomingPhoneCall(String PhoneNum)
	{
		super(PhoneNum);
		setPrice(2);
	}
	String getPhoneNum()
	{
		return PhoneNum;
	}
	double getPrice()
	{
		return price;
	}
	void displayCallInfo()
	{
		System.out.println("***** Incoming Phone Call Information *****");
		System.out.println("Phone Number:"+getPhoneNum()+"\n Rate of Call:"+getPrice()+"\n Total Price of call:"+getPrice());
	}
}
class OutgoingPhoneCall extends PhoneCall
{
	int time;
	OutgoingPhoneCall(String PhoneNum, int time)
	{
		super(PhoneNum);
		setPrice(4);
		this.time =  time;
	}
	String getPhoneNum()
	{
		return PhoneNum;
	}
	double getPrice()
	{
		return price;
	}
	void displayCallInfo()
	{
		System.out.println("***** Outgoing Phone Call Information *****");
		System.out.println("Phone Number:"+getPhoneNum()+"\n Rate of Call:"+getPrice()+"\n Time in Minutes:"+time +"\n Total Price of call:"+getPrice()*time);
	}
}
class DemoPhoneCalls
{
	public static void main(String ar[])
	{
		IncomingPhoneCall ipc1 = new IncomingPhoneCall("1234554321");
		OutgoingPhoneCall opc1 = new OutgoingPhoneCall("1234565432",6);
		ipc1.displayCallInfo();
		opc1.displayCallInfo();
	}
}