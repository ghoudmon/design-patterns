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
    list.add(factory.createPersonnage(Guerrier.class));
    list.add(factory.createPersonnage(GuerrierMobile.class));
    list.add(factory.createPersonnage(Travailleur.class));
    list.add(factory.createPersonnage(Mage.class));
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
