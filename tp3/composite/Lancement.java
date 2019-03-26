package composite;

import java.sql.Date;

public class Lancement {

	public static void main(String[] args) {

		
		Component individuY1 = new Individu("nom1","prenom1",new Date(1995,12,12));
		Component individuY2 = new Individu("nom2","prenom2",new Date(1994,10,05));
		
		Component coupleY1 = new Couple(individuY1,individuY2,new java.util.Date(2000, 11, 7));
		
		Component enfantY1 = new Individu("nom3","prenom3",new Date(2002,04,05));
		Component enfantY2= new Individu("nom4","prenom4",new Date(2003,04,15));
		
		coupleY1.add(enfantY1);
		coupleY1.add(enfantY2);
		
		
		
		
		
		Component individuX1 = new Individu("nom1","prenom1",new Date(1995,12,12));
		Component individuX2 = new Individu("nom2","prenom2",new Date(1994,10,05));
		
		Component coupleX1 = new Couple(individuX1,individuX2,new java.util.Date(2000, 11, 7));
		
		Component enfantX1 = new Individu("nom3","prenom3",new Date(2002,04,05));
		Component enfantX2= new Individu("nom4","prenom4",new Date(2003,04,15));
		
		coupleX1.add(enfantX1);
		coupleX1.add(enfantX2);
		
		
		
		
		
		Familles famille = new Familles();
		
		famille.add(coupleX1);
		famille.add(coupleY1);
		
		Familles.fonderFamille(enfantX1,enfantY1);
		
		
		Component individuCommun = new Individu("nomXY1","prenomXY1",new Date(2005,02,02));
		enfantX1.add(individuCommun);
		
		coupleY1.affiche();
		
	}

}
