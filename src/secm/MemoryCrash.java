package secm;

import java.util.ArrayList;
import java.util.Random;

public class MemoryCrash extends Thread {
    public MemoryCrash(String name) {
        super(name);
    }
	
	public void run() {
		// pour toute l'�ternit�...
		 ArrayList liste = new ArrayList();
		 while(1==1) {
			 // cr�ation d'un objet de 1024 octets 
			 byte[] memoire = new byte[1024];
			 
			 // ajout de l'objet � la liste
			 liste.add(memoire);
		     
			 System.out.println("Consommation de m�moire en cours..." + " Thread " + this.getName() + " - bip! ");
		    }
		  }
	 

}
