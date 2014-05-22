package abstractfactory.industrielle;

import abstractfactory.GuerrierMobile;


public class Cavalier implements GuerrierMobile {

  @Override
  public void sePresenter() {
    System.out.println();
    System.out.println("--------------------");
    System.out.println("Je suis un cavalier.");
  }

  @Override
  public void seDeplacer() {
    System.out.println("Je me déplace sur mon cheval.");
  }

  @Override
  public void seBattre() {
    System.out.println("Je me bats avec mon sabre.");
  }

  @Override
  public void seSoigner() {
    System.out.println("Je ne sais pas me soigner.");
  }

}
