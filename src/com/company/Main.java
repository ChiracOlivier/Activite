package com.company;

import java.util.Scanner;

class Main {
    /**
     * fonction principale d'execution du programme.
     * @Param args
     */
    static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        int entree1;
        String name1 = "Joueur 1";
        entree1 = (new Choix()).choix(false, name1, sc1);
        if (entree1 == 1) {
            new ModeUnJoueur(name1, sc1);
        } else if (entree1 == 2) {
            new ModeDeuxJoueurs(name1, sc1);
        }
        System.out.println("FIN DU JEU");
    }
}

// Fin de l'application après deux semaines de boulot. Mais ça fonctionne. Mdrr... (ahahahahaha)