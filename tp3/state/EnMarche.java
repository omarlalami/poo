package state;

import java.util.concurrent.TimeUnit;

public class EnMarche implements State {

	@Override
	public State traiterToucheClavier(String touche) {
		if(touche.equals(" ")) {
			System.out.println("etat actuel : Stop");
			return new Stop();
		}
		else {
			try {
				System.out.println("on dors");
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("etat actuel : En Marche");
			return this;
		}
	
	}


}
