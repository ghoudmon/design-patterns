package exemples.strategie;

public class Mandarin extends Canard {

	public Mandarin() {
		comportementCancan = new Cancan();
		comportementVol = new VolerAvecDesAiles();
	}

	@Override
	public void afficher() {
		System.err.print("Je suis mandarin");
	}

}
