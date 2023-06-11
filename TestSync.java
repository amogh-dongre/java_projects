import java.io.*;
import java.util.*;
class TestSync {
	public static void main(String args[])
	{
		Sender send = new Sender();
		ThreadedSend S1 = new ThreadedSend(" S1 ", send);
		ThreadedSend S2 = new ThreadedSend(" S2 ", send);
		S1.start();
		S2.start();
		try {
			S1.join();
			S2.join();
		}
		catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}
class Sender {
	public void send(String msg)
	{
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(1000);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("\n" + msg + "Sent");
	}
}
class ThreadedSend extends Thread {
	private String msg;
	Sender sender;
	ThreadedSend(String m, Sender obj)
	{
		msg = m;
		sender = obj;
	}

	public void run()
	{
		synchronized (sender)
		{
		    sender.send(msg);
		}
	}
}
