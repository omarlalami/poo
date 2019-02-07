package partie_1;

import java.io.File;

public class InformationsFichier {

	public static void main(String[] args) {
		File f = new File(args[0]);
		

		if (f.exists()) {
			
			
			if (f.isDirectory() ) {
				System.out.println("C'est un répertoire");
			}
			else
			{
				System.out.println("c'est un fichier");
				System.out.println(f.getName());
				System.out.println(f.length());
			}
		}else {
			System.out.println("Ce fichier n'existe pas ! ceci est un message d'ereur !");

		}
		
	}

}
