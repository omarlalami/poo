package Relais;

public class MainKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int Distance = 2000;
		Starter bobby = new Starter();
		Kart k1 = new Kart(Distance,"Mario",1,null,bobby);
		Kart k2 = new Kart(Distance,"Luigi",2 ,k1 , bobby);
		Kart k3 = new Kart(Distance,"yoshi",3, k2,bobby);
		
		Kart k4 = new Kart(Distance,"peach",1,null,bobby);
		Kart k5 = new Kart(Distance,"Warrio",2,k4,bobby);
		Kart k6 = new Kart(Distance,"Toad",3,k5,bobby);
		bobby.start();
		k1.start();
		k2.start();
		k3.start();
		k4.start();
		k5.start();
		k6.start();
		
	}

}
