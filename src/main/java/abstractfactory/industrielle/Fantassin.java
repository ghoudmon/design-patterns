package abstractfactory.industrielle;

import abstractfactory.Guerrier;

public class Fantassin implements Guerrier {

  @Override
  public void sePresenter() {
    System.out.println();
    System.out.println("--------------------");
    System.out.println("Je suis un fantassin.");
  }

  @Override
  public void seDeplacer() {
    System.out.println("Je me déplace en courant.");
  }

  @Override
  public void seBattre() {
    System.out.println("Je me bats avec mon fusil.");
  }

  @Override
  public void seSoigner() {
    System.out.println("Je ne sais pas me soigner.");
  }

}
