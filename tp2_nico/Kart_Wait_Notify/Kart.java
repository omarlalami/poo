package Kart_Wait_Notify;

import java.util.Random;

public class Kart extends Thread {
	
	int distanceRestante; //20000
	String nom;
	//public static volatile boolean winner;
	int rang;
	Kart predecesseur;
	Starter st;
	
	public void afficheDistRest()
	{
		System.out.println(this.nom +"> Il me reste: "+this.distanceRestante);
	}
	

	
	public Kart(int distanceRestante, String nom, int rang, Kart predecesseur, Starter st) {
		super();
		this.distanceRestante = distanceRestante;
		this.nom = nom;
		this.rang = rang;
		this.predecesseur = predecesseur;
		this.st = st;
	}



	@Override
	public void run() 
	{
		if (rang==1)
			try {
				System.out.println("Je m'arrete en attendant le signal du strater");
				synchronized (st) { //Obliger de synchroniser 
					st.wait();
				}
				System.out.println(this.nom +"Je démarre");
				
			}
		catch (Exception e) {e.printStackTrace();}
		while((this.distanceRestante>0))
		{
			this.afficheDistRest();
			Random r = new Random();
			int dodlist= r.nextInt((9))+1;
			
			this.distanceRestante=this.distanceRestante-dodlist;
			
			
			/*
			try {
				Thread.sleep(50); // attente
			}
			catch (Exception e) {}
			}
			*/
		
		}
		}
	}

	
