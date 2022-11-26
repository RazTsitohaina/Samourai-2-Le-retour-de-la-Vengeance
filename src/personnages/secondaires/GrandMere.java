package personnages.secondaires;

import personnages.Humain;
import java.util.Random;

public class GrandMere extends Humain{
	
	private Humain[] memoire;
	private int nbH;
	
	public GrandMere(String nom, int argent, Humain[] memoire) {
		super(nom,"tisane", argent);
		this.memoire = new Humain[30];
		this.nbH = 0;
	}
	
	private String humainHasard() {
		Random r = new Random();
		int choix = 1+r.nextInt(5);
		switch(choix) {
			case 1 :
				return "Ronin";
			case 2 :
				return "Commercant";
			case 3 :
				return "Samourai";
			case 4 :
				return "Yakuza";
			case 5 :
				return "Grand Mere";
			default :
				return "Humain";
		}
		
	}
	
	public void faireConnaissanceAvec(Humain h) {
		if(this.nbH!=30) {
			memoire[this.nbH]=h;
			this.nbH+=1;
			parler("Enchainter "+h.getNom());
		}
		else {
			parler("Oh je ne m'en souviens plus");
			}
	}
	
	public void ragoter() {
		for(int i = 0;i<this.nbH;i++) {
			Humain h = memoire[i];
			if (h instanceof Traitre) {
				parler(h.getNom()+ "est un TRAITRE");
			}
			else {
				parler("Je pense que "+h.getNom()+" est "+humainHasard());
			}
		}
	}
		
		
}
