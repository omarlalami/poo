package partie_2;

import java.io.File;

public class SynchroniserDossiers {
	
	private static void recursive(String source, String dest, int p_c_date, int p_c_taille) {
		
		// si on a 2 dossiers, on verifie qu'on y a acc�es et on appel recursivement sur chaque contenue du rep1 et du rep2
		if( new File(source)!= null && (new File(source)).isDirectory() && new File(dest)!= null && (new File(dest)).isDirectory() )
		{
			File fs = new File(source);
			File fd = new File(dest);
		
			String fichiers[] = fs.list();
			String fichierd[] = fd.list();
			
			for (int i= 0; i<fichiers.length; i++) {
				for (int j= 0; j<fichierd.length; j++) {
					if ( fs.getName().equals( fd.getName() ) )
						recursive(fs.getName(),fd.getName(),p_c_date,p_c_taille);
				}
			}
		}
		// si on a 2 fichiers
		else if( new File(source)!= null && (new File(source)).isFile() && new File(dest)!= null && (new File(dest)).isFile() )
		{
			// si on a 2 fichiers de meme noms
			if( ( (new File(source)).getName() ).equals( (new File(dest)).getName() )    )
				if( p_c_date == 1 )
					
			
		}
			
			
			
	}
	
	public static void main(String[] args) {
		
		
		
		//					A FINIR
		
		
		
				// APPEL PROGRAMME EXEMPLE !		A LIRE
		
		
		
// synchroniserdossier "c/repertoire1" "c/repertoire2" taille date
// synchroniserdossier "c/repertoire1" "c/repertoire2" date
// synchroniserdossier "c/repertoire1" "c/repertoire2" date taille
		
// si on passe le parametre date on met la priorite au plus recent
// si on passe le parametre taille n met la priorite au plus lourd fichier
		
		
		
						// ICI JE FAIT LE PARAMETRAGE PAR DEFAULT
		
		
		
		// 0 signifie que l'on n'a pas activé de priorité !
		
		int priorite_critere_date=0;
		int priorite_critere_taille=0;
		
		
		// par default c'est le premier passé en parametre qui est la reference
		
		String repertoire_reference=args[0];
		String repertoire_cible=args[1];
		
		if(new File(repertoire_reference).isFile() || new File(repertoire_cible).isFile()) {
			System.out.println("On ne peut synchroniser uniquement 2 REPERTOIRE");
			System.exit(-1);
		}
		
						// ICI JE FAIT LE PARAMETRAGE SELON LES PARAMETRES SI ILS SONT ACTIVÉS

		

		if(args.length==3) {
			if(args[2]=="date")
				priorite_critere_date=1;
			else if(args[2]=="taille")
				priorite_critere_taille=1;
			else {
				// si on passe un autre parametre inconnu, on suppose c'est une erreur
				System.out.println("Les parametres sont faux, on n'accepte que taille ou date");
				System.exit(-1);
			}
		}
			
		if(args.length==4) {
			if(args[2]=="date" && args[3]=="taille") {
				priorite_critere_date=1;
				priorite_critere_taille=2;
			}
			else if(args[2]=="taille" && args[3]=="date") {
				priorite_critere_taille=1;
				priorite_critere_date=2;

			}
			else {
				// si on passe un autre parametre inconnu, on suppose c'est une erreure
				System.out.println("Les parametres sont faux, on n'accepte que taille ou date");
				System.exit(-1);
			}
		}


		
						// ON COMMENCE LE TRAITEMENT

		
	
	//
		
		
		
		recursive(args[0],args[1],priorite_critere_date,priorite_critere_taille);
		
		
		
		
		
	}

}
