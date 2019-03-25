package exo2_debat;

public class Miagiste implements Runnable {
	
	int nbPhrase;
	String nom;
	Integer cle=0;
/*
 * on synchronise sur une variable
 * 
 * */	
/*	
	@Override
	public void run()
	{
		synchronized (cle) {
			for (int j= 0; j <this.nbPhrase; j++)
			{
				System.out.println("["+ this.nom +"] >> blablabla "+j);
				try {Thread.sleep(500);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
*/	
	
	/*
	 * on synchronise sur une methode
	 * 
	 */
	@Override
	public void run()
	{
		Miagiste.affiche(this);

	}
	
	static synchronized public void affiche(Miagiste m) {
		for (int j= 0; j <m.nbPhrase; j++)
		{
			System.out.println("["+ m.nom +"] >> blablabla "+j);
			try {Thread.sleep(500);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Miagiste (int nbPhrase, String nom)
	{
		super();
		this.nbPhrase=nbPhrase;
		this.nom=nom;
		
	}

}
