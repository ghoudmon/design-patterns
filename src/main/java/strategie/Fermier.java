package strategie;

public class Fermier extends Personnage {

	public Fermier() {
		super();
		combat = new CombatPacificiste();
		deplacement = new DeplacementAne();
		soin = new SoinAlcool();
	}
	
	@Override
	public void quisuisje() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Je suis un fermier.");
	}
}
