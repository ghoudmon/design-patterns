package factories.moderne;

import factories.Guerrier;
import factories.GuerrierMobile;
import factories.Mage;
import factories.Personnage;
import factories.PersonnageFactory;

public class ModernePersonnageFactory implements PersonnageFactory {

  @SuppressWarnings("unchecked")
  @Override
  public <P extends Personnage> P createPersonnage(Class<P> classP) {
    if (Guerrier.class.isAssignableFrom(classP)) {
      return (P) new FusilierMarin();
    } else if (GuerrierMobile.class.isAssignableFrom(classP)) {
      return (P) new Blinde();
    } else if (Mage.class.isAssignableFrom(classP)) {
      return (P) new Geneticien();
    } else {
      return (P) new SansPapiers();
    }
  }
}
