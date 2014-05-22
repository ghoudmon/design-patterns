package abstractfactory.industrielle;

import abstractfactory.Travailleur;

public class Ouvrier implements Travailleur {

  @Override
  public void sePresenter() {
    System.out.println();
    System.out.println("--------------------");
    System.out.println("Je suis un ouvrier.");
  }

  @Override
  public void seDeplacer() {
    System.out.println("Je me déplace en marchant.");
  }

  @Override
  public void seBattre() {
    System.out.println("Je me bats en laçant des pavés.");
  }

  @Override
  public void seSoigner() {
    System.out.println("Je me soigne avec de l'eau-de-vie.");
  }

}
