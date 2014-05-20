package strategie;

public class Jouer {
	
	public static void joue(Personnage personnage) {
		personnage.quisuisje();
		personnage.seDeplacer();
		personnage.combattre();
		personnage.soigner();
	}

	public static void main(String[] args) {
		joue(new Guerrier());
		joue(new Guerisseur());
		joue(new Mage());
		joue(new Chevalier());
		joue(new Fermier());
	}

}
