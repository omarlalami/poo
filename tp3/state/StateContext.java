package state;

import java.util.Scanner;

public class StateContext {

	private State monEtatActuel;

	
	public StateContext() {
		super();
		this.monEtatActuel = new Reset();
		System.out.println("etat actuel : Reset");
	}
	

	public State getMonEtatActuel() {
		return monEtatActuel;
	}

	public void setMonEtatActuel(State monEtatActuel) {
		this.monEtatActuel = monEtatActuel;
	}


	public void lancer() {

		String newLine = System.getProperty("line.separator");
		
		Scanner sc = new Scanner(System.in);
		String str;
		while(true) {
			str = sc.nextLine();
			if( str.equals(" ") || str.equals("") )
				monEtatActuel = monEtatActuel.traiterToucheClavier(str);
			else
				System.out.println("touche entree incorrect");
		}
	}
	
	
	
	
}
