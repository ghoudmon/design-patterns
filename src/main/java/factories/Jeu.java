package factories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Jeu {

  private PersonnageFactory factory;

  public Jeu(PersonnageFactory pFactory) {
    super();
    this.factory = pFactory;
  }

  public Collection<Personnage> creerPersonnages() {
    final List<Personnage> list = new ArrayList<>();
    list.add(factory.createGuerrier());
    list.add(factory.createGuerrierMobile());
    list.add(factory.createTravailleur());
    list.add(factory.createMage());
    return list;
  }

  public void joue(Personnage personnage) {
    personnage.sePresenter();
    personnage.seDeplacer();
    personnage.seBattre();
    personnage.seSoigner();
  }

  public void joue() {
    Collection<Personnage> personnages = creerPersonnages();
    for (Personnage personnage : personnages) {
      joue(personnage);
    }
  }

}
