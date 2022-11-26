package personnages.secondaires;

import java.util.Random;

import personnages.principales.Yakuzas;

public class Ninja extends Yakuzas{
	private String clanSecret;
	private static final String[] clansNinja = {"of Shadows", 
			"of Mist", "of Clouds", 
			"of Fog", "of Darkness"};
	
	public Ninja(String nom, String boisson_fav, int argent,String clan) {
		super(nom,boisson_fav,argent,clan);
		
		Random r = new Random();
		int choix = r.nextInt(5);
		
		this.clanSecret = this.getClan()+" "+clansNinja[choix];
	}
	
	public void direbonjour() {
		super.direbonjour();
		this.parler("Je fais partis du clan secret "+this.clanSecret);
		this.parler("Tu connais mon clan secret maintenant je dois te tuer !");
		}
		
}
	

