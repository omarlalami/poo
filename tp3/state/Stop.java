package state;

public class Stop implements State {

	@Override
	public State traiterToucheClavier(String touche) {
		if(touche.equals(" ")) {
			System.out.println("etat actuel : En Marche");
			return new EnMarche();
		}
		else {
			System.out.println("etat actuel : Reset");
			return new Reset();
		}
	}
}
