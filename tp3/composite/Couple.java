package composite;

import java.util.ArrayList;
import java.util.Date;

public class Couple implements Composant {

	Individu parent1;
	Individu parent2;
	Date dateMariage;
	ArrayList<Composant> enfants;
	
	public Couple(Individu parent1, Individu parent2, Date datemariage) {
		super();
		this.parent1 = parent1;
		this.parent2 = parent2;
		dateMariage=datemariage;
		enfants=new ArrayList<Composant>();
	}
	
	public void addEnfant(Composant enfant) {
		enfants.add(enfant);
	}
	public void removeEnfant(Composant enfant) {
		enfants.remove(enfant);
	}
	
}
