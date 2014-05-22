package factories.industrielle;

import javax.inject.Named;
import factories.Guerrier;
import factories.GuerrierMobile;
import factories.Mage;
import factories.Personnage;
import factories.PersonnageFactory;

@Named
public class IndustriellePersonnageFactory implements PersonnageFactory {

  @SuppressWarnings("unchecked")
  @Override
  public <P extends Personnage> P createPersonnage(Class<P> classP) {
    if (Guerrier.class.isAssignableFrom(classP)) {
      return (P) new Fantassin();
    } else if (GuerrierMobile.class.isAssignableFrom(classP)) {
      return (P) new Cavalier();
    } else if (Mage.class.isAssignableFrom(classP)) {
      return (P) new SavantFou();
    } else {
      return (P) new Ouvrier();
    }
  }
}
