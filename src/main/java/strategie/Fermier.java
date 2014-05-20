package strategie;

public class Fermier extends Personnage {

	public Fermier() {
		super();
		combat = new CombatPacificiste();
		deplacement = new DeplacementMarche();
		soin = new SoinAlcool();
	}
	
	@Override
	public void sePresenter() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Je suis un fermier.");
	}
}
