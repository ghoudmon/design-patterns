package strategie;

public class Fermier implements Personnage {
	
	@Override
	public void sePresenter() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Je suis un fermier.");
	}

	@Override
	public void seDeplacer() {
		System.out.println("Je marche.");
	}

	@Override
	public void seBattre() {
		System.out.println("Je ne combats pas.");
	}
	
	@Override
	public void seSoigner() {
		System.out.println("Je me soigne avec de la gnôle.");		
	}
}
