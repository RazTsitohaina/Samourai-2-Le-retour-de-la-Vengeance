package personnages;

/**
 * 
 * @author Crack
 *
 */

public class Humain {
	private String nom;
	private String boisson_fav;
	private int argent;
	
	/**
	 * Constructeur d'un Humain
	 * @param nom : Son nom
	 * @param boisson_fav : boisson favorite
	 * @param argent : Son argent
	 */
	
	public Humain(String nom, String boisson_fav, int argent) {
		this.nom = nom;
		this.boisson_fav = boisson_fav;
		this.argent = argent;
	}
	

	/**
	 * Getteur nom
	 * @return Le nom de l'humain
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Getteur boisson
	 * @return La boisson favorite
	 */
	public String getBoisson_fav( ) {
		return this.boisson_fav;
	}
	
	/**
	 * Getteur argent
	 * @return L'argent de l'humain
	 */
	public int getArgent() {
		return this.argent;
	}
	
	/**
	 * M�thode parler : fait parler l'humain
	 * @param texte : dialogue 
	 */
	public void parler(String texte) {
		System.out.println("\n"+this.getNom()+" - "+texte);
	}
	
	/**
	 * Faire dire a l'humain
	 * son nom et sa boisson favorite
	 */
	public void direbonjour() {
		parler("Bonjour ! Je m'appelle "+this.getNom()+" et j'aime boire du "+this.getBoisson_fav()+" et j'ai "+this.getArgent());
			
	}
	
	/**
	 * Boire sa boisson favorite
	 */
	public void boire() {
		parler("Mmmm, un bon verre de "+this.getBoisson_fav()+" ! GLOUPS !");
	}
	
	/**
	 * Pour gagner de l'argent
	 * @param argent
	 */
	public void gagnerArgent(int argent) {
		this.argent+=argent;
	}
	
	/**
	 * Pour perdre de l'argent
	 * @param argent
	 */
	public void perdreArgent(int argent) {
		this.argent-=argent;
	}
}
