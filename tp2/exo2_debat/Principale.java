package exo2_debat;



public class Principale {

	public static void main(String[] args) {

		
		Miagiste Bobby = new Miagiste (3, "Bobby");
		Miagiste Philippe = new Miagiste (3, "Philippe");
		Miagiste Lucile = new Miagiste (3, "Lucile");
		
		Thread t1= new Thread(Bobby,Bobby.nom);
		Thread t2= new Thread(Philippe,Philippe.nom);
		Thread t3= new Thread(Lucile,Lucile.nom);
		
		t1.start();
		t2.start();
		t3.start();

		
	}

}
