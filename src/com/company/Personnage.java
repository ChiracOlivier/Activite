package com.company;

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
    public int getVie() {
        return vie;
    }
    public void setVie(int vie) {
        this.vie = vie;
    }
    public int getForce() {
        return force;
    }
    public int getAgilité() {
        return agilité;
    }
    public void setAgilité(int agilité) {
        this.agilité = agilité;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public CathegoPersonnage getCathegoPersonnage() {
        return cathegoPersonnage;
    }
    public void setCathegoPersonnage(CathegoPersonnage cathegoPersonnage) {
        this.cathegoPersonnage = cathegoPersonnage;
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
