package factories.industrielle;

import factories.Mage;

public class SavantFou implements Mage {

  @Override
  public void sePresenter() {
    System.out.println();
    System.out.println("--------------------");
    System.out.println("Je suis un savant fou.");
  }

  @Override
  public void seDeplacer() {
    System.out.println("Je me déplace en marchant.");
  }

  @Override
  public void seBattre() {
    System.out.println("Je me bats avec mes inventions.");
  }

  @Override
  public void seSoigner() {
    System.out.println("Je me soigne avec des potions.");
  }

}
