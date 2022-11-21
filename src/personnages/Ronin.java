package personnages;

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
		this.perdreArgent(argent);
		c.gagnerArgent(argent);
	}
	
	public void provoquer(Yakuzas y) {
		if((this.getHonneur()*2) > y.getReputation()) {
			System.out.println("\nJ'ai gagner");
			this.gagnerArgent(y.perdre());
		}
		else {
			y.gagner();
			this.honneur-=1;
			System.out.println("J'ai perdu mon duel face au yakuza\n");
		}
	}

}
