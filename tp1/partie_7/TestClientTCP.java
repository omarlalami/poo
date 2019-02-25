package partie_7;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TestClientTCP {

	public static void main(String[] args) {

		try {
			
			// client se connecte au serveur
			Socket s = new Socket("localhost", 18000);
			
			
			//on a nos input & output
			OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();
			
	        BufferedOutputStream bos = new BufferedOutputStream(os);
	        BufferedInputStream bis = new BufferedInputStream(is);
	        
	        
			// client demande des donnes a lutilisateur & les envoi au serveur
			System.out.println("Client : saisissez des donnees ...");
			Scanner sc = new Scanner(System.in);
			bos.write((sc.nextLine()).getBytes());

			System.out.println("Client recoit du serveur :" + bis.read());
			
			
			// client se deconecte
			s.close();

		}catch( Exception e) {
			e.printStackTrace();
		}
		
	}

}
