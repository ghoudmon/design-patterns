package factories.moderne;

import factories.Guerrier;
import factories.GuerrierMobile;
import factories.Mage;
import factories.PersonnageFactory;
import factories.Travailleur;

public class ModernePersonnageFactory implements PersonnageFactory {

  @Override
  public Guerrier createGuerrier() {
    return new FusilierMarin();
  }

  @Override
  public GuerrierMobile createGuerrierMobile() {
    return new Blinde();
  }

  @Override
  public Mage createMage() {
    return new Geneticien();
  }

  @Override
  public Travailleur createTravailleur() {
    return new SansPapiers();
  }
}
