package exemples.strategie;

public class MiniSimulateur {

	public static void main(String[] args) {
		Canard[] canards = new Canard[] { new Colvert(), new Mandarin() };
		for (Canard canard : canards) {
			canard.afficher();
			System.err.print(" ");
			canard.cancaner();
			System.err.print(" et ");
			canard.nager();
			System.err.println(".");
		}
	}

}
