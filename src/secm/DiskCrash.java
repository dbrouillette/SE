package secm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Random;

public class DiskCrash extends Thread {
    public DiskCrash(String name) {
        super(name);
    }
	
	public void run() {
		PrintWriter fichier;
    	try {
    		File repertoire = new File("boums");

    		// cr�ation du r�pertoire
    		repertoire.mkdir();
    		
    		// d�termination du nom de fichier
    		String nom_du_fichier = repertoire.getAbsolutePath() + "\\" + this.getName() + "-boom.txt";
    		
    		// ouverture du fichier en �criture
			fichier = new PrintWriter(nom_du_fichier, "UTF-8");
			
			// pour toute l'�ternit�...
			while(1==1){
				
				// �crire des choses dans le fichier
				fichier.println("L' informatique est un domaine d'activit� scientifique, technique, et industriel concernant le traitement automatique de l'information num�rique par l'ex�cution de programmes informatiques h�berg�s par des dispositifs �lectriques-�lectroniques : des syst�mes embarqu�s, des ordinateurs, des robots, des automates, etc.");
				fichier.println("Certains domaines de l'informatique peuvent �tre tr�s abstraits, comme la complexit� algorithmique, et d'autres peuvent �tre plus proches d'un public profane. Ainsi, la th�orie des langages demeure un domaine davantage accessible aux professionnels form�s (description des ordinateurs et m�thodes de programmation), tandis que les m�tiers li�s aux interfaces homme-machine sont accessibles � un plus large public.");
				
				System.out.println("Le thread " + this.getName() + " vient d'�crire dans le fichier " + nom_du_fichier);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Oups, le thread " + this.getName() + "a plant�..." + e.getStackTrace());
		}
  }
	 

}
