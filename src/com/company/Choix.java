package com.company;

import java.util.Scanner;

/**
 * classe permettant d'effectuer ses choix de mode
 * et ses choix de classe de personnage
 */
class Choix {

    Choix() {

    }

    int choix(boolean a, String string, Scanner sc){

        int b;
        if (a) {
            do {
                System.out.println("Création du personnage du " + string + "\n Veuillez choisir la classe du personnage: (1: Guerrier, 2: Rodeur, 3: Mage) ");
                b = sc.nextInt();
            }while ((b!=1)&&(b!=2)&&(b!=3));
            return b;
        }else{
            System.out.println("Bienvenue dans ce jeu  épique!!!\n");
            System.out.println("Choississez votre mode :\n 1: 1 joueur\n 2: 2 joueurs\n");
            return sc.nextInt();
        }
    }

}
