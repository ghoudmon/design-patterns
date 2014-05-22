package factories.antiquite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import factories.Jeu;
import factories.Personnage;

public class JeuAntiquite extends Jeu {

  public JeuAntiquite() {
  }

  @Override
  public Collection<Personnage> creerPersonnages() {
    final List<Personnage> list = new ArrayList<>();
    list.add(new Centurion());
    list.add(new CharAntique());
    list.add(new Esclave());
    list.add(new Druide());
    return list;
  }
}
