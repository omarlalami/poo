package state;

public class Reset implements State {
	
	@Override
	public State traiterToucheClavier(String touche) {
		if(touche.equals(" ")) {
			System.out.println("etat actuel : En Marche");
			return new EnMarche();
		}
		else {
			System.out.println("fin");
			System.exit(0);
			return this;
		}
	}
}
