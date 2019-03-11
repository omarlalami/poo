package exo_1bis;

public class Principale {

	public static void main(String[] args) {

		
		// Question a
/*
		int distance=20;
		
		Kart k0 = new Kart(distance,"mario");
		Kart k1 = new Kart(distance,"luigi");
		Kart k2 = new Kart(distance,"yoshi");
		
		k0.start();
		k1.start();
		k2.start();
		
*/
		// Question b

/*		
		int distance=100;
		
		Kart k1 = new Kart(distance,"mario",1,null);
		Kart k2 = new Kart(distance,"luigi",2,k1);
		
		k1.start();

		try {
			k1.join();	// le main attend la fin de k1 pour poursuivre
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		k2.start();
*/
		
		// Question c

		int distance=100;
		Starter bobby = new Starter();
		
		
		Kart k1 = new Kart(distance,"mario",bobby);
		Kart k2 = new Kart(distance,"luigi",bobby);
		
		
	//	bobby.start();

		
		k1.start();
		k2.start();
		
		bobby.start();
		
	}

}
