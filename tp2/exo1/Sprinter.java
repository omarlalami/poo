package exo1;

import java.util.Random;

import exo_1bis.Starter;

public class Sprinter extends Thread{

	
	int distanceRestante;	// 1 000
	String nom;
	int rang;
	Starter st;
	Sprinter pred;
	
	public Sprinter(int distanceRestante, String nom, int rang,Sprinter pred) {
		super();
		this.distanceRestante = distanceRestante;
		this.nom = nom;
		this.rang = rang;
		this.pred = pred;
	}
	
	@Override
	public void run() {
		if(rang==1) {
			
			try {
				System.out.println(this.nom + "je marrete en attendant le signal du starter");

				synchronized (st) {
					st.wait();
				}
			
			System.out.println(this.nom + "je demarre");
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		else {
			try {
				synchronized (pred) {
					pred.wait();
			}
			System.out.println(this.nom + "je demarre");
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while( this.distanceRestante > 0) {
			afficheDistRest();
			
//			distanceRestante--;
			
			Random r = new Random();
			int dodist = r.nextInt(9) + 1 ;
			distanceRestante-=dodist;
			
			if (distanceRestante <= 0 ) {
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
	
	
}
