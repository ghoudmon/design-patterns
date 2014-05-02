package exemples.strategie;

public abstract class Canard {

	public void cancaner() {
		System.err.print("qui cancane");
	}

	public void nager() {
		System.err.print("qui nage");
	}

	public abstract void afficher();

}
