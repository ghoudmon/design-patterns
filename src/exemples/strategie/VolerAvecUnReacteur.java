package exemples.strategie;

public class VolerAvecUnReacteur implements ComportementVol {
	@Override
	public void voler() {
		System.err.print("qui vole avec un réacteur");
	}
}
