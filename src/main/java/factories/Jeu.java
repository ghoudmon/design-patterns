package factories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import factories.Personnage;
import factories.antiquite.Centurion;
import factories.antiquite.CharAntique;
import factories.antiquite.Druide;
import factories.antiquite.Esclave;
import factories.industrielle.Cavalier;
import factories.industrielle.Fantassin;
import factories.industrielle.Ouvrier;
import factories.industrielle.SavantFou;
import factories.moderne.Blinde;
import factories.moderne.FusilierMarin;
import factories.moderne.Geneticien;
import factories.moderne.SansPapiers;
import factories.moyenage.Chevalier;
import factories.moyenage.Mousquetaire;
import factories.moyenage.Serf;
import factories.moyenage.Sorcier;

public class Jeu {

  private String epoque;

  public Jeu(String pEpoque) {
    super();
    this.epoque = pEpoque;
  }

  public Collection<Personnage> creerPersonnages() {
    final List<Personnage> list = new ArrayList<>();
    switch (epoque) {
      case "Antiquité":
        list.add(new Centurion());
        list.add(new CharAntique());
        list.add(new Esclave());
        list.add(new Druide());
        break;
      case "Moyen-Age":
        list.add(new Mousquetaire());
        list.add(new Chevalier());
        list.add(new Serf());
        list.add(new Sorcier());
        break;
      case "Industielle":
        list.add(new Fantassin());
        list.add(new Cavalier());
        list.add(new Ouvrier());
        list.add(new SavantFou());
        break;
      case "Moderne":
        list.add(new FusilierMarin());
        list.add(new Blinde());
        list.add(new SansPapiers());
        list.add(new Geneticien());
        break;

    }
    return list;
  }

  public void joue(Personnage personnage) {
    personnage.sePresenter();
    personnage.seDeplacer();
    personnage.seBattre();
    personnage.seSoigner();
  }
  

  public void joue() {
    Collection<Personnage> personnages = creerPersonnages();
    for (Personnage personnage : personnages) {
      joue(personnage);
    }
  }

}
