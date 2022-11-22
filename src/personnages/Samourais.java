package personnages;

public class Samourais extends Ronin{
	
	private String seigneur;
	
	public Samourais(String nom, String boisson_fav, int argent,String seigneur) {
		super(nom, boisson_fav, argent);
		this.seigneur = seigneur;
	}
	
	
	public String getSeigneur() {
		return seigneur;
	}

	public void direBonjour() {
		super.direbonjour();
		this.parler("Et mon seigneur est "+this.getSeigneur());
	}
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de "+boisson+" ! GLOUPS !");
	}
	
}
