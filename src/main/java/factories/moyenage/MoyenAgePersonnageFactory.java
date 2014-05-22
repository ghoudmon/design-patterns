package factories.moyenage;

import javax.inject.Named;
import factories.Guerrier;
import factories.GuerrierMobile;
import factories.Mage;
import factories.Personnage;
import factories.PersonnageFactory;

@Named
public class MoyenAgePersonnageFactory implements PersonnageFactory {

  @SuppressWarnings("unchecked")
  @Override
  public <P extends Personnage> P createPersonnage(Class<P> classP) {
    if (Guerrier.class.isAssignableFrom(classP)) {
      return (P) new Mousquetaire();
    } else if (GuerrierMobile.class.isAssignableFrom(classP)) {
      return (P) new Chevalier();
    } else if (Mage.class.isAssignableFrom(classP)) {
      return (P) new Sorcier();
    } else {
      return (P) new Serf();
    }
  }
}
