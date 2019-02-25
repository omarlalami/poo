package partie_7;

import java.io.Serializable;

public class TableauSerialisable implements Serializable {

    int [] tableauEntier = {0,1,2,3,4,5,6,7,8,9};
	
	public void TableauSerialisable() {
	}
	
	int getValTab(int indice) {
		return tableauEntier[indice];
	}

}
