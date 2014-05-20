package strategie;

public class Mage implements Personnage {
	@Override
	public void sePresenter() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Je suis un mage.");
	}

	@Override
	public void seDeplacer() {
		System.out.println("Je marche.");
	}

	@Override
	public void seBattre() {
		System.out.println("Je combats avec des sortilèges.");
	}
	
	@Override
	public void seSoigner() {
		System.out.println("Je me soigne à l'aide de la magie.");		
	}
}
