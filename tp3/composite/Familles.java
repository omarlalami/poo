package composite;

import java.util.ArrayList;
import java.util.Date;

public class Familles implements Component {

	static ArrayList<Component> familles;

	public Familles() {
		this.familles = new ArrayList<Component>();
	}
	
	public static void fonderFamille(Component i1 , Component i2) {
		Component couple=null ;
		
		for(Component c : familles) {
			//if(c instanceof Individu) {
				if(c.equals(i1)) {
					couple = new Couple(i1, i2, new Date(2005,02,01) );
					System.out.println("mise a jour");
				}
			//}
		}
		for(Component c : familles) {
			//if(c instanceof Individu) {
				if(c.equals(i2))
					i2 = couple;
			//}
		}
	}
	
	public void add(Component composant) {
		familles.add(composant);
	}

	@Override
	public void remove(Component e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
	}
	
	
	
}
