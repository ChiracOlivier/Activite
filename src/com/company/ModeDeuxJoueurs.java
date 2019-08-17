package com.company;

import java.util.Scanner;

/**
 * classe d'execution du mode deux joueurs ( le mode démandé par le prof)
 * son constructeur reçoit un string en paramètre pour le nom du premier joueur.
 */
class ModeDeuxJoueurs {

    ModeDeuxJoueurs(String name1, Scanner sc1){

        String name3="Joueur 2";
        int tab[] = {0,0,0,0,0};
        int ch1=(new Choix().choix(true,name1, sc1));
        tab=new Init(tab).getTab1(tab, sc1);
        CathegoPersonnage cathegoPersonnage = new CathegoPersonnage(ch1, name1, tab[0], tab[1], tab[2],tab[3] ,tab[4]);
        Personnage joueur1 = new Personnage(tab[0], tab[1], tab[2], tab[3], tab[4], cathegoPersonnage);
        int ch2= (new Choix().choix(true,name3, sc1));
        tab= new Init(tab).getTab1(tab, sc1);
        CathegoPersonnage cathegoPersonnage1 = new CathegoPersonnage(ch2, name3, tab[0], tab[1], tab[2],tab[3] ,tab[4]);
        Personnage joueur2 = new Personnage(tab[0], tab[1], tab[2], tab[3], tab[4], cathegoPersonnage1);

        while ((joueur1.getVie()>0)&&(joueur2.getVie()>0)) {
            tab= joueur1.getCathegoPersonnage().attaque(sc1, joueur1.getVie(), joueur2.getVie(), name1, name3, ch1, false, joueur1.getForce(), joueur1.getAgilité(), joueur2.getIntelligence(), joueur1.getIntelligence());
            joueur1.setVie(tab[0]);
            joueur2.setVie(tab[1]);
            joueur1.setAgilité(tab[2]);
            if ((joueur1.getVie()>0)&&(joueur2.getVie()>0)) {
                tab = joueur2.getCathegoPersonnage().attaque(sc1, joueur2.getVie(), joueur1.getVie(), name3, name1,ch2, false, joueur2.getForce(), joueur2.getAgilité(), joueur1.getIntelligence(), joueur2.getIntelligence());
                joueur2.setVie(tab[0]);
                joueur1.setVie(tab[1]);
                joueur2.setAgilité(tab[2]);
            }
        }
        if (joueur1.getVie()<=0)
            System.out.println("Joueur 1 est mort\n Joueur 1 a perdu!!");
        else if (joueur2.getVie()<=0)
            System.out.println("Joueur 2 est mort\n Joueur 2 a perdu!!");
    }
}

