package personnages;

public class Commercants extends Humain{
	
	public Commercants (String nom, int argent) {
		super(nom,"th�", argent);
	}
	
	public int seFaireExtorquer() {
		int argent = this.getArgent();
		this.perdreArgent(argent);
		System.out.println("\n JE me suis fais extorquer j'ai perdue mon argent !!\n");
		return argent;
	}
	
	public void recevoir(int argent) {
		System.out.println("YOUHHOUU ! J'ai re�u "+argent);
		this.gagnerArgent(argent);
	}
	
}
