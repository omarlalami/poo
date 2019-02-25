package partie_7;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class QcClient {

	public static void main(String[] args) {

		// case par case du tableau ! 
		
/*
		 
		try {
			
			// client se connecte au serveur
			Socket s = new Socket("localhost", 18000);
			
			
			//on a nos input & output
			OutputStream os = s.getOutputStream();
	        PrintWriter pos = new PrintWriter(os);
	        
	        int tableauEntier[] = {0,1,2,3,4,5,6,7,8,9};
	      
	        for ( int i = 0 ; i <tableauEntier.length ; i++ )
	        	pos.println(tableauEntier[i]);
	        
			pos.flush();			
			
			// client se deconecte
			s.close();

		}catch( Exception e) {
			e.printStackTrace();
		}
		
		
		
*/
		
		// envoi tableau en entier
	
		
		try {
			
			// client se connecte au serveur
			Socket s = new Socket("localhost", 18000);
			
			
			//on a nos input & output
			OutputStream os = s.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
	        
	        TableauSerialisable tableauEntier = new TableauSerialisable();
	      
	        oos.writeObject(tableauEntier);
	        oos.close();
	        
			// client se deconecte
			s.close();

		}catch( Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
