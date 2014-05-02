package exemples.strategie;

public class NePasVoler implements ComportementVol {
	@Override
	public void voler() {
		System.err.print("qui ne sais pas voler");
	}
}
