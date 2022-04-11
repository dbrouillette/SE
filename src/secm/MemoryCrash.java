package secm;

import java.util.ArrayList;
import java.util.Random;

public class MemoryCrash extends Thread {
    public MemoryCrash(String name) {
        super(name);
    }
	
	public void run() {
		// pour toute l'éternité...
		 ArrayList liste = new ArrayList();
		 while(1==1) {
			 // création d'un objet de 1024 octets 
			 byte[] memoire = new byte[1024];
			 
			 // ajout de l'objet à la liste
			 liste.add(memoire);
		     
			 System.out.println("Consommation de mémoire en cours..." + " Thread " + this.getName() + " - bip! ");
		    }
		  }
	 

}
