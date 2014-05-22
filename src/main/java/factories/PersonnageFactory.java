package factories;


public interface PersonnageFactory {

  <P extends Personnage> P createPersonnage(Class<P> classP);
}
