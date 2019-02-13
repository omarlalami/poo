package partie_6;

import java.io.Serializable;

public class Mobile implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4835735765103422412L;

	/**
	 * 
	 */
	
	String Construteur;
	String Modele;
	int NbPixels;
	Integer RAM;
	Boolean Capacite4gPlus;
	float prix;
	
	
	public Mobile(String construteur, String modele, int nbPixels, Integer rAM, Boolean capacite4gPlus, float prix) {
		super();
		Construteur = construteur;
		Modele = modele;
		NbPixels = nbPixels;
		RAM = rAM;
		Capacite4gPlus = capacite4gPlus;
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "Mobile [Construteur=" + Construteur + ", Modele=" + Modele + ", NbPixels=" + NbPixels + ", RAM=" + RAM
				+ ", Capacite4gPlus=" + Capacite4gPlus + ", prix=" + prix + "]";
	}
	

}
