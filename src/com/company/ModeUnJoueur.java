package com.company;

/**
 * classe du mode un joueur( vous jouez contre l'ordinateur)
 * (je vais bientot coder une intelligence artificielle, ahahahahahhaha)
 */
class ModeUnJoueur {
    ModeUnJoueur(String name1) {
        String name2 = "ORDINATEUR";
        int tab[]={0,0,0,0,0}, tab1[]={0,0,0,0,0,0};
        int ch= (new Choix()).choix(true,name1);
        tab = (new Init(tab)).getTab1(tab);
        tab1 = (new InitOrdi(tab1)).getTab1(tab1) ;
        CathegoPersonnage cathegoPersonnage = new CathegoPersonnage(ch, name1, tab[0], tab[1], tab[2], tab[3], tab[4]);
        Personnage joueur1 = new Personnage(tab[0], tab[1], tab[2], tab[3], tab[4], cathegoPersonnage);
        CathegoPersonnage cathegoPersonnag = new CathegoPersonnage(tab1[5], name2, tab1[0], tab1[1], tab1[2], tab1[3], tab1[4]);
        Ordi ordi = new Ordi(tab1[0], tab1[1], tab1[2], tab1[3], tab1[4], cathegoPersonnag);
        while ((joueur1.getVie() > 0) && (ordi.getVie() > 0)) {
            tab = joueur1.getCathegoPersonnage().attaque(joueur1.getVie(), ordi.getVie(), name1, name2,ch, false, joueur1.getForce(), joueur1.getAgilité(), ordi.getIntelligence(), joueur1.getIntelligence());
            joueur1.setVie(tab[0]);
            ordi.setVie(tab[1]);
            joueur1.setAgilité(tab[2]);
            if ((joueur1.getVie() > 0) && (ordi.getVie() > 0)) {
                tab = ordi.getCathegoPersonnage().attaque(ordi.getVie(), joueur1.getVie(), name2, name1, tab1[5], true, ordi.getForce(), ordi.getAgilité(), joueur1.getIntelligence(), ordi.getIntelligence());
                ordi.setVie(tab[0]);
                joueur1.setVie(tab[1]);
                ordi.setAgilité(tab[2]);
            }
        }
        if (joueur1.getVie() <= 0)
            System.out.println("Joueur 1 a perdu");
        else if (ordi.getVie() <= 0)
            System.out.println("ORDINATEUR a perdu");
    }
}
