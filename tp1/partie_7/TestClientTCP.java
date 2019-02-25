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
			OutputStream os = s.getOutputStream();	// la c'est des octets
			
	        PrintWriter pos = new PrintWriter(os);
	        BufferedReader  bis = new BufferedReader(new InputStreamReader(s.getInputStream()));
	        
	     
			// client demande des donnes a lutilisateur & les envoi au serveur
			System.out.println("Client : saisissez des donnees ...");
			Scanner sc = new Scanner(System.in);
			String lu = sc.nextLine();

			pos.println(lu);
			pos.flush();

			System.out.println("Client recoit du serveur :" + bis.readLine());
			
			
			// client se deconecte
			s.close();

		}catch( Exception e) {
			e.printStackTrace();
		}
		
	}

}
