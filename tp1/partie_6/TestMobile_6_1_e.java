package partie_6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestMobile_6_1_e {

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile("samsung", "8", 9, 4, true, 800);
		
		// stockage
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			//fos = new FileOutputStream("C:\\Users\\l16024220\\Desktop\\test\\stocktel.txt");
			fos = new FileOutputStream("/home/pc/test.txt");

			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(m1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		// destockage
		
		
		
		Mobile m2=null;
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;

		try {
		//	fis = new FileInputStream("C:\\Users\\l16024220\\Desktop\\test\\stocktel.txt");
			fis = new FileInputStream("/home/pc/test.txt");

			ois = new ObjectInputStream(fis);
			
			m2 = (Mobile) ois.readObject();
			
			System.out.println(m2.toString());
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
