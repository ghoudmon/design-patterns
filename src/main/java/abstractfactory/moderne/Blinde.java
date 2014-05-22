package abstractfactory.moderne;

import abstractfactory.GuerrierMobile;


public class Blinde implements GuerrierMobile {

  @Override
  public void sePresenter() {
    System.out.println();
    System.out.println("--------------------");
    System.out.println("Je suis un blindé.");
  }

  @Override
  public void seDeplacer() {
    System.out.println("Je me déplace dans mon blindé.");
  }

  @Override
  public void seBattre() {
    System.out.println("Je me bats avec mon canon.");
  }

  @Override
  public void seSoigner() {
    System.out.println("Je ne sais pas me soigner.");
  }

}
