package personnages;

public class Yakuzas extends Humain{
	
	private String clan;
	private int reputation;
	
	public Yakuzas(String nom, String boisson_fav, int argent,String clan) {
		super(nom,boisson_fav,argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	protected void gagner() {
		this.reputation +=1;
		System.out.println("J'ai gagner !!!");
	}
	
	protected int perdre(){
		int argent = this.getArgent();
		this.perdreArgent(argent);
		System.out.println("J'ai perdu ! je n'ai plus d'argent !");
		return argent;
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
	
	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	
	public void direbonjour() {
		super.direbonjour();
		this.parler("Et mon clan est "+this.getClan());
	}
	
	
	
}
