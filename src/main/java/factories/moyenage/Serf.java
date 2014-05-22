package factories.moyenage;

import factories.Travailleur;

public class Serf implements Travailleur {

  @Override
  public void sePresenter() {
    System.out.println();
    System.out.println("--------------------");
    System.out.println("Je suis un serf.");
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
    System.out.println("Je me soigne avec de l'eau-de-vie.");
  }

}
