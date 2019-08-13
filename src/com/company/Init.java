package com.company;

import java.util.Scanner;

class Init {
    private int[] tab1;
    Init(int[] tab1) {
        this.tab1=tab1;
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
    private int[] setTab(int[] tab1) {
        String string1="niveau", string2="force", string3="agilité", string4="intelligence";
        do {
            System.out.println("Choisissez vos paramètres !!!(le niveau doit ètre égal à la somme(force+agilité+intelligence)), MERCI.\n");
            tab1[0]=init1(string1);
            tab1[1] = tab1[0] * 5;
            tab1[2] =init1(string2);
            tab1[3] = init1(string3);
            tab1[4] = init1(string4);
        } while (tab1[0]!=(tab1[2]+tab1[3]+tab1[4]));
        this.tab1 = tab1;
        return this.tab1;
    }
}
