package com.company;

/**
 * classe de création des personnages du jeu, joueur1, joueur2 et ordinateur
 */
public class Personnage {
    private int niveau, vie, force , agilité,  intelligence;
    private CathegoPersonnage cathegoPersonnage;
    Personnage(int niveau, int vie, int force, int agilité, int intelligence, CathegoPersonnage cathegoPersonnage){
            this.niveau= niveau;
            this.vie= vie;
            this.force= force;
            this.agilité= agilité;
            this.intelligence= intelligence;
            this.cathegoPersonnage= cathegoPersonnage;
    }
    int getVie() {
        return vie;
    }
    void setVie(int vie) {
        this.vie = vie;
    }
    int getForce() {
        return force;
    }
    int getAgilité() {
        return agilité;
    }
    void setAgilité(int agilité) {
        this.agilité = agilité;
    }
    int getIntelligence() {
        return intelligence;
    }
    CathegoPersonnage getCathegoPersonnage() {
        return cathegoPersonnage;
    }
    @Override
    public String toString() {
        return "Personnage{" +
                "niveau=" + niveau +
                ", vie=" + vie +
                ", force=" + force +
                ", agilité=" + agilité +
                ", intelligence=" + intelligence +
                ", cathegoPersonnage=" + cathegoPersonnage +
                '}';
    }
}
