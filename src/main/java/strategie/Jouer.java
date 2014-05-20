package strategie;

import java.util.Random;

public class Jouer {

	public static Random random = new Random();

	public static void joue(Personnage personnage) {
		personnage.sePresenter();
		if (random.nextInt(100) < 10) {
			personnage.combat = new CombatDragon();
			personnage.deplacement = new DeplacementDragon();
		}
		System.out.println("Se déplace de " + personnage.seDeplacer());
		System.out.println("Inflige au combat " + personnage.seBattre()
				+ " points de vie");
		System.out.println("Soigne " + personnage.seSoigner() + " points de vie");
	}

	public static void main(String[] args) {
		Personnage[] personnages = new Personnage[] { new Guerrier(),
				new Guerisseur(), new Mage(), new Chevalier(), new Fermier() };
		for (int i = 0; i < 10; i++) {
			for (Personnage personnage : personnages) {
				joue(personnage);
			}
		}
	}
}
