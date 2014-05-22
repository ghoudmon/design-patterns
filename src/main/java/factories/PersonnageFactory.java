package factories;


public interface PersonnageFactory {

  Guerrier createGuerrier();

  GuerrierMobile createGuerrierMobile();

  Travailleur createTravailleur();

  Mage createMage();
}
