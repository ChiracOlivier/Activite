package com.company;

/**
 * cette classe crée le personnage de l'ordinateur de façon aléatoire
 * cette classe hérite de la classe personnage
 */
class Ordi extends Personnage {
    Ordi(int niveau, int vie, int force, int agilité, int intelligence, CathegoPersonnage cathegoPersonnage) {
        super(niveau, vie, force, agilité, intelligence, cathegoPersonnage);
    }
}
