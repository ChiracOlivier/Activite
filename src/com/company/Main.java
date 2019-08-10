package com.company;

import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int entree1, tab[];

        System.out.println("Bienvenue dans ce jeu  épique!!!\n");
        System.out.println("Choississez votre mode :\n 1: 1 joueur\n 2: 2 joueurs\n");
        entree1 = sc.nextInt();
        int niveau, vie, force, agilité, intelligence, cathego, cathegoP;
        String name1="Joueur 1", name2="ORDINATEUR", name3="Joueur 2";
        if (entree1 == 1) {
            System.out.println(" Création du personnage du joueur 1\nVeuillez choisir la classe du personnage: (1: Guerrier, 2: Rodeur, 3: Mage) ");
            cathego= sc.nextInt();
           do {
                System.out.println("Choisissez bien vos paramètres !!!\n\n niveau du personnage ??");
                niveau = sc.nextInt();
                vie = niveau * 5;
                System.out.println("force du personnage ??");
                force = sc.nextInt();
                System.out.println("agilité du personnage ??");
                agilité = sc.nextInt();
                System.out.println("intelligence du personnage ??");
                intelligence = sc.nextInt();
            } while (niveau!=(force+agilité+intelligence));
            CathegoPersonnage cathegoPersonnage= new CathegoPersonnage(cathego,name1, niveau, vie, force, agilité, intelligence);

            Personnage joueur1 = new Personnage( niveau, vie, force, agilité, intelligence, cathegoPersonnage, name1);
            int Max =100, min1 =1, min2= 0;
            int range1= Max-min1+1;
            int range2= Max-min2+1;
            int nivea= (int)(Math.random()*range1) + min1;
            int vi= nivea*5 ;
            int forc= (int)(Math.random()*range2) + min2 ;
            int agilit= (int)(Math.random()*range2) + min2;
            int intelligenc= (int)(Math.random()*range2)+ min2 ;
             cathegoP= (int)(Math.random()*3) + 1 ;
            CathegoPersonnage cathegoPersonnag= new CathegoPersonnage(cathegoP, name2,niveau, vi, forc, agilit, intelligenc);
            Ordi ordi = new Ordi(nivea, vi, forc, agilit, intelligenc, cathegoPersonnag, name2);

            while ((joueur1.getVie()>0)&&(ordi.getVie()>0)) {
                 tab= joueur1.getCathegoPersonnage().attaque( joueur1.getVie(), ordi.getVie(), name1, name2, cathego, false, joueur1.getForce(), joueur1.getAgilité(), ordi.getIntelligence(), joueur1.getIntelligence());
                joueur1.setVie(tab[0]);
                ordi.setVie(tab[1]);
                joueur1.setAgilité(tab[2]);
                if ((joueur1.getVie()>0)&&(ordi.getVie()>0)) {
                    tab = ordi.getCathegoPersonnage().attaque(ordi.getVie(), joueur1.getVie(), name2, name1, cathegoP, true, ordi.getForce(), ordi.getAgilité(), joueur1.getIntelligence(), ordi.getIntelligence());
                    ordi.setVie(tab[0]);
                    joueur1.setVie(tab[1]);
                    ordi.setAgilité(tab[2]);
                }
            }
            if (joueur1.getVie()<=0)
                System.out.println("Joueur 1 a perdu");
            else if (ordi.getVie()<=0)
                System.out.println("ORDINATEUR a perdu");

        } else if (entree1 == 2) {
            System.out.println("Création du personnage du joueur 1\n Veuillez choisir la classe du personnage: (1: Guerrier, 2: Rodeur, 3: Mage) ");
            cathego= sc.nextInt();
            do {
                System.out.println("Choisissez bien vos paramètres\n\nniveau du personnage ??");
                niveau = sc.nextInt();
                vie = niveau * 5;
                System.out.println("force du personnage ??");
                force = sc.nextInt();
                System.out.println("agilité du personnage ??");
                agilité = sc.nextInt();
                System.out.println("intelligence du personnage ??");
                intelligence = sc.nextInt();
            } while (niveau!=(force+agilité+intelligence));
            CathegoPersonnage cathegoPersonnage = new CathegoPersonnage(cathego, name1, niveau, vie, force,agilité ,intelligence);
            Personnage joueur1 = new Personnage(niveau, vie, force, agilité, intelligence, cathegoPersonnage, name1);

            System.out.println(" Création du personnage du joueur 2 \nVeuillez choisir la classe du personnage: (1: Guerrier, 2: Rodeur, 3: Mage) ");
            cathegoP= sc.nextInt();
            do {
                System.out.println("Choisissez bien vos paramètres\n\nniveau du personnage ??");
                niveau = sc.nextInt();
                vie = niveau * 5;
                System.out.println("force du personnage ??");
                force = sc.nextInt();
                System.out.println("agilité du personnage ??");
                agilité = sc.nextInt();
                System.out.println("intelligence du personnage ??");
                intelligence = sc.nextInt();
            }  while (niveau!=(force+agilité+intelligence));
            CathegoPersonnage cathegoPersonnage1 = new CathegoPersonnage(cathegoP, name3, niveau, vie, force,agilité ,intelligence);
            Personnage joueur2 = new Personnage(niveau, vie, force, agilité, intelligence, cathegoPersonnage1, name3);

            while ((joueur1.getVie()>0)&&(joueur2.getVie()>0)) {
                tab= joueur1.getCathegoPersonnage().attaque(joueur1.getVie(), joueur2.getVie(), name1, name3, cathego, false, joueur1.getForce(), joueur1.getAgilité(), joueur2.getIntelligence(), joueur1.getIntelligence());
                joueur1.setVie(tab[0]);
                joueur2.setVie(tab[1]);
                joueur1.setAgilité(tab[2]);
                if ((joueur1.getVie()>0)&&(joueur2.getVie()>0)) {
                    tab = joueur2.getCathegoPersonnage().attaque(joueur2.getVie(), joueur1.getVie(), name3, name1, cathegoP, false, joueur2.getForce(), joueur2.getAgilité(), joueur1.getIntelligence(), joueur2.getIntelligence());
                    joueur2.setVie(tab[0]);
                    joueur1.setVie(tab[1]);
                    joueur2.setAgilité(tab[2]);
                }
            }
            if (joueur1.getVie()<=0)
                System.out.println("Joueur 1 a perdu");
            else if (joueur2.getVie()<=0)
                System.out.println("Joueur 2 a perdu");

        }
        System.out.println("FIN DU JEU");
    }
}




















