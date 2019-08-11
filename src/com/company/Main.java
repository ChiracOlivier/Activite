package com.company;

import java.util.Scanner;

public class Main {


    private static int verif(int a){
            if ((a >= 0) && (a <= 100)) {
                return a;
            } else
                System.out.println("votre valeur doit etre comprise entre 0 et 100.");
                return -1;
    }
    private static int init1(String b){
        Scanner sc1= new Scanner(System.in);
        int entier1;
        do {
            System.out.println(b+" du personnage ??(valeur entre 0 et 100)");
            entier1= verif(sc1.nextInt());
        }while (entier1==-1);
        return entier1;
    }
    private static int[] init(){
        String string1="niveau", string2="force", string3="agilité", string4="intelligence";
        int[] tab1={0,0,0,0,0};
        do {
            System.out.println("Choisissez vos paramètres !!!(le niveau doit ètre égal à la somme(force+agilité+intelligence)), MERCI.\n");
            tab1[0]=init1(string1);
            tab1[1] = tab1[0] * 5;
            tab1[2] =init1(string2);
            tab1[3] = init1(string3);
            tab1[4] = init1(string4);
        } while (tab1[0]!=(tab1[2]+tab1[3]+tab1[4]));
        return tab1;
    }
      private static int choix(boolean a, String string){
          Scanner sc = new Scanner(System.in);
        if (a) {
            System.out.println("Création du personnage du "+string+"\n Veuillez choisir la classe du personnage: (1: Guerrier, 2: Rodeur, 3: Mage) ");
            return sc.nextInt();
        }else{
            System.out.println("Bienvenue dans ce jeu  épique!!!\n");
            System.out.println("Choississez votre mode :\n 1: 1 joueur\n 2: 2 joueurs\n");
            return sc.nextInt();
        }
      }
    /**
     * @param args
     */
    public static void main(String[] args) {

        String name1="Joueur 1", name2="ORDINATEUR", name3="Joueur 2";
        int entree1, tab[];
        entree1 = choix(false, name1);
        int niveau, vie, force, agilité, intelligence, cathego, cathegoP;
        if (entree1 == 1) {
            cathego= choix(true, name1);
          
            CathegoPersonnage cathegoPersonnage= new CathegoPersonnage(cathego,name1, niveau, vie, force, agilité, intelligence);
            Personnage joueur1 = new Personnage( niveau, vie, force, agilité, intelligence, cathegoPersonnage);
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
            cathego= choix(true, name1);
            tab=init();
            niveau=tab[0];
            vie=tab[1];
            force=tab[2];
            agilité=tab[3];
            intelligence=tab[4];
            CathegoPersonnage cathegoPersonnage = new CathegoPersonnage(cathego, name1, niveau, vie, force,agilité ,intelligence);
            Personnage joueur1 = new Personnage(niveau, vie, force, agilité, intelligence, cathegoPersonnage);
            cathegoP= choix(true, name3);
            tab=init();
            niveau=tab[0];
            vie=tab[1];
            force=tab[2];
            agilité=tab[3];
            intelligence=tab[4];
            CathegoPersonnage cathegoPersonnage1 = new CathegoPersonnage(cathegoP, name3, niveau, vie, force,agilité ,intelligence);
            Personnage joueur2 = new Personnage(niveau, vie, force, agilité, intelligence, cathegoPersonnage1);

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