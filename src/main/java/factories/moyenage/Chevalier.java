package factories.moyenage;

import factories.GuerrierMobile;


public class Chevalier implements GuerrierMobile {

  @Override
  public void sePresenter() {
    System.out.println();
    System.out.println("--------------------");
    System.out.println("Je suis un chevalier.");
  }

  @Override
  public void seDeplacer() {
    System.out.println("Je me déplace sur mon destrier.");
  }

  @Override
  public void seBattre() {
    System.out.println("Je me bats avec mon �p�e.");
  }

  @Override
  public void seSoigner() {
    System.out.println("Je ne sais pas me soigner.");
  }

}
