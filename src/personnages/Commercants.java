package personnages;

public class Commercants extends Humain{
	
	public Commercants (String nom, int argent) {
		super(nom,"thé", argent);
	}
	
	public int seFaireExtorquer() {
		int argent = this.getArgent();
		this.perdreArgent(argent);
		this.parler("Je me suis fais extorquer j'ai perdue mon argent !!");
		return argent;
	}
	
	public void recevoir(int argent) {
		System.out.println("YOUHHOUU ! J'ai reçu "+argent);
		this.gagnerArgent(argent);
	}
	
}
