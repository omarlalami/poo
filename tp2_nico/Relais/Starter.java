package Relais;

public class Starter extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i <5 ; i++)
		{
			System.out.println(">>"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {e.printStackTrace();}	
		}
			System.out.println("départ");
			synchronized(this)
			{
			this.notifyAll();
			}
	}
}
