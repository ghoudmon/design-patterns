package factories.antiquite;

import factories.Guerrier;
import factories.GuerrierMobile;
import factories.Mage;
import factories.Personnage;
import factories.PersonnageFactory;

public class AntiquitePersonnageFactory implements PersonnageFactory {

  @SuppressWarnings("unchecked")
  @Override
  public <P extends Personnage> P createPersonnage(Class<P> classP) {
    if (Guerrier.class.isAssignableFrom(classP)) {
      return (P) new Centurion();
    } else if (GuerrierMobile.class.isAssignableFrom(classP)) {
      return (P) new CharAntique();
    } else if (Mage.class.isAssignableFrom(classP)) {
      return (P) new Druide();
    } else {
      return (P) new Esclave();
    }
  }

}
