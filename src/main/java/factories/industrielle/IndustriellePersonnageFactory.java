package factories.industrielle;

import factories.Guerrier;
import factories.GuerrierMobile;
import factories.Mage;
import factories.PersonnageFactory;
import factories.Travailleur;

public class IndustriellePersonnageFactory implements PersonnageFactory {

  @Override
  public Guerrier createGuerrier() {
    return new Fantassin();
  }

  @Override
  public GuerrierMobile createGuerrierMobile() {
    return new Cavalier();
  }

  @Override
  public Mage createMage() {
    return new SavantFou();
  }

  @Override
  public Travailleur createTravailleur() {
    return new Ouvrier();
  }
}
