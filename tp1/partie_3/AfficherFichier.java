package partie_3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class AfficherFichier {

	public static void main(String[] args) throws IOException {

	    File f=new File ("C:\\Users\\h14004615\\Downloads\\exo.txt");
	    
	    if (!f.exists()) {
			System.out.println("probleme : fichier n'existe pas");
			System.exit(-1);
	    	
	    }
	    
	    Reader reader=null;
	    
	    try {  
            reader = new FileReader("C:\\Users\\h14004615\\Downloads\\exo.txt");  
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();  
            }  
            reader.close();  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        } finally {
    		reader.close();
        }
		
	}

}
