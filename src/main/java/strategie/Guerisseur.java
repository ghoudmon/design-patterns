package strategie;

public class Guerisseur extends Personnage {

	public Guerisseur() {
		super();
		combat = new CombatPoireaux();
		deplacement = new DeplacementMarche();
		soin = new SoinPlante();
	}
	
	@Override
	public void quisuisje() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Je suis un guérisseur.");
	}

}
