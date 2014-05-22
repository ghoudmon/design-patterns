package factories.antiquite;

import factories.Guerrier;
import factories.GuerrierMobile;
import factories.Mage;
import factories.PersonnageFactory;
import factories.Travailleur;

public class AntiquitePersonnageFactory implements PersonnageFactory {

  @Override
  public Guerrier createGuerrier() {
    return new Centurion();
  }

  @Override
  public GuerrierMobile createGuerrierMobile() {
    return new CharAntique();
  }

  @Override
  public Mage createMage() {
    return new Druide();
  }

  @Override
  public Travailleur createTravailleur() {
    return new Esclave();
  }
}
