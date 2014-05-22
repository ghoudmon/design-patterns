package abstractfactory;


public class Main {

  public static void main(String[] args) {
    new Jeu("Antiquité").joue();
    new Jeu("Moyen-Age").joue();
    new Jeu("Induqtrielle").joue();
    new Jeu("Moderne").joue();
  }

}
