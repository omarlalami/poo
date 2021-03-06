package exo_1bis;

import java.util.Random;

public class Kart extends Thread{

	public static volatile boolean winner;	// on met volatile car meme si c'est static, les objets peuvent avoir le propre memoire
											// du coup on met volatile pour etre sur que ca check a chaque fois la valeur !
	int distanceRestante;	//20 000
	String nom;

	int rang;
	Kart predecesseur;
	Starter st;
	
	
	// Question a

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
				System.out.println(getName() + " a gagn� ! " + this.nom);
			}	
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
*/
	
	// Question b
/*
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
				System.out.println(getName() + " a gagn� ! " + this.nom);
			}	
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
*/
	
	// Question c

	/*
	@Override
	public void run() {
			try {
				System.out.println("je marrete en attendant le signal du starter");
				st.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		while( this.distanceRestante > 0 ){
			afficheDistRest();
			
//			distanceRestante--;
			
			Random r = new Random();
			int dodist = r.nextInt(9) + 1 ;
			distanceRestante-=dodist;
			
			if (distanceRestante <= 0 ) {
				Kart.winner=true;
				System.out.println(getName() + " a gagn� ! " + this.nom);
			}	
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
*/	
	// Question d

	@Override
	public void run() {
			try {
				System.out.println(this.nom + "je marrete en attendant le signal du starter");

				synchronized (st) {
					st.wait();
				}
			
			System.out.println(this.nom + "je demarre");
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		while( this.distanceRestante > 0 ){
			afficheDistRest();
			
//			distanceRestante--;
			
			Random r = new Random();
			int dodist = r.nextInt(9) + 1 ;
			distanceRestante-=dodist;
			
			if (distanceRestante <= 0 ) {
				Kart.winner=true;
				System.out.println(getName() + " a gagn� ! " + this.nom);
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
	

	public Kart(int distanceRestante, String nom) {		// Question a
		super();
		this.distanceRestante = distanceRestante;
		this.nom = nom;
		Kart.winner=false;
	}
	
	public Kart(int distanceRestante, String nom, int rang, Kart predecesseur) {		// Question b
		super();
		this.distanceRestante = distanceRestante / 2;
		this.nom = nom;
		Kart.winner=false;
		this.rang=rang;
		this.predecesseur=predecesseur;
	}
	
	public Kart(int distanceRestante, String nom,Starter bobby) {		// Question c
		super();
		this.distanceRestante = distanceRestante / 2;
		this.nom = nom;
		this.st=bobby;
	}
	
}






