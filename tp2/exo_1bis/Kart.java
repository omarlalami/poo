package exo_1bis;

import java.util.Random;

public class Kart extends Thread{

	public static volatile boolean winner;	// on met volatile car meme si c'est static, les objets peuvent avoir le propre memoire
											// du coup on met volatile pour etre sur que ca check a chaque fois la valeur !
	int distanceRestante;	//20 000
	String nom;

	int rang;
	Kart predecesseur;
	
/*
	@Override
	public void run() {
		
		while( this.distanceRestante > 0 && Kart.winner==false) {
			afficheDistRest();
			
//			distanceRestante--;
			
			Random r = new Random();
			int dodist = r.nextInt(9) + 1 ;
			distanceRestante-=dodist;
			
			if (distanceRestante <= 0 ) {
				Kart.winner=true;
				System.out.println(getName() + " a gagné ! " + this.nom);
			}	
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
*/
	@Override
	public void run() {
		if(rang==2) {
			try {
				System.out.println("je marrete en attendant mon predecesseur");
				predecesseur.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		while( this.distanceRestante > 0 ){
			afficheDistRest();
			
//			distanceRestante--;
			
			Random r = new Random();
			int dodist = r.nextInt(9) + 1 ;
			distanceRestante-=dodist;
			
			if (distanceRestante <= 0 ) {
				Kart.winner=true;
				System.out.println(getName() + " a gagné ! " + this.nom);
			}	
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public void afficheDistRest() {
		System.out.println(this.nom + " > il me reste : " + this.distanceRestante);
	}
	
/*
	public Kart(int distanceRestante, String nom) {
		super();
		this.distanceRestante = distanceRestante;
		this.nom = nom;
		Kart.winner=false;
	}
*/	
	public Kart(int distanceRestante, String nom, int rang, Kart predecesseur) {
		super();
		this.distanceRestante = distanceRestante / 2;
		this.nom = nom;
		Kart.winner=false;
		this.rang=rang;
		this.predecesseur=predecesseur;
	}
	
	
}
