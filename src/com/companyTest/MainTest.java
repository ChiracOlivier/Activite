package com.companyTest;


class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
        System.out.println("Début des Tests:\n");
        new PersonnageTest();
        new ChoixTest().choixTest();
        new InitOrdiTest().getTab1();
        new InitTest().getTab1_ShouldReturn_Int_Tab();
        System.out.println("\n Fin des Tests");
    }
}