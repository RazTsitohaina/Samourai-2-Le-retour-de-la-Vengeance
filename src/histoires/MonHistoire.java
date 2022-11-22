package histoires;
import personnages.Commercants;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuzas;


public class MonHistoire {
	public static void main(String[] args){
		Humain humain = new Humain("Prof","Porto",10);
		humain.direbonjour();
		humain.boire();
		
		Commercants commercant = new Commercants("Marchand", 35);
		commercant.direbonjour();
		
		Yakuzas yakuza = new Yakuzas("Yaku_le_noir","biere",42,"Warsong");
		yakuza.direbonjour();
		yakuza.extorquer(commercant);
		
		Ronin ronin = new Ronin("Ronin", "sake",61);
		ronin.donnerArgent(10, commercant);
		ronin.provoquer(yakuza);
		ronin.direbonjour();
	}
	
}
