package partie_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DeplacerFichier {

	public static void main(String[] args) throws IOException 
	
	{
		
		InputStream is = null;
	    OutputStream os = null;

	    File fo=new File ("C:\\Users\\c14006708\\Downloads\\exo.txt");
	    File fd=new File ("C:\\Users\\c14006708\\Downloads\\dest\\exo.txt");
	    
	    
	    try {
	        is = new FileInputStream(fo);
	        os = new FileOutputStream(fd);
	        
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    	fo.delete();

	    }


	}

}
