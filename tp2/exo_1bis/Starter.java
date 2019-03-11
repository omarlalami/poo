package exo_1bis;

public class Starter extends Thread {
	
	//question c
	
/*
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
*/
	
	//question d

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
		
		synchronized (this) {
			this.notifyAll();
		}
		
	}
	
	
	
}