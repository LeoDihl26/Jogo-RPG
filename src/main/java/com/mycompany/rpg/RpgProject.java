package com.mycompany.rpg;

import java.util.Scanner;

// Classe principal que dá início ao jogo
public class RpgProject {

        public static void main(String[] args) {

        Aventura a1 = new Aventura();

        System.out.print("¨¨¨¨Kymera Kingdom: O Início da jornada.¨¨¨¨\n");
        System.out.print("(Sempre que ler '>>>' aperte 'enter' para prosseguir.)\n");
        a1.menu();

    }
}
