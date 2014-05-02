package exemples.strategie;


public class MiniSimulateur {

	public static void main(String[] args) {
		Canard[] canards = new Canard[] { new Colvert(), new Mandarin(),
				new CanardEnPlastique(), new Leurre() };
		for (Canard canard : canards) {
			canard.afficher();
			System.err.print(" ");
			canard.cancaner();
			System.err.print(" et ");
			canard.nager();
			System.err.print(" et ");
			canard.voler();
			System.err.println(".");
		}
	}

}
