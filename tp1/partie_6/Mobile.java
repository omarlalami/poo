package partie_6;

import java.io.Serializable;

public class Mobile implements Serializable{
	
	String Construteur;
	String Modèle;
	int NbPixels;
	Integer RAM;
	Boolean Capacité4gPlus;
	float prix;
	
	
	public Mobile(String construteur, String modèle, int nbPixels, Integer rAM, Boolean capacité4gPlus, float prix) {
		super();
		Construteur = construteur;
		Modèle = modèle;
		NbPixels = nbPixels;
		RAM = rAM;
		Capacité4gPlus = capacité4gPlus;
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "Mobile [Construteur=" + Construteur + ", Modèle=" + Modèle + ", NbPixels=" + NbPixels + ", RAM=" + RAM
				+ ", Capacité4gPlus=" + Capacité4gPlus + ", prix=" + prix + "]";
	}
	

}
