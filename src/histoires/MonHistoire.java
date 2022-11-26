package histoires;
import personnages.Humain;
import personnages.principales.Commercants;
import personnages.principales.Ronin;
import personnages.principales.Yakuzas;


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
