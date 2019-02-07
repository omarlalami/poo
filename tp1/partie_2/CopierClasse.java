package partie_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopierClasse {

	public static void main(String[] args) throws IOException {
		
		
		File f0 = new File("C:\\Users\\h14004615\\Downloads\\baba.jpg");
		File f1 = new File("C:\\Users\\h14004615\\Downloads\\rep\\baba2.jpg");

// les verifications demandés !
	/*
	 * 
	 * 
		//File f0 = new File(args[0]);
		//	File f1 = new File(args[1]);
	 * 
		if (!f0.exists()) {
			System.out.println("probleme : premier fichier n'existe pas");
			System.exit(-1);
		}
		
		if(! args[0].endsWith(".class"))
		{
			System.out.println("probleme : premier fichier n'est pas un .class");
			System.exit(-1);
		}
	
		if (f1.exists()) {
			System.out.println("probleme : second fichier existe");
			System.exit(-1);
		}
	*/	
// début copie
		
		// fis c'est un tuyau vers un fichier
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//pour optimiser on met un buffer
		
		BufferedInputStream bis;
		BufferedOutputStream bos;
		
		
		try {
			
			fis = new FileInputStream(f0);
			fos = new FileOutputStream(f1);
			
			bis = new BufferedInputStream (fis);
			bos = new BufferedOutputStream (fos);
			
			int i=0;
			while((i=bis.read())!=-1){    
	             bos.write(i);    
	        }    
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			fis.close();
			fos.close();
		}
		
		System.exit(0);
	}

}
