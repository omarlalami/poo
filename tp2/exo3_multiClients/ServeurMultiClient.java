package exo3_multiClients;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServeurMultiClient {
	
	
	public static void main (String[] args) {
		ArrayList<Thread> tabClient = new ArrayList<Thread>();
		
		try {
			ServerSocket sso = new ServerSocket(4467);
			
			while (true ) {
			
				Socket com = sso.accept();
				
				//flux de communication avec le client
				
				Traitement t = new Traitement(com);
				tabClient.add(t);
				
				// lancement traitement cote serveur
				t.start();
				
				
				
				
				//retour en attente de connexion
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
