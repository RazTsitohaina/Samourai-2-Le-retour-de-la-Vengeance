package personnages.secondaires;

import personnages.Humain;
import personnages.principales.Commercants;
import personnages.principales.Samourais;

public class Traitre extends Samourais{
	
	private Integer niv_traitrise ;
	
	
	public Traitre(String nom, String boisson_fav, int argent,String clan) {
		super(nom, boisson_fav, argent, clan);
		this.niv_traitrise = null;
		
		if(this.niv_traitrise >= 3) {
			this.niv_traitrise = 3;
		}
	}
	
	public Integer getNiv_traitrise() {
		return niv_traitrise;
	}

	public void setNiv_traitrise() {
		this.parler("Ma traitrise augmente");
		this.niv_traitrise += 1;
	}

	public void extorquer(Commercants c) {
		if(this.getNiv_traitrise()!=3) {
			this.parler("Jai extorquer un commercant");
			int argent = c.seFaireExtorquer();
			this.gagnerArgent(argent);
			this.setNiv_traitrise();
		}
		else {
			this.parler("Je ne peux plus extorquer");
		}
	}
	
	public void direBonjour() {
		super.direBonjour();
		this.parler("Et ma traitrise est de niveau"+this.getNiv_traitrise());
	}
	
	public void faireLeGentil(Humain h, int argent) {
		Integer a = this.niv_traitrise-=(argent/10);
		this.perdreArgent(argent);
		h.gagnerArgent(argent);
		this.parler("Je fais ami ami avec "+h.getNom());
		
		if(a>=0) {
			this.niv_traitrise = a;
		}else {
			this.niv_traitrise = 0;
		}
	}
}
