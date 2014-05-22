package factories;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {

  public static void main(String[] args) {
    Weld weld = new Weld();

    WeldContainer container = weld.initialize();

    for (PersonnageFactory factory : container.instance().select(PersonnageFactory.class)) {
      new Jeu(factory).joue();
    }

    weld.shutdown();
  }

}
