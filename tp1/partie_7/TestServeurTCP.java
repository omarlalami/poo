package partie_7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestServeurTCP {

	public static void main(String[] args) {


		try {
			ServerSocket ecoute = new ServerSocket(18000, 5);
			Socket service = (Socket) null;
			
			while ( true ) {
				
				// on accepte une conexion
				service = ecoute.accept();
				
				
				//on a nos input & output
				OutputStream os = service.getOutputStream();
				InputStream is = service.getInputStream();
				
		        BufferedOutputStream bos = new BufferedOutputStream(os);
		        BufferedInputStream bis = new BufferedInputStream(is);
		         
		        
				// serveur recupere donnes du client & affiche les donnee
				System.out.println("Serveur recoit du client :" + bis.read());
				
				
				// serveur demande des donnes  a lutilisateur & les envoi au client
				System.out.println("Serveur : saisissez des donnees ...");
				Scanner s = new Scanner(System.in);
				bos.write((s.nextLine()).getBytes());
				
				
				// serveur close la conexion pour ce client
				service.close();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
