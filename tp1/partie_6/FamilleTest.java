package partie_6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FamilleTest {

	public static void main(String[] args) {
		
		
		/***************************************/
		// la famille f3 a comme descendant f1 & f2
		
		
		Famille f1 = new Famille("nom1","prenom_pere1","prenom_mere1","nom_jeune_fille1",null);
		Famille f2 = new Famille("nom2","prenom_pere2","prenom_mere2","nom_jeune_fille3",null);
		
		ArrayList descendant_de_f3= new ArrayList();
		
		descendant_de_f3.add(f1);
		descendant_de_f3.add(f2);
		
		Famille f3 = new Famille("nom1","prenom_pere1","prenom_mere1","nom_jeune_fille1",descendant_de_f3);
		
		
		/***************************************/
		// la famille f6 a comme descendant f5 & f4

		
		Famille f4 = new Famille("nom4","prenom_pere4","prenom_mere4","nom_jeune_fille4",null);
		Famille f5 = new Famille("nom5","prenom_pere5","prenom_mere5","nom_jeune_fille5",null);
		
		ArrayList descendant_de_f6= new ArrayList();
		
		descendant_de_f6.add(f4);
		descendant_de_f6.add(f5);
		
		Famille f6 = new Famille("nom6","prenom_pere6","prenom_mere6","nom_jeune_fille6",descendant_de_f6);
		
		
		/***************************************/
		// la famille f3 a comme descendant f6 & f3

		
		ArrayList descendant_de_f7= new ArrayList();
		descendant_de_f7.add(f3);
		descendant_de_f7.add(f6);

		Famille f7 = new Famille("nom7","prenom_pere7","prenom_mere7","nom_jeune_fille7",descendant_de_f7);
		
		
		/***************************************/

		// stockage
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			//fos = new FileOutputStream("C:\\Users\\l16024220\\Desktop\\test\\stocktel.txt");
			fos = new FileOutputStream("/home/pc/test.txt");

			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(f7);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		// destockage
		

		Famille f8=null;
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;

		try {
		//	fis = new FileInputStream("C:\\Users\\l16024220\\Desktop\\test\\stocktel.txt");
			fis = new FileInputStream("/home/pc/test.txt");

			ois = new ObjectInputStream(fis);
			
			f8 = (Famille) ois.readObject();
			
			System.out.println(f8.toString());
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
