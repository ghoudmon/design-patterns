package strategie;

public class Jouer {

	public static void joue(Personnage personnage) {
		personnage.quisuisje();
		System.out.println("Se déplace de " + personnage.seDeplacer());
		System.out.println("Inflige au combat " + personnage.combattre()
				+ " points de vie");
		System.out.println("Soigne " + personnage.soigner() + " points de vie");
	}

	public static void main(String[] args) {
		joue(new Guerrier());
		joue(new Guerisseur());
		joue(new Mage());
		joue(new Chevalier());
		joue(new Fermier());
	}

}
