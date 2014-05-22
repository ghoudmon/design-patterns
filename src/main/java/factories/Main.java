package factories;

import factories.antiquite.JeuAntiquite;
import factories.industrielle.JeuIndustrielle;
import factories.moderne.JeuModerne;
import factories.moyenage.JeuMoyenAge;


public class Main {

  public static void main(String[] args) {
    new JeuAntiquite().joue();
    new JeuMoyenAge().joue();
    new JeuIndustrielle().joue();
    new JeuModerne().joue();
  }

}
