package composite;

import java.util.Date;

public class Individu implements Component {

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
	
	public boolean equals(Individu individu) {
		return ( nom.equals(individu.nom) && prenom.equals(individu.prenom) && dateNaissance.equals(individu.dateNaissance) && dateDeces.equals(individu.dateDeces));
	}
	
	public void affiche() {
		System.out.println("nom : " + nom);
	}

	@Override
	public void add(Component e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Component e) {
		// TODO Auto-generated method stub
		
	}

}
