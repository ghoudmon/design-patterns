package strategie;

public class Jouer {

	public static void joue(Personnage personnage) {
		personnage.sePresenter();
		System.out.println("Se déplace de " + personnage.seDeplacer());
		System.out.println("Inflige au combat " + personnage.seBattre()
				+ " points de vie");
		System.out.println("Soigne " + personnage.seSoigner() + " points de vie");
	}

	public static void main(String[] args) {
		joue(new Guerrier());
		joue(new Guerisseur());
		joue(new Mage());
		joue(new Chevalier());
		joue(new Fermier());
	}

}
