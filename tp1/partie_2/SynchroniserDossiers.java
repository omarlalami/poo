package partie_2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Date;

import org.apache.commons.io.FileUtils;

public class SynchroniserDossiers {
	
	private static void recursive(String source, String dest, int p_c_date, int p_c_taille) {
		
		// si on a 2 dossiers, on verifie qu'on y a accees et on appel recursivement sur chaque contenue du rep1 et du rep2
		if( new File(source)!= null && (new File(source)).isDirectory() && new File(dest)!= null && (new File(dest)).isDirectory() )
		{
			System.out.println("on a 2 repertoires, on appel la fonction recursive");
			File fs = new File(source);
			File fd = new File(dest);
		
			String fichiers[] = fs.list();
			String fichierd[] = fd.list();

			for (int i= 0; i<fichiers.length; i++) {
				for (int j= 0; j<fichierd.length; j++) {
					if ( fichiers[i].equals(fichierd[j]) ) {
						System.out.println(source+"/"+fichiers[i] + " " +dest+"/"+fichierd[j]);
						recursive(source+"/"+fichiers[i] ,dest+"/"+fichierd[j],p_c_date,p_c_taille);
					}
				}
			}
		}
		// si on a 2 fichiers de meme noms et meme repertoire
		else if( new File(source)!= null && (new File(source)).isFile() && new File(dest)!= null && (new File(dest)).isFile() )
		{
			System.out.println("on a 2 fichiers, on copi");

			// si on a 2 fichiers de meme noms
			if( ( (new File(source)).getName() ).equals( (new File(dest)).getName() )    ) {
				
				if( p_c_date == 1 ) {			// on verifie si on a choisi une synchro par date
					
					Date d1 = new Date((new File(source)).lastModified());
					Date d2 = new Date((new File(dest)).lastModified());

					if ( d1.compareTo(d2)>0)	// si source est plus recent
						try {
							Files.copy( (new File(source)).toPath() , (new File(dest)).toPath());
						} catch (IOException e) {
							e.printStackTrace();
						}	
					else						// si dest est plus recent
						try {
							Files.copy( (new File(dest)).toPath() , (new File(source)).toPath());
						} catch (IOException e) {
							e.printStackTrace();
						}
				}
				else {							// si c'est pas une synchro par date alors soit c'est par taille qui a etais choisi, soit aucun des deux et du coup par taille devient le traitement par default pour mon cas
					
					try {
						if ( (new File(source)).length() > (new File(dest)).length() )					
							FileUtils.copyFile((new File(source)), (new File(dest)));
						else
							FileUtils.copyFile((new File(dest)), (new File(source)));

					} catch (IOException e) {
						e.printStackTrace();
					}	
				}
// la fonction copy est a corriger .... sa copy mais pas forcement du bon source au bon dest
				
			}
			else {// si o a 2 fichiers mais de noms differents
				
				// TODO
				
			}
					
			
		}
			
	}
	
	public static void main(String[] args) {
		
				
		
		
				// APPEL PROGRAMME EXEMPLE !		A LIRE
		
		
		
// synchroniserdossier "c/repertoire1" "c/repertoire2" taille date
// synchroniserdossier "c/repertoire1" "c/repertoire2" date
// synchroniserdossier "c/repertoire1" "c/repertoire2" date taille
		
// si on passe le parametre date on met la priorite au plus recent
// si on passe le parametre taille n met la priorite au plus lourd fichier
		
		
		
						// ICI JE FAIT LE PARAMETRAGE PAR DEFAULT
		
		
/*		
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
		
		*/
		
		recursive("/home/pc/test/source","/home/pc/test/dest",0,1);

		
		
	}

}
