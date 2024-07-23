package com.mycompany.rpg;

import com.mycompany.rpg.Personagem;
import java.util.Random;

public class Player1 extends Personagem {
    //protected int magia; // Para o Mago
    // protected int furia; // Para o Guerreiro

    public Player1(String nome, int vida, int forca, int furia, int hpComputador) {
        super(nome, vida, forca, furia, hpComputador);
    }

    //CLASSE MAGO//
    public String detalhesMago() {
        return "\nSua classe foi escolhida. Confira suas estatísticas iniciais de Mago: \n\n"
                + "Classe: Mago"
                + "\nNome: " + nome
                + "\nVida: " + vida
                + "\nForça: " + (forca + furia / 10)
                + "\nMagia: " + magia
                + "\nFuria: " + furia + "%";
    }

    public String detalhesGuerreiro() {
        return "\nSua classe foi escolhida. Confira suas estatísticas iniciais de Guerreiro: \n\n"
                + "Classe: Guerreiro"
                + "\nNome: " + nome
                + "\nVida: " + vida
                + "\nForça: " + (forca + furia / 10) + " (Bônus de Fúria: " + furia/10 + ")"  
                + "\nMagia: " + magia
                + "\nFuria: " + furia + "%";
    }
}
