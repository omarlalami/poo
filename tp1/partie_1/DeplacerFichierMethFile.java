package partie_1;

import java.io.File;

public class DeplacerFichierMethFile {

	public static void main(String[] args) {
		

	    File fo=new File ("C:\\Users\\c14006708\\Downloads\\exo.txt");
	    File fd=new File ("C:\\Users\\c14006708\\Downloads\\dest\\exo.txt");
	    
	    
	    
	    fo.renameTo(fd);
	}

}
