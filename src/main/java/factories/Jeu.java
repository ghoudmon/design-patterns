package factories;

import java.util.Collection;

public abstract class Jeu {


  public Jeu() {
    super();
  }

  public abstract Collection<Personnage> creerPersonnages();

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
