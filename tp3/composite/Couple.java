package composite;

import java.util.ArrayList;
import java.util.Date;

public class Couple implements Component {

	Component parent1;
	Component parent2;
	Date dateMariage;
	ArrayList<Component> enfants;
	
	public Couple(Component parent1, Component parent2, Date datemariage) {
		super();
		this.parent1 = parent1;
		this.parent2 = parent2;
		dateMariage=datemariage;
		enfants=new ArrayList<Component>();
	}
	
	public void add(Component composant) {
		enfants.add(composant);
	}
	public void remove(Component composant) {
		enfants.remove(composant);
	}
	
	public void fonderFamille() {
		
	}
	
	public void affiche() {

		parent1.affiche();
		parent2.affiche();
		System.out.println("enfants : ");
		for(Component c : enfants) {
			c.affiche();
		}

	}
	
	
}
