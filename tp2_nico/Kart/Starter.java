package Kart;

public class Starter extends Thread {

	public void run()
	{
		for (int i=5;i>0;i--)
		{
			System.out.println(">>"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println("PARTEZ !!!!");
	}
}
