package partie_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		
		String nom_fichier="C:\\Users\\h14004615\\Downloads\\exo3.txt";
	    
        FileWriter fr = null;
        BufferedWriter bwr = null;
	    
	    File f=new File (nom_fichier);
	    if ( f.exists()) {
	    	
			System.out.println("probleme : fichier existe deja");
			System.exit(-1);
	    	
	    }
	    else {
		    
			System.out.println("Entrer du texte :");
			
			// flux binaire le system.in
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String lu="\n";
			
			 try{
				 
				fr = new FileWriter(f);
				bwr = new BufferedWriter(fr);
				
				lu = br.readLine();
				while( ! lu.equals("FIN")) {
					System.out.println("lu : "+lu);

					bwr.write(lu+"\r\n");
					lu = br.readLine();

				}
				
	        }
			catch(Exception e){
		         e.printStackTrace();
	        }
			finally
	        {
	        	br.close();
	        	bwr.close();
	        	fr.close();
	        }
			 
	    }
	}

}
