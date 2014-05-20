package strategie;

public class Chevalier extends Personnage {

	public Chevalier() {
		super();
		combat = new CombatEpee();
		deplacement = new DeplacementCheval();
		soin = new SoinAucun();
	}

	@Override
	public void quisuisje() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Je suis un chevalier.");
	}
}
