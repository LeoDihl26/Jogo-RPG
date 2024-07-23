package com.mycompany.rpg;

import java.util.Random;
import java.util.Scanner;

/** A classe abstrata "Personagem" é usada para definir um modelo de personagem no jogo
* ela contém métodos e atributos comuns que todos os personagens vão ter. 
* Não podeser instanciada diretamente, pois não representa um personagem específico, apenas o modelo.
*/
public abstract class Personagem {

    Scanner INT = new Scanner(System.in);

    // Atributos do personagem + vida do oponente
    protected String nome;
    protected int vida;
    protected int forca;
    protected int magia;
    protected int furia;
    protected int hpComputador;

    //Constructor para inicializar um objeto de personagem
    public Personagem(String nome, int vida, int forca, int furia, int hpComputador) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.furia = furia;
        this.hpComputador = hpComputador;
    }

    // Getters e Setters
    //NOME DO PERSONAGEM
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //VIDA DO PERSONAGEM
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    //FORÇA DO PERSONAGEM
    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    //MAGIA DO PERSONAGEM
    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    //FURIA DO PERSONAGEM
    public int getFuria() {
        return furia;
    }

    public void setFuria(int furia) {
        this.furia = furia;
    }

    //VIDA DO MACACO
    public int getHpComputador() {
        return hpComputador;
    }

    public void setHpComputador(int hpComputador) {
        this.hpComputador = hpComputador;
    }
    
    /////////// AUMENTAR/DIMINUIR ATRIBUTOS ////////////////
    protected int mudarVida;
    protected int mudarForca;
    protected int mudarMagia;
    protected int mudarFuria;

    //DIMINUIR VIDA
    public void diminuirVidaLVL0() {
        Random RANDOM = new Random();
        mudarVida = RANDOM.nextInt((5 - 2) + 1) + 2;
        this.vida = vida - mudarVida;
    }

    public void diminuirVidaLVL1() {
        Random RANDOM = new Random();
        mudarVida = RANDOM.nextInt((15 - 6) + 1) + 6;
        this.vida = vida - mudarVida;
    }

    //AUMENTAR VIDA
    public void aumentarVidaLVL0() {
        Random RANDOM = new Random();
        mudarVida = RANDOM.nextInt((12 - 5) + 1) + 5;
        this.vida += vida + mudarVida;
    }

    public void aumentarVidaLVL1() {
        Random RANDOM = new Random();
        mudarVida = RANDOM.nextInt((26 - 13) + 1) + 13;
        this.vida = vida + mudarVida;
    }

    //DIMINUIR FORÇA
    public void diminuirForcaLVL1() {
        Random RANDOM = new Random();
        mudarForca = RANDOM.nextInt((3 - 1) + 1) + 1;
        this.forca = forca - mudarForca;
    }

    //AUMENTAR FORÇA
    public void aumentarForcaLVL1() {
        Random RANDOM = new Random();
        mudarForca = RANDOM.nextInt((3 - 1) + 1) + 1;
        this.forca = forca + mudarForca;
    }

    //AUMENTAR FURIA
    public void ADDFuriaNIVEL0() {
        Random RANDOM = new Random();
        mudarFuria = RANDOM.nextInt((10 - 1) + 1) + 1;
        this.furia += mudarFuria;
    }

    public void ADDFuriaNIVEL1() {
        Random RANDOM = new Random();
        mudarFuria = RANDOM.nextInt((20 - 10) + 1) + 10;
        //this.furia = furia + mudarFuria;
        this.furia += mudarFuria;
    }

    public void ADDFuriaNIVEL2() {
        Random RANDOM = new Random();
        mudarFuria = RANDOM.nextInt((40 - 30) + 1) + 30;
        //this.furia = furia + mudarFuria;
        this.furia += mudarFuria;
    }

    public void ADDFuriaNIVEL3() {
        Random RANDOM = new Random();
        mudarFuria = RANDOM.nextInt((70 - 50) + 1) + 50;
        this.furia += mudarFuria;
    }

    //AUMENTAR MAGIA
    protected void ADDMagiaNIVEL1() {
        Random RANDOM = new Random();
        mudarMagia = RANDOM.nextInt((2 - 1) + 1) + 1;
        this.magia = magia + mudarMagia;
    }

    protected void ADDMagiaNIVEL2() {
        Random RANDOM = new Random();
        mudarMagia = RANDOM.nextInt((5 - 2) + 1) + 2;
        this.magia = magia + mudarMagia;
    }

    protected void ADDMagiaNIVEL3() {
        Random RANDOM = new Random();
        mudarMagia = RANDOM.nextInt((8 - 4) + 1) + 4;
        this.magia = magia + mudarMagia;
    }


    // Mostrar Status dos atributos atuais do personagem
    protected void StatusGeralP1() {
        System.out.println("\nSTATUS:");
        System.out.println("Vida Atual: " + vida);//vida += 0;
        System.out.println("Força Atual: " + (forca + furia / 10) + " (Bônus de Furia: " + furia / 10 + ")");//forca += 0;
        System.out.println("Magia Atual: " + magia);//magia += 0; 
        System.out.println("Furia Atual: " + furia + "%");//furia += 0;System.out.println("%"); 
    }
}
