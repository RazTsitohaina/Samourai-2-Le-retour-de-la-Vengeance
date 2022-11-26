package personnages.secondaires;

import personnages.principales.Commercants;

public class Colporteur extends Commercants{
	
	public Colporteur(String nom, int argent) {
		super(nom,argent);
	}
	
	public int seFaireExtorquer() {
		int argent = this.getArgent()/2;
		this.perdreArgent(argent);
		this.parler("Je me suis fais extorquer j'ai perdue mon argent !!");
		this.parler("Mais je suis main j'ai donné que la moité! GNNGNGN");
		return argent;
	}
}
