package com.company;

import java.util.Scanner;

public class CathegoPersonnage {


    public CathegoPersonnage(int cathego, String name, int niveau, int vie, int force, int agilité, int intellij) {
        switch (cathego){
            case 1:
                System.out.println("Woarg, je suis le Guerrier "+name+" niveau "+niveau+" je possède "+vie+" de vitalité "+force+" de force "+agilité+" d'agilité et "+intellij+" d'intelligence !");
                break;
            case 2:
                System.out.println("oohh looloo je suis le Rodeur "+name+" niveau "+niveau+" je possède "+vie+" de vitalité "+force+" de force "+agilité+" d'agilité et "+intellij+" d'intelligence !");
                break;
            case 3:
                System.out.println("Abracadabra je suis le Mage "+name+" niveau "+niveau+" je possède "+vie+" de vitalité "+force+" de force "+agilité+" d'agilité et "+intellij+" d'intelligence !");
                break;
            default:
                break;
        }
    }
    public int[] attaque(int vitalit , int vital ,String name , String nam, int cathego, boolean ordix, int dommage, int dommag, int intellij, int intelliji) {
        Scanner sc = new Scanner(System.in);
        int[] tab= {1,1,1};
        if (!ordix) {
            if (cathego == 1) {
                System.out.println(name+" ("+vitalit+" Vitalité), veuillez choisir votre action: (1: attaque basique, 2: attaque spéciale)");
                int attac = sc.nextInt();
                if (attac == 1) {
                    System.out.println(name + " utilise coup d'épée et inflige " + dommage + " dommages\n " + nam + " perd " + dommage + " points de vie");
                    tab[1] = vital - dommage;
                    tab[0]=vitalit;
                    tab[2]=dommag;
                }
                else if (attac==2){
                    System.out.println(name + " utilise coup de Rage et inflige " + (dommage * 2) + " dommages\n" + nam + " perd " + (dommage * 2) + " points de vie\n " + name + " perd " + (dommage / 2) + " points de vie");
                    tab[1] = vital - (dommage * 2);
                    tab[0] = vitalit - (dommage / 2);
                    tab[2]=dommag;
                }else
                    System.out.println("COUP manqué !!!");
            } else if (cathego == 2) {
                System.out.println(name+" ("+vitalit+" Vitalité), veuillez choisir votre action: (1: attaque basique, 2: attaque spéciale)");
                int attac = sc.nextInt();
                if (attac == 1) {
                    System.out.println(name + " utilise Tir à l'Arc et inflige " + dommag + " dommages\n" + nam + " perd " + dommag + " points de vie");
                    tab[0] = vitalit ;
                    tab[1]=vital- dommag;
                    tab[2]=dommag;
                }
                else if (attac==2){
                    System.out.println(name + " utilise Concentration et gagne " + (dommag) / 2 + " d'agilité");
                    tab[2] = dommag + dommag / 2;
                    tab[0]=vitalit;
                    tab[1]=vital;
                }else
                    System.out.println("COUP manqué !!!");
            } else if (cathego == 3) {
                System.out.println(name+" ("+vitalit+" Vitalité), veuillez choisir votre action: (1: attaque basique, 2: attaque spéciale)");
                int attac = sc.nextInt();
                if (attac == 1) {
                    System.out.println(name + " utilise Boule de feu et inflige " + intellij + " dommages\n" + nam + " perd " + intellij + " points de vie");
                    tab[1] = vital - intellij;
                    tab[0]=vitalit;
                    tab[2]=dommag;
                }
                else if(attac==2) {
                    System.out.println(name + " utilise Soin et gagne " + (intelliji) * 2 + " points de vie");
                    tab[0] = vitalit + (intellij * 2);
                    tab[1]=vital;
                    tab[2]=dommag;
                }else
                    System.out.println("COUP manqué !!!");
            }

        }else{
            if (cathego == 1) {
                int attac = (int)(Math.random()*2) +1;
                if (attac == 1) {
                    System.out.println(name + " utilise coup d'épée et inflige " + dommage + " dommages\n" + nam + " perd " + dommage + " points de vie");
                    tab[1] = vital - dommage;
                    tab[0]=vitalit;
                    tab[2]=dommag;
                }
                else if (attac==2){
                    System.out.println(name + " utilise coup de Rage et inflige " + (dommage * 2) + " dommages\n" + nam + " perd " + (dommage * 2) + " points de vie\n" + name + " perd " + (dommage / 2) + " points de vie");
                    tab[1] = vital - dommage * 2;
                    tab[0] = vitalit - dommage / 2;
                    tab[2]=dommag;
                }else
                    System.out.println("COUP manqué !!!");
            } else if (cathego == 2) {
                int attac =(int)(Math.random()*2) +1;
                if (attac == 1) {
                    System.out.println(name + " utilise Tir à l'Arc et inflige " + dommag + " dommages\n " + nam + " perd " + dommag + " points de vie");
                    tab[1] = vital - dommag;
                    tab[0]=vitalit;
                    tab[2]=dommag;
                }
                else if (attac==2){
                    System.out.println(name + " utilise Concentration et gagne " + (dommag) / 2 + " d'agilité");
                    tab[2] = dommag + dommag / 2;
                    tab[0]=vitalit;
                    tab[1]=vital;
                }else
                    System.out.println("COUP manqué !!!");
            } else if (cathego == 3) {
                int attac =(int)(Math.random()*2) +1;
                if (attac == 1) {
                    System.out.println(name + " utilise Boule de feu et inflige " + intellij + " dommages\n" + nam + " perd " + intellij + " points de vie");
                    tab[1] = vital - intellij;
                    tab[0]=vitalit;
                    tab[2]=dommag;
                }else if (attac==2){
                    System.out.println(name + " utilise Soin et gagne " + (intelliji) * 2 + " points de vie");
                    tab[0] = vitalit + intellij * 2;
                    tab[1]=vital;
                    tab[2]=dommag;
                }else
                    System.out.println("COUP manqué !!!");
            }

        }
        return tab;
    }

    @Override
    public String toString() {
        return "CathegoPersonnage{}";
    }
}
