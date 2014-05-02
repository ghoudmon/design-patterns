package exemples.strategie;

public class Leurre extends Canard {

	public Leurre() {
		comportementCancan = new CanardMuet();
		comportementVol = new NePasVoler();
	}

	@Override
	public void afficher() {
		System.err.print("Je suis un leurre");
	}

}