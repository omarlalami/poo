package composite;

import java.sql.Date;

public class Lancement {

	public static void main(String[] args) {

		
		Individu individu1 = new Individu("nom1","prenom1",new Date(1995,12,12));
		Individu individu2 = new Individu("nom2","prenom2",new Date(1994,10,05));
		
		Couple couple1 = new Couple(individu1,individu2,new java.util.Date(2000, 11, 7));
		
		Individu enfant1 = new Individu("nom3","prenom3",new Date(2002,04,05));
		Individu enfant2= new Individu("nom4","prenom4",new Date(2003,04,15));
		
		couple1.addEnfant(enfant1);
		couple1.addEnfant(enfant2);
		
		
		
		
	}

}
