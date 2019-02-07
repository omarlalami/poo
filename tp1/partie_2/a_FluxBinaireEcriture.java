package partie_2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class a_FluxBinaireEcriture {

	public static void main(String[] args) throws IOException 
	
	{
		
	    OutputStream os = null;

	    File fo=new File ("C:\\Users\\h14004615\\Downloads\\exo.txt");
	    
	    
	    try {
	        os = new FileOutputStream(fo);
	        

	        byte[] buffer = new byte[] {12,-25,45,-1,17,56};
	        os.write(buffer, 0, buffer.length);
	        

	    }
		catch(Exception e){
			System.out.println(e);
		}
	    finally {
	        os.close();

	    }


	}

}
