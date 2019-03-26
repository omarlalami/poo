package composite;

import java.util.Date;

public class Individu implements Composant {

	String nom;
	String prenom;
	Date dateNaissance;
	Date dateDeces;

	public Individu(String nom, String prenom, Date dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	
	public void setDateDeces(Date dateDeces) {
		this.dateDeces = dateDeces;
	}
	
}
