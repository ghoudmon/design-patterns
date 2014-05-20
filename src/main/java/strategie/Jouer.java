package strategie;

public class Jouer {

	public static void main(String[] args) {
		// guerrier
		Guerrier guerrier = new Guerrier();
		guerrier.sePresenter();
		guerrier.seDeplacer();
		guerrier.seBattre();
		// Guérisseur
		Guerisseur guerisseur = new Guerisseur();
		guerisseur.sePresenter();
		guerisseur.seDeplacer();
		guerrier.seBattre();
		guerisseur.seSoigner();
		
	}

}
