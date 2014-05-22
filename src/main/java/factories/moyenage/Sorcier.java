package factories.moyenage;

import factories.Mage;

public class Sorcier implements Mage {

  @Override
  public void sePresenter() {
    System.out.println();
    System.out.println("--------------------");
    System.out.println("Je suis un sorcier.");
  }

  @Override
  public void seDeplacer() {
    System.out.println("Je me déplace en marchant.");
  }

  @Override
  public void seBattre() {
    System.out.println("Je me bats avec ma baguette magique.");
  }

  @Override
  public void seSoigner() {
    System.out.println("Je me soigne avec de la potion magique.");
  }

}
