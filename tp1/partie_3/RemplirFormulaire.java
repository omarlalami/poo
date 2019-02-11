package partie_3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class RemplirFormulaire {

	public static void main(String[] args) {
	
		
		
		// modifier la sortie standar et lentree standar

		PrintStream out=null;
		BufferedInputStream in=null;
		
		try {
			
			in = new BufferedInputStream( new FileInputStream("C:\\Users\\l16024220\\Desktop\\test\\entree.txt") );
		    System.setIn(in);
		    
		    out = new PrintStream( new BufferedOutputStream( new FileOutputStream("C:\\Users\\l16024220\\Desktop\\test\\sortie.txt") ) );
		    System.setOut(out);

		    BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		    
		    String s;
		    
		    while((s = br.readLine()) != null)
		        System.out.println(s);
		    
		}catch( Exception e) {
			
		}finally {
			out.close();
		}


		
		
		// ca marche mais nous on veut rediriger la sortie & entree standard
		/*
		String fichier_entree="/home/pc/rep_test/user";
		String fichier_sortie="/home/pc/rep_test/resultat";
		
		try {
						
			InputStream flux_in=new FileInputStream(fichier_entree); 
			InputStreamReader lecture=new InputStreamReader(flux_in);
			BufferedReader buff_in=new BufferedReader(lecture);
			
			OutputStream flux_out = new FileOutputStream(fichier_sortie);
			OutputStreamWriter ecriture=new OutputStreamWriter(flux_out);
			BufferedWriter buff_out = new BufferedWriter(ecriture);
			
			
			String ligne;
			
			while ((ligne=buff_in.readLine())!=null){
				System.out.println(ligne);
				buff_out.write(ligne+"\n");		// pour linux
				//buff_out.write(ligne+"\r\n");	// pour windows !

			}
			
			buff_in.close();
			buff_out.close();
		}
		catch(Exception e){
			System.out.println(e.toString());
		}*/
		
	}

}
