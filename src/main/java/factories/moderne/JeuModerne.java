package factories.moderne;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import factories.Jeu;
import factories.Personnage;

public class JeuModerne extends Jeu {

  public JeuModerne() {
  }

  @Override
  public Collection<Personnage> creerPersonnages() {
    final List<Personnage> list = new ArrayList<>();
    list.add(new FusilierMarin());
    list.add(new Blinde());
    list.add(new SansPapiers());
    list.add(new Geneticien());
    return list;
  }
}
