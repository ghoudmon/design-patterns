package factories.antiquite;

import factories.Mage;

public class Druide implements Mage {

  @Override
  public void sePresenter() {
    System.out.println();
    System.out.println("--------------------");
    System.out.println("Je suis un druide.");
  }

  @Override
  public void seDeplacer() {
    System.out.println("Je me déplace en marchant.");
  }

  @Override
  public void seBattre() {
    System.out.println("Je me bats avec ma serpe.");
  }

  @Override
  public void seSoigner() {
    System.out.println("Je me soigne avec de la potion magique.");
  }

}
