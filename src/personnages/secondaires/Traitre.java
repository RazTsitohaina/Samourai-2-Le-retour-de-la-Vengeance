package personnages.secondaires;

import personnages.principales.Samourais;

public class Traitre extends Samourais{
	
	private Integer niv_traitrise = null;
	
	
	public Traitre(String nom, String boisson_fav, int argent,String clan) {
		super(nom, boisson_fav, argent, clan);
		if(this.niv_traitrise > 3) {
			this.niv_traitrise = 3;
		}
	}
	
}
