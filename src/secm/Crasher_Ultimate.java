package secm;

import java.util.ArrayList;

public class Crasher_Ultimate {
	public static void main(String[] args) throws Exception {
		long nb_soldats = Long.parseLong(args[1]);
		Thread thread;
		ArrayList liste_de_thread = new ArrayList();
		
		// lancer le nombre de threads en fonction des soldats...
		for(long i =0; i< nb_soldats;i++) 
		{

			// si l'argument est CPU
			if(args[0].compareTo("cpu") == 0) 
			{
				// lancer un thread pour planter le processeur
				thread =  new CPUCrash("t" + i);
			} else 
			{
				if(args[0].compareTo("memoire") == 0) 
				{
					// cr�ation du thread pour remplir la m�moire
					thread =  new MemoryCrash("t" + i);
				} else 
				{
					// cr�ation du thread pour briser le disque
					if(args[0].compareTo("disque") == 0) 
					{
						thread =  new DiskCrash("t" + i);
					} else 
					{
						// sinon, type de traitement inconnu, on plante alors!
						throw new Exception("Param�tres invalide!");
					}
				}

			} 

			// lancement du thread pour d�marrer son ex�cution
			thread.start();
			
			// ajout du thread � la liste
			liste_de_thread.add(thread);
		}
	}
}