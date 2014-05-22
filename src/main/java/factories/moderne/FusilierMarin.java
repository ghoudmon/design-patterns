package factories.moderne;

import factories.Guerrier;

public class FusilierMarin implements Guerrier {

  @Override
  public void sePresenter() {
    System.out.println();
    System.out.println("--------------------");
    System.out.println("Je suis un fusilier marin.");
  }

  @Override
  public void seDeplacer() {
    System.out.println("Je me déplace en courant.");
  }

  @Override
  public void seBattre() {
    System.out.println("Je me bats avec mon famas.");
  }

  @Override
  public void seSoigner() {
    System.out.println("Je ne sais pas me soigner.");
  }

}
