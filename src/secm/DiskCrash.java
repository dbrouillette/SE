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

    		// création du répertoire
    		repertoire.mkdir();
    		
    		// détermination du nom de fichier
    		String nom_du_fichier = repertoire.getAbsolutePath() + "\\" + this.getName() + "-boom.txt";
    		
    		// ouverture du fichier en écriture
			fichier = new PrintWriter(nom_du_fichier, "UTF-8");
			
			// pour toute l'éternité...
			while(1==1){
				
				// écrire des choses dans le fichier
				fichier.println("L' informatique est un domaine d'activité scientifique, technique, et industriel concernant le traitement automatique de l'information numérique par l'exécution de programmes informatiques hébergés par des dispositifs électriques-électroniques : des systèmes embarqués, des ordinateurs, des robots, des automates, etc.");
				fichier.println("Certains domaines de l'informatique peuvent être très abstraits, comme la complexité algorithmique, et d'autres peuvent être plus proches d'un public profane. Ainsi, la théorie des langages demeure un domaine davantage accessible aux professionnels formés (description des ordinateurs et méthodes de programmation), tandis que les métiers liés aux interfaces homme-machine sont accessibles à un plus large public.");
				
				System.out.println("Le thread " + this.getName() + " vient d'écrire dans le fichier " + nom_du_fichier);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Oups, le thread " + this.getName() + "a planté..." + e.getStackTrace());
		}
  }
	 

}
