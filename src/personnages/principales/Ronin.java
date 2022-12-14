package personnages.principales;

import personnages.Humain;

public class Ronin extends Humain{
	private int honneur;
	
	/**
	 * Constructeur du Ronin
	 * @param nom
	 * @param boisson_fav
	 * @param argent
	 */
	public Ronin(String nom, String boisson_fav, int argent) {
		super(nom,boisson_fav,argent);
		this.honneur = 1;
	}
	
	
	public int getHonneur() {
		return honneur;
	}


	public void donnerArgent(int argent, Commercants c) {
		this.parler("Tiens "+c.getNom()+"je te donne "+argent);
		this.perdreArgent(argent);
		c.gagnerArgent(argent);
		c.parler("Merci pour l'argent");
	}
	
	public void provoquer(Yakuzas y) {
		if((this.getHonneur()*2) > y.getReputation()) {
			this.parler("J'ai gagner mon duel");
			this.gagnerArgent(y.perdre());
		}
		else {
			y.gagner();
			this.honneur-=1;
			this.parler("J'ai perdu mon duel face au yakuza\n");
		}
	}

}
