package exemples.strategie;

public abstract class Canard {

	protected ComportementCancan comportementCancan;
	protected ComportementVol comportementVol;

	public void cancaner() {
		comportementCancan.cancaner();
	}

	public void nager() {
		System.err.print("qui nage");
	}

	public void voler() {
		comportementVol.voler();
	}

	public abstract void afficher();

}
