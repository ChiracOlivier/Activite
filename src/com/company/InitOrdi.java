package com.company;

class InitOrdi {
    private int[] tab1;

    InitOrdi(int[] tab1) {

        this.tab1 = tab1;
    }

    int[] getTab1(int[] tab1) {
        return setTab1(tab1);
    }

    private int[] setTab1(int[] tab1) {
        int Max = 100, min1 = 1, min2 = 0;
        int range1 = Max - min1 + 1;
        int range2 = Max - min2 + 1;
        tab1[0]=(int)(Math.random()*range1)+min1;
        tab1[1]=tab1[0]*5;
        tab1[2]=(int)(Math.random()*range2)+min2;
        tab1[3]=(int)(Math.random()*range2)+min2;
        tab1[4]=(int)(Math.random()*range2)+min2;
        tab1[5]=(int)(Math.random()*3)+1;
        this.tab1 = tab1;
        return this.tab1;
    }




}