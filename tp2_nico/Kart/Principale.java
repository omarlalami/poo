package Kart;

public class Principale {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*
//1A
		int Distance=10;
		Kart k1=new Kart(Distance,"Mario",false);
		Kart k2=new Kart(Distance,"Luigi",false);
		Kart k3=new Kart(Distance,"Yoshi",false);
		
		k1.start();
		k2.start();
		k3.start();
		*/
		
		//1B
		
		int Distance=100;
		Starter booby= new Starter();
		
		Kart k1=new Kart(Distance,"Mario",1,null,booby);
		Kart k2=new Kart(Distance,"Luigi",1,null,booby);
		Kart k3=new Kart(Distance,"Yoshi",1,null,booby);
		Kart k4=new Kart(Distance,"Peach",1,null,booby);
		
		
		
		
		//Kart k3=new Kart(Distance,"Yoshi",false);
		
		k1.start();
		k2.start();
		k3.start();
		k4.start();
		
		booby.start();
	}

}
