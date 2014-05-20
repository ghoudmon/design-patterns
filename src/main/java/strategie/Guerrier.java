package strategie;

public class Guerrier implements Personnage {
	@Override
	public void sePresenter() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Je suis un guerrier.");
	}

	@Override
	public void seDeplacer() {
		System.out.println("Je cours.");
	}
	
	public void seBattre() {
		System.out.println("Je combats avec une épée.");
	}
}
