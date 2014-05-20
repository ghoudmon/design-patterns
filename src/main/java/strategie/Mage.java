package strategie;

public class Mage extends Personnage {

	public Mage() {
		super();
		combat = new CombatSortilege();
		deplacement = new DeplacementMarche();
		soin = new SoinMagie();
	}
	
	@Override
	public void sePresenter() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Je suis un mage.");
	}

}
