package partie_6;

import java.io.Serializable;

public class Mobile implements Serializable{
	
	String Construteur;
	String Mod�le;
	int NbPixels;
	Integer RAM;
	Boolean Capacit�4gPlus;
	float prix;
	
	
	public Mobile(String construteur, String mod�le, int nbPixels, Integer rAM, Boolean capacit�4gPlus, float prix) {
		super();
		Construteur = construteur;
		Mod�le = mod�le;
		NbPixels = nbPixels;
		RAM = rAM;
		Capacit�4gPlus = capacit�4gPlus;
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "Mobile [Construteur=" + Construteur + ", Mod�le=" + Mod�le + ", NbPixels=" + NbPixels + ", RAM=" + RAM
				+ ", Capacit�4gPlus=" + Capacit�4gPlus + ", prix=" + prix + "]";
	}
	

}
