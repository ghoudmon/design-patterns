package abstractfactory.moderne;

import abstractfactory.Mage;

public class Geneticien implements Mage {

  @Override
  public void sePresenter() {
    System.out.println();
    System.out.println("--------------------");
    System.out.println("Je suis un généticien.");
  }

  @Override
  public void seDeplacer() {
    System.out.println("Je me déplace en marchant.");
  }

  @Override
  public void seBattre() {
    System.out.println("Je me bats avec mes virus mutants.");
  }

  @Override
  public void seSoigner() {
    System.out.println("Je me soigne avec des cellules souches.");
  }

}
