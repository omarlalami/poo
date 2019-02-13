package partie_6;

import java.io.Serializable;
import java.util.ArrayList;

public class Famille implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String nom;
	String prenom_pere;
	String prenom_mere;
	String nom_jeune_fille;
	ArrayList <Famille> engendre;
	
	public Famille(String nom, String prenom_pere, String prenom_mere, String nom_jeune_fille, ArrayList<Famille> engendre) {
		this.nom = nom;
		this.prenom_pere = prenom_pere;
		this.prenom_mere = prenom_mere;
		this.nom_jeune_fille = nom_jeune_fille;
		this.engendre = engendre;
	}
	
	@Override
	public String toString() {
		return "Famille [nom=" + nom + ", prenom_pere=" + prenom_pere + ", prenom_mere=" + prenom_mere
				+ ", nom_jeune_fille=" + nom_jeune_fille + ", engendre=" + engendre + "]";
	}

	
	
	
	
	
	
}
