package strategie;

public class Chevalier implements Personnage {
	
	@Override
	public void sePresenter() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Je suis un chevalier.");
	}

	@Override
	public void seDeplacer() {
		System.out.println("Je monte à cheval.");
	}

	@Override
	public void seBattre() {
		System.out.println("Je combats avec une épée.");
	}
	
	@Override
	public void seSoigner() {
		System.out.println("Je ne soigne pas.");		
	}
}
