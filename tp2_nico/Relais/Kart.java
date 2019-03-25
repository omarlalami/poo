package Relais;

import java.util.Random;

public class Kart extends Thread {

	public static boolean winner;
	public int distanceRestante; // = 20000;
	String nom;
	public int distanceParcouru;
	int rang;
	Kart prédecesseur;
	Starter st;
	
	public Kart (int distanceRestante , String nom , int rang , Kart prédecesseur,Starter st )
	{
		this.distanceRestante = distanceRestante;
		this.nom = nom;
		winner = false;
		this.rang = rang;
		 this.prédecesseur = prédecesseur;
		 this.st = st;
	}
	
		 
			public Kart (int distanceRestante , String nom , int rang  )
			{
				this.distanceRestante = distanceRestante;
				this.nom = nom;
				winner = false;
				this.rang = rang;
			}
	public void afficheDisRest()
	{
		System.out.println(this.nom + "> Il me reste : " +this.distanceRestante + " mètre");
	}
	@Override
	public void run()
	{
		if(rang==1)
		{
			System.out.println("j'attend le départ");
			try {
				synchronized(st) {
				st.wait();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("je démarre");
		}
		if(rang!=1)
		{
			try {
				synchronized(prédecesseur)
				{
					prédecesseur.wait();
				}
			}
			catch(InterruptedException e) {e.printStackTrace();}
		}
		
		while((this.distanceRestante>0) && (winner == false))
		{
			Random random = new Random();
			this.distanceParcouru = random.nextInt(40) + 80;
			this.afficheDisRest();
		 this.distanceRestante = this.distanceRestante - this.distanceParcouru;
		 if(this.distanceRestante < 200 )
		 {
			 synchronized(this)
			 {
				 this.notify();
			 }
		 }
		 try {
			Thread.sleep(80);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		}
		if(Kart.winner == false && rang == 3)
		{
			Kart.winner = true;
			System.out.println( this.nom + " à gagné");
		}
		
	}
}


