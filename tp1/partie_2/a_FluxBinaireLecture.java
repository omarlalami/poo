package partie_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class a_FluxBinaireLecture {

	public static void main(String[] args) throws IOException {
		
		InputStream is = null;
	    File fo=new File ("C:\\Users\\h14004615\\Downloads\\exo.txt");
	    
	    try {
	        is = new FileInputStream(fo);
	        
	        byte[] buffer = new byte[1024];
	        int length;
	        length = is.read(buffer);
	        
        	System.out.println(length);

	        for(int i = 0 ; i < length ; i++)
	        	System.out.println(buffer[i]);
	        
	        
	    }
		catch(Exception e){
			System.out.println(e);
		}
	    finally {
	        is.close();

	    }
	       
	}

}
