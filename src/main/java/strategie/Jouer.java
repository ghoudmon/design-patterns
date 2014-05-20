package strategie;

public class Jouer {

	public static void main(String[] args) {
		// guerrier
		Guerrier guerrier = new Guerrier();
		guerrier.quisuisje();
		guerrier.seDeplacer();
		guerrier.combattre();
		// Guérisseur
		Guerisseur guerisseur = new Guerisseur();
		guerisseur.quisuisje();
		guerisseur.seDeplacer();
		guerisseur.soigner();
		
	}

}
