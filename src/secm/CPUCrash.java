package secm;

import java.util.Random;

public class CPUCrash extends Thread {
    public CPUCrash(String name) {
        super(name);
    }
	
	public void run() {
		 Random hazard = new Random();
		 
		 // pour l'éternité...
		 while(1==1) {
			 	long calcul_complexe = 0;
			 	
			 	// effectuer un calcul complexe...
				calcul_complexe = 999999999 * 2 / 4 +12 + (5*22*22*2012) * hazard.nextLong();
				
				//afficher une phrase informative...
		    	System.out.println("Calcul CPU en cours..." + " Thread " + this.getName() + " - bip! " + calcul_complexe);
		    }
		  }
	 

}
