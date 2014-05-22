package factories.industrielle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import factories.Jeu;
import factories.Personnage;

public class JeuIndustrielle extends Jeu {

  public JeuIndustrielle() {
  }

  @Override
  public Collection<Personnage> creerPersonnages() {
    final List<Personnage> list = new ArrayList<>();
    list.add(new Fantassin());
    list.add(new Cavalier());
    list.add(new Ouvrier());
    list.add(new SavantFou());
    return list;
  }
}
