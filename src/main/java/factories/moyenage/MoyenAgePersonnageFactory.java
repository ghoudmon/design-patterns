package factories.moyenage;

import factories.Guerrier;
import factories.GuerrierMobile;
import factories.Mage;
import factories.PersonnageFactory;
import factories.Travailleur;

public class MoyenAgePersonnageFactory implements PersonnageFactory {

  @Override
  public Guerrier createGuerrier() {
    return new Mousquetaire();
  }

  @Override
  public GuerrierMobile createGuerrierMobile() {
    return new Chevalier();
  }

  @Override
  public Mage createMage() {
    return new Sorcier();
  }

  @Override
  public Travailleur createTravailleur() {
    return new Serf();
  }
}
