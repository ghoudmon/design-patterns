package strategie;

public class Guerrier extends Personnage {

	public Guerrier() {
		super();
		combat = new CombatArc();
		deplacement = new DeplacementCourse();
		soin = new SoinAucun();
	}

	@Override
	public void quisuisje() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Je suis un guerrier.");
	}

}
