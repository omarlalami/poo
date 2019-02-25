package partie_7;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class QcServeur {

	public static void main(String[] args) {

		// case par case du tableau ! 
/*
		
		
		try {
			ServerSocket ecoute = new ServerSocket(18000, 5);
			Socket service = (Socket) null;
			
			while ( true ) {
				
				// on accepte une conexion
				service = ecoute.accept();
				
				
				//on a nos input & output
				OutputStream os = service.getOutputStream();
				
		        PrintWriter pos = new PrintWriter(os);
		        BufferedReader  bis = new BufferedReader(new InputStreamReader(service.getInputStream()));
		        
		        String lu="";
		        int i=0;
				// serveur recupere donnes du client & affiche les donnee
		        while ((lu = bis.readLine()) != null ) {
					System.out.println("tab "+i+" = " + lu);
					i++;
		        }
				
				pos.flush();
				
				// serveur close la conexion pour ce client
				service.close();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
*/
		
		// reception tableau en entier

		try {
			
			ServerSocket ecoute = new ServerSocket(18000, 5);
			Socket service = ecoute.accept();
			
			InputStream is = service.getInputStream();

			ObjectInputStream ois = new ObjectInputStream(is);
			
			TableauSerialisable tableauSerialisable = (TableauSerialisable)ois.readObject();

			System.out.println("valeur a la position 1 :" +tableauSerialisable.getValTab(1));
			
			is.close();
			service.close();
			ecoute.close();

		}catch( Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
