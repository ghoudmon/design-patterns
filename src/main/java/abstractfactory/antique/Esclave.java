package abstractfactory.antique;

import abstractfactory.Travailleur;

public class Esclave implements Travailleur {

  @Override
  public void sePresenter() {
    System.out.println();
    System.out.println("--------------------");
    System.out.println("Je suis un esclave.");
  }

  @Override
  public void seDeplacer() {
    System.out.println("Je me déplace en marchant.");
  }

  @Override
  public void seBattre() {
    System.out.println("Je ne me bats pas.");
  }

  @Override
  public void seSoigner() {
    System.out.println("Je me soigne avec du vin.");
  }

}
