package factories.moyenage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import factories.Jeu;
import factories.Personnage;

public class JeuMoyenAge extends Jeu {

  public JeuMoyenAge() {
  }

  @Override
  public Collection<Personnage> creerPersonnages() {
    final List<Personnage> list = new ArrayList<>();
    list.add(new Mousquetaire());
    list.add(new Chevalier());
    list.add(new Serf());
    list.add(new Sorcier());
    return list;
  }
}
