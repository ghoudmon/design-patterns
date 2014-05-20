package strategie;

public class Jouer {
	
	public static void joue(Personnage personnage) {
		personnage.sePresenter();
		personnage.seDeplacer();
		personnage.seBattre();
		personnage.seSoigner();
	}

	public static void main(String[] args) {
		joue(new Guerrier());
		joue(new Guerisseur());
		joue(new Mage());
		joue(new Chevalier());
		joue(new Fermier());
	}

}
