package strategie;

public abstract class Personnage {

	public Combat combat;
	public Soin soin;
	public Deplacement deplacement;
	
	public abstract void quisuisje();
	
	public int seDeplacer() {
		return deplacement.seDeplacer();
	}
	
	public int combattre() {
		return combat.combattre();
	}
	
	public int soigner() {
		return soin.soigner();
	}
}
