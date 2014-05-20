package strategie;

public class Guerisseur implements Personnage {
	@Override
	public void sePresenter() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Je suis un guérisseur.");
	}

	@Override
	public void seDeplacer() {
		System.out.println("Je marche.");
	}

	@Override
	public void seBattre() {
		System.out.println("Je combats à coup de poireaux.");
	}

	public void seSoigner() {
		System.out.println("Je soigne à l'aide de plantes.");
	}
}
