package exemples.strategie;

public class CanardEnPlastique extends Canard {

	public CanardEnPlastique() {
		comportementCancan = new CoinCoin();
		comportementVol = new NePasVoler();
	}

	@Override
	public void afficher() {
		System.err.print("Je suis un canard en plastique");
	}

}