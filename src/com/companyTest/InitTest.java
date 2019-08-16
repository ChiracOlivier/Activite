package com.companyTest;



class InitTest {
    int a=15, tab1[]= {10, 5, 0, 5, 0};

    private int[] getTab1() {
        return tab1;
    }

    @org.junit.jupiter.api.Test
    void getTab1_ShouldReturn_Int_Tab() {
        int  tab[]={10,5,0,5,0};
        boolean b=(getTab1()==tab );
        System.out.println("InitTest Approuvé!!!!");
        assert (a==15);
    }




}