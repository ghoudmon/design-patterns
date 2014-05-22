package abstractfactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import abstractfactory.Personnage;
import abstractfactory.antique.Centurion;
import abstractfactory.antique.CharAntique;
import abstractfactory.antique.Druide;
import abstractfactory.antique.Esclave;
import abstractfactory.industrielle.Cavalier;
import abstractfactory.industrielle.Fantassin;
import abstractfactory.industrielle.Ouvrier;
import abstractfactory.industrielle.SavantFou;
import abstractfactory.moderne.Blinde;
import abstractfactory.moderne.FusilierMarin;
import abstractfactory.moderne.Geneticien;
import abstractfactory.moderne.SansPapiers;
import abstractfactory.moyenage.Chevalier;
import abstractfactory.moyenage.Mousquetaire;
import abstractfactory.moyenage.Serf;
import abstractfactory.moyenage.Sorcier;

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
