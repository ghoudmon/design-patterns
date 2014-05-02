package exemples.strategie;

public class CanardMuet implements ComportementCancan {

	@Override
	public void cancaner() {
		System.err.print("qui est muet");
	}
}
