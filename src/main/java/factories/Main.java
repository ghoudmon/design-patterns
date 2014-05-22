package factories;

import factories.antiquite.AntiquitePersonnageFactory;
import factories.industrielle.IndustriellePersonnageFactory;
import factories.moderne.ModernePersonnageFactory;
import factories.moyenage.MoyenAgePersonnageFactory;

public class Main {

  public static void main(String[] args) {
    new Jeu(new AntiquitePersonnageFactory()).joue();
    new Jeu(new MoyenAgePersonnageFactory()).joue();
    new Jeu(new IndustriellePersonnageFactory()).joue();
    new Jeu(new ModernePersonnageFactory()).joue();
  }

}
