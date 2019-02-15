package partie_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class TestCompression {

	public static void compression(String fichier1,String fichier2) {
		try {
			FileOutputStream fos = new FileOutputStream(fichier2);
			ZipOutputStream zipos = new ZipOutputStream(fos);
			
			FileInputStream fis = new FileInputStream(fichier1);
			
			ZipEntry ze = new ZipEntry("fichier.txt");
			zipos.putNextEntry(ze);
			
			int BUFFER = 2048;
			int count=0;
			byte[] data = new byte[BUFFER];
			
			while ((count = fis.read(data, 0, BUFFER)) != -1)
			{
				zipos.write(data, 0, count);
			}
			zipos.closeEntry();
			zipos.close();
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	public static void decompression(String fichier2,String fichier3) {
		try {
			FileInputStream fis = new FileInputStream(fichier2);
			ZipInputStream zis = new ZipInputStream(fis);
			
			ZipEntry entry=zis.getNextEntry();// si on a plusieurs fichiers on boucle sur zis.getnextentry
			
			if (entry!=null)
			{
				int count;
				int BUFFER = 2048;

				byte[] data = new byte[BUFFER];
				FileOutputStream fos = new FileOutputStream(fichier3);
				while ((count = zis.read(data, 0, BUFFER))!= -1){
					fos.write(data, 0, count); 
				}
				fos.close();
			}
			zis.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {

/*		String fichier1="C:\\Users\\l16024220\\Desktop\\test\\fichier1.txt";
		String fichier2="C:\\Users\\l16024220\\Desktop\\test\\fichier2.txt";
		String fichier3="C:\\Users\\l16024220\\Desktop\\test\\fichier3.txt";
*/
		String fichier1="/home/pc/test/testcompression_1";
		String fichier2="/home/pc/test/testcompression_2";
		String fichier3="/home/pc/test/testcompression_3";
		
		if ( new File(fichier1).exists() && ! new File(fichier2).exists() && ! new File(fichier3).exists())
			System.out.println("ok");
		else {
			System.out.println("erreur : fichier 1 n'existe pas OU fichier2,fichier3 existe");
			System.exit(1);
		}
		
		
		try {
			compression(fichier1,fichier2);
			decompression(fichier2,fichier3);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
	}
	

}
