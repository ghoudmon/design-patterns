package strategie;

public class Guerisseur implements Personnage {
	@Override
	public void quisuisje() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Je suis un guérisseur.");
	}

	@Override
	public void seDeplacer() {
		System.out.println("Je marche.");
	}

	public void soigner() {
		System.out.println("Je soigne à l'aide de plantes.");
	}
}
