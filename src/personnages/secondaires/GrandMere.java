package personnages.secondaires;

import personnages.Humain;
import java.util.Random;

public class GrandMere extends Humain{
	private Humain[] memoire;
	
	public GrandMere(String nom, String boisson_fav, int argent, Humain[] memoire) {
		super(nom, boisson_fav, argent);
		this.memoire = new Humain[30];
	}
	
//	private String humainHasard() {
//		
//	}
}
