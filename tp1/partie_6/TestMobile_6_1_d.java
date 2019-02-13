package partie_6;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestMobile_6_1_d {

	public static void main(String[] args) {
		
		
		//		Question 6.1.d
		
		/*
		 * on appel le code pour stocker et on commente la partie destockage
		 * on execute le code
		 * on ajoute des donnes membre a la classe
		 * on commente le code pour stocket et on appel le code pour destocker
		 * ps : ne pas oublier d'adapter la class Mobile : variable masse & methode toString
		 * 
		 */
 		// en changeant SVUID
		// ici je l'ai pas tester a cause du 6.1.c
		
		
 		// sans changer SVUID
 		/*une fois stocker, lorsqu'on rajoute une variable a la classe et que l'on recupere les donnes du fichier
		 * nos objets on les valeurs par default pour les variable nouvelles qu'on a inserer dans la classe
		 * 
		 * Par contre lorsqu'on stock nos objets avec a variable masse et que l'on modifie notre classe
		 * en enlevant cette variable avant de destocker
		 * le programme ne recupere pas la valeur de masse 
		 */
		
		
		
 		Mobile m1 = new Mobile("samsung", "8", 8, 4, true, 800);
 		Mobile m2 = new Mobile("sony", "9", 5, 5, true, 700);
 		Mobile m3 = new Mobile("iphone", "10", 6, 2, true, 1000);

 		// stockage

 		FileOutputStream fos=null;
		ObjectOutputStream oos=null;

 		try {
			fos = new FileOutputStream("/home/pc/test.txt");
			oos = new ObjectOutputStream(fos);

 			oos.writeObject(m1);
 			oos.writeObject(m2);
 			oos.writeObject(m3);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
 	
		
 		// destockage
 		

 		Mobile m5=null;
 		Mobile m6=null;
 		Mobile m7=null;

 		FileInputStream fis=null;
		ObjectInputStream ois=null;

 		try {
			fis = new FileInputStream("/home/pc/test.txt");
			ois = new ObjectInputStream(fis);

 			m5 = (Mobile) ois.readObject();
 			m6 = (Mobile) ois.readObject();
 			m7 = (Mobile) ois.readObject();

 			System.out.println(m5.toString());
 			System.out.println(m6.toString());
 			System.out.println(m7.toString());

 		}
		catch(Exception e) {
			e.printStackTrace();
		}
 		
		
		
		
		
		
	}

}
