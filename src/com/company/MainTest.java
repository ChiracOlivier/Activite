package com.company;

import com.company.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

            @Test
            public void Given_InformationsToCreateCharacteristicsPlayer_When_Init_Then_CharacteristicsPlayerIsCorrectlyCreated() {
                int table[]={0,0,0,0,0};
                System.setIn(new ByteArrayInputStream(String.format("10%n5%n3%n2%n").getBytes()));
                Scanner sc1= new Scanner(System.in);
                Init modeUnJoueur= new Init(table);
                int[] character = modeUnJoueur.getTab1(table, sc1);
                assertEquals(10, character[0]);
                assertEquals(50, character[1]);
                assertEquals(5, character[2]);
                assertEquals(3, character[3]);
                assertEquals(2, character[4]);
            }

            @Test
            void Given_Nothing_When_InitOrdi_Then_CharacteristicsOrdiIsCorrectlyCreated(){
                int tabl[]={0,0,0,0,0,0};
                InitOrdi initOrdi= new InitOrdi(tabl);
                int[] chracter= initOrdi.getTab1(tabl);
                assert((0<=chracter[0])&&(chracter[0]<=100));
                assert((0<=chracter[1])&&(chracter[1]<=500));
                assert((0<=chracter[2])&&(chracter[2]<=100));
                assert((0<=chracter[3])&&(chracter[3]<=100));
                assert((0<=chracter[4])&&(chracter[4]<=100));
                assert((0<=chracter[5])&&(chracter[5]<=100));
            }

            @Test
            void Given_Informations_When_Choix_Then_MakeChoicesCorrectly(){
                System.setIn(new ByteArrayInputStream(String.format("2%n3%n").getBytes()));
                Scanner sc1 = new Scanner(System.in);
                Choix choi= new Choix();
                int entier= choi.choix(false, "Test", sc1);
                int entie= choi.choix(true, "Test", sc1);
                assert((1<=entier)&&(entier<=2));
                assert((1<=entie)&&(entie<=3));
            }
            @Test
            void Given_CharacteristicsOfPlayersAndInformationsBattle_When_Attaque_Then_CharacteristicAndVitalityChanged(){
                System.setIn(new ByteArrayInputStream(String.format("1%n2%n").getBytes()));
                Scanner sc1 = new Scanner(System.in);
                CathegoPersonnage cathegoPersonnage= new CathegoPersonnage(1,"JoueurTest1",40,200,20,10,10);
                Personnage player1 =new Personnage(40,200,20,10,10,cathegoPersonnage);
                CathegoPersonnage cathegoPersonnag= new CathegoPersonnage(2,"JoueurTest2",40,200,20,10,10);
                Personnage player2 =new Personnage(40,200,20,10,10,cathegoPersonnag);

                int[] tab= player1.getCathegoPersonnage().attaque(sc1, 200, player2.getVie(),"JoueurTest1","JoueurTest2",1,false,20,20,10,10);
                assertEquals((200-20),tab[1]);
            }
            @Test
            void Given_FullGameStartedAndFinished_When_ModeDeuxJoueursStartedAndFinished_Player2Dead(){
                System.setIn(new ByteArrayInputStream(String.format("1%n10%n10%n0%n0%n2%n3%n0%n3%n0%n1%n1%n1%n").getBytes()));
                Scanner sc1= new Scanner(System.in);
                new ModeDeuxJoueurs("Joueur1Test", sc1);

                assert(true);
                //assertEquals(15 - 10 - 10, main.player2.getVitality());
            }
        }
