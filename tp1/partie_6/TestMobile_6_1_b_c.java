package partie_6;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestMobile_6_1_b_c {
	
	public static void main(String[] args) {
		
		
		//		Question 6.1.b
		

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

 		
		//		Question 6.1.c
 		
 		/*
 		 * j'ai esseeyr de faire des test en modifiant serialVersionUID a 1L 2L .... mais le retour est pareil
 		 * 
 		 * j'ai separer l'ecriture et lecture en changeant serialVersionUID etre les 2 mais toujours pareil
 		 * 
 		 * conclusion : a priori le serialVersionUID n'influ pas .... c'est bizarre
 		 * 
 		 */
 		
 		
 		
 		
 		
 	}
}
