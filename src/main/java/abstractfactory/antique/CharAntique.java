package abstractfactory.antique;

import abstractfactory.GuerrierMobile;

public class CharAntique implements GuerrierMobile {

  @Override
  public void sePresenter() {
    System.out.println();
    System.out.println("--------------------");
    System.out.println("Je suis un char antique.");
  }

  @Override
  public void seDeplacer() {
    System.out.println("Je me déplace en char.");
  }

  @Override
  public void seBattre() {
    System.out.println("Je me bats avec ma lance.");
  }

  @Override
  public void seSoigner() {
    System.out.println("Je ne sais pas me soigner.");
  }

}
