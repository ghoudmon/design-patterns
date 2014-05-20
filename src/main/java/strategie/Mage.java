package strategie;

public class Mage extends Personnage {

	public Mage() {
		super();
		combat = new CombatSortilege();
		deplacement = new DeplacementLevitation();
		soin = new SoinMagie();
	}
	
	@Override
	public void quisuisje() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Je suis un mage.");
	}

}
