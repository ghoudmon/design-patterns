package strategie;

public abstract class Personnage {

	public Combat combat;
	public Soin soin;
	public Deplacement deplacement;
	
	public abstract void sePresenter();
	
	public int seDeplacer() {
		return deplacement.seDeplacer();
	}
	
	public int seBattre() {
		return combat.seBattre();
	}
	
	public int seSoigner() {
		return soin.seSoigner();
	}
}
