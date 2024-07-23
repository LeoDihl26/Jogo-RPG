package com.mycompany.rpg;

import java.awt.Menu;
import java.io.Closeable;
import java.util.Random;
import java.util.Scanner;

// Classe principal da aventura
public class Aventura {

    Player1 p1 = new Player1("", 0, 0, 0, 0);

    // Variáveis de controle e mudança de danos
    int escolhaAtaque;
    int mudarNumero;
    int mudarNumero2;

    Scanner STRING = new Scanner(System.in);
    String enter01;

    void menu() {
        Scanner INT = new Scanner(System.in);
        int op = 0;

        System.out.print("\nMENU:\n(1) | Iniciar Aventura\n(2) | Prelúdio da História\n(3) | Créditos \n\n ");

        op = INT.nextInt();

        if (op == 1) {
            inicio();
        } else if (op == 2) {
            resumo();
        } else if (op == 3) {
            exitGame();
        } else {
            menu();
        }

    }

    // Método que inicia a aventura e define as características do jogador
    void inicio() {
        int escolha = 0;
        String enter;
        String nome1;

        Scanner STRING = new Scanner(System.in);
        Scanner INT = new Scanner(System.in);

        System.out.print("\nSua Aventura começa.\n"
                + "\nQual o seu nome? ");

        nome1 = STRING.nextLine();

        System.out.print("\nQual classe deseja escolher? \n"
                + "(1) | Mago\n"
                + "(2) | Guerreiro\n\n");

        while (escolha != 1 && escolha != 2) {

            escolha = INT.nextInt();

            if (escolha != 1 && escolha != 2) {
                System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }

        if (escolha == 1) {
            p1.setNome(nome1);
            p1.setVida(80);
            p1.setForca(8);
            p1.setMagia(6);
            p1.setFuria(0);
            System.out.println(p1.detalhesMago());
            System.out.print("\nExplicando rapidamente:"
                    + "\nFURIA: Impacta direto na sua força, quanto maior for a sua fúria no momento, mais dano você irá causar!\n"
                    + "MAGIA: Use magia para realizar feitiços poderesos! Cada feitiço gasta uma quantia diferente de magia. >>>\n");
            enter = STRING.nextLine();
            ato1();
        } else if (escolha == 2) {
            p1.setNome(nome1);
            p1.setVida(130);
            p1.setForca(12);
            p1.setMagia(0);
            p1.setFuria(60);
            System.out.println(p1.detalhesGuerreiro());
            System.out.print("\nExplicando rapidamente:"
                    + "\nFURIA: Impacta direto na sua força, quanto maior for a sua fúria no momento, mais dano você irá causar!\n"
                    + "MAGIA: Use magia para realizar feitiços poderesos! Cada feitiço gasta uma quantia diferente de magia. >>>\n");
            enter = STRING.nextLine();
            ato1();
        }
    }

    // Primeiro ato da aventura
    void ato1() {

        String enter01;
        int caminho = 0;
        Scanner STRING = new Scanner(System.in);
        Scanner INT = new Scanner(System.in);

        System.out.print(p1.nome + " se encontra numa floresta nebulosa, tentando achar uma saída. >>>");
        enter01 = STRING.nextLine();
        System.out.print("\nAo se deparar com uma bifurcação, onde há duas placas: >>>");
        enter01 = STRING.nextLine();

        System.out.print("\n           (1)                            (2)             "
                + "\n|    PLACA DA ESQUERDA    |   |     PLACA DA DIREITA     |"
                + "\n| Caminho mais rápido até |   | Caminho turbulento até a |"
                + "\n| Kymera Kingdom. Calmo   | - | cidade de Kymera Kingdom |"
                + "\n| sereno, se escutam sons |   | Não recomendado para os  |"
                + "\n| angelicais no caminho.  |   | fracos de coração.       |\n\n");

        while (caminho != 1 && caminho != 2) {

            System.out.print("Você quer seguir para a esquerda, ou para a direita? ");
            caminho = INT.nextInt();

            if (caminho != 1 && caminho != 2) {
                System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
        if (caminho == 1) {
            System.out.print("\nSeguindo o caminho da esquerda, " + p1.nome + " tem uma tranquila caminhada, até se deparar com a casa de um bruxo. >>>");
            enter01 = STRING.nextLine();
            System.out.print("\n" + p1.nome + ", na tentativa de ver se tem alguém ali, grita para o bruxo: ");
            enter01 = STRING.nextLine();
            System.out.println("\nBruxo Maquiavélico: CAAAAALE-SE!!! insolente...Não vê que estou de folga? >>>");
            enter01 = STRING.nextLine();
            System.out.println("Bruxo Maquiavélico: Francamente...só fazem jovens mequetrefes, hoje em dia. >>>");
            enter01 = STRING.nextLine();
            System.out.println("Bruxo Maquiavélico: Ok, já estou calmo. Meu nome é 'Dumble Porta', aliás. >>>");
            enter01 = STRING.nextLine();
            System.out.println("Dumble Porta: Sou um bruxo das antigas, não estou muito acostumado a ver gente dessa nova geração... >>>");
            enter01 = STRING.nextLine();
            System.out.println(p1.nome + ": Tudo bem, só estou de passagem, desejo chegar a Kymera Kingdom o quantos antes! >>>");
            enter01 = STRING.nextLine();
            p1.ADDMagiaNIVEL2();
            p1.aumentarVidaLVL1();
            System.out.println("Dumble Porta: Entendo...EXPELIANUS!!! (Dumble Porta lança um feitiço em você.)"
                    + "\n+" + p1.mudarMagia + " de Magia"
                    + "\n+" + p1.mudarVida + " de HP");
            enter01 = STRING.nextLine();
            System.out.println(p1.nome + ": Mas... >>>");
            enter01 = STRING.nextLine();
            System.out.println("Dumble Porta: Relaxe, não diga nada! Considere essa ajuda na sua aventura, será necessário, eu sinto isso. >>>");
            enter01 = STRING.nextLine();
            System.out.println("Dumble Porta: Você irá enfrentar muitas batalhas pela frente, então isso deve ser útil. >>>");
            enter01 = STRING.nextLine();
            System.out.println(p1.nome + ": Velho caduco...mas agradeço. Adeus. >>>");
            enter01 = STRING.nextLine();
            System.out.print("Ao chegar no fim da floresta, você se depara com uma cidade de visual gótico. >>>");
            enter01 = STRING.nextLine();
            System.out.print("\nTambém se notam construções macabras e poucas pessoas circulando aos arredores. >>>");
            enter01 = STRING.nextLine();
            System.out.print("\nQual será sua ação?\n");

            ato2();

        } else if (caminho == 2) {
            p1.diminuirVidaLVL0();
            p1.ADDFuriaNIVEL1();

            System.out.print("\nSeguindo o caminho da direita, você tem uma terrível caminhada! >>>");
            enter01 = STRING.nextLine();
            System.out.print("\nMacacos com pele flamejante, exalando um fogo negro te atacam. >>>");
            enter01 = STRING.nextLine();
            System.out.print("\nVocê não tem chance de defesa. Leva uma sova dos macacos, e se enfurece pela situação.\n"
                    + "\n-" + p1.mudarVida + " de Vida. "
                    + "\n+" + p1.mudarFuria + "% de Furia. >>>");
            enter01 = STRING.nextLine();

            p1.diminuirVidaLVL1();
            p1.ADDFuriaNIVEL2();

            System.out.print("\nMinutos depois do encontro com os macacos flamejantes, uma bruxa velha carcomida aparece e grita: >>>");
            enter01 = STRING.nextLine();
            System.out.print("\nBruxa Carcomida: " + p1.getNome() + ", vá embora imediatamente!");
            enter01 = STRING.nextLine();
            System.out.print("\n" + p1.nome + ": Velha mocoronga! Pera aí, como é que você sabe o meu nom- >>> ");
            enter01 = STRING.nextLine();
            System.out.print("\nBruxa Carcomida: AZARATH... METRION... ZINTHOS! >>>");
            enter01 = STRING.nextLine();
            System.out.print("\n" + p1.nome + ": AAAAAAHHHH!! >>>");
            enter01 = STRING.nextLine();
            System.out.print("\nA bruxa lançou uma energia negra sinistra em você. Você toma danos consideráveis, e se enfurece pela situação. >>>\n");
            enter01 = STRING.nextLine();
            System.out.print("-" + p1.mudarVida + " de Vida  "
                    + "\n+" + p1.mudarFuria + "% de Furia  >>>\n");

            enter01 = STRING.nextLine();

            p1.StatusGeralP1();
            System.out.print("\n>>>");

            enter01 = STRING.nextLine();

            System.out.print("\nAo chegar no fim da floresta, você se depara com uma cidade de visual gótico. >>>");
            enter01 = STRING.nextLine();
            System.out.print("\nTambém se notam construções macabras e poucas pessoas circulando aos arredores. >>>");
            enter01 = STRING.nextLine();
            System.out.print("\nQual será sua ação?\n");
            ato2();
        }
    }

    // Segundo ato da aventura
    void ato2() {
        String enter01;
        int opcao = 0;
        Scanner STRING = new Scanner(System.in);
        Scanner INT = new Scanner(System.in);

        System.out.print("\n(1) | Explorar a Cidade\n(2) | Ver Status\n\n ");

        opcao = INT.nextInt();

        if (opcao != 1 && opcao != 2 && opcao != 3) {
            System.out.println("Opção inválida. Por favor, escolha novamente.");
        }

        if (opcao == 1) {

            System.out.print("\nDecidindo explorar a cidade, você logo de cara se depara com uma figura hostil... >>> ");
            enter01 = STRING.nextLine();
            System.out.print("\nMacaco Flamejante Dourado do Sol Negro: U U U Á Á Á Você é um pedaço de cocô! U U U Á Á Á >>>");
            enter01 = STRING.nextLine();
            System.out.print("\n" + p1.nome + ": ");
            enter01 = STRING.nextLine();
            System.out.println("");
            System.out.println("Macaco Flamejante Dourado do Sol Negro: U U U Á Á Á Não interessa!!! U U U Á Á Á Cale a boca, e lute. >>>");
            enter01 = STRING.nextLine();
            p1.setHpComputador(300);
            batalha();

        }
        if (opcao == 2) {
            p1.StatusGeralP1();
            System.out.print("\n>>>");
            enter01 = STRING.nextLine();
            ato2();

        }

    }

    void ato3() {
    }

    void ato4() {
    }

    void ato5() {
    }

//////////////////////////////////////////////////////////////////////////////// 
//METODOS DA BATALHA CONTRA O MACACO
    int ataqueUsuario() {  //Menu de Ações durante a luta.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha sua ação:");
        System.out.println("(1) - Ataques Básicos");
        System.out.println("(2) - Golpes de Furia");
        System.out.println("(3) - Feitiços\n====================");
        return leitor.nextInt();
    }

    int ataqueRandom() { //Gerar um número aleatório de 1 a 10, usado para escolhas aleatórias de golpes.
        Random gerador = new Random();
        return gerador.nextInt(10) + 1;
    }

    int eventoRandom() { //Gerar um número aleatório de 1 a 50, usado para a escolha de eventos aleatórios em batalha.
        Random gerador = new Random();
        return gerador.nextInt(50) + 1;
    }

    void imprimeHP(String nome, int vida, int hpComputador) {
        System.out.println("\n====================");
        System.out.println("- HP " + p1.nome + ": " + p1.vida);
        System.out.println("- HP Macaco: " + p1.hpComputador);
        System.out.println("====================");
    }

    public int batalha() {

        //int hpUsuario = 100;
        //int hpComputador;
        //int contagemEspecial = 5;
        //int escolhaAtaque;
        int mudarNumero;
        int mudarNumero2;
        Random gerador = new Random();

        while (p1.vida >= 0) {

            p1.getHpComputador();

            System.out.println("XXXXX 'INICIO DA LUTA' XXXXX");
            //System.out.println("====================\n");

            while (p1.vida > 0 && p1.hpComputador > 0) {
                imprimeHP(p1.nome, p1.vida, p1.hpComputador);
                escolhaAtaque = ataqueUsuario();

                switch (escolhaAtaque) {
                    case 1 -> {
                        ataquesSimples();
                    }
                    case 2 -> {
                        ataquesFuria();
                    }
                    case 3 -> {
                        ataquesMagia();
                    }
                    default -> {
                        System.out.println("Opcão inválida. Você perdeu a vez. >>>");
                        enter01 = STRING.nextLine();
                    }
                }
                if (p1.hpComputador >= 0) {
                    escolhaAtaque = ataqueRandom(); //"ataqueComputador usa Random no intervalo 1-10 "
                    switch (escolhaAtaque) {

                        case 1, 2, 3 -> {
                            // 30%
                            mudarNumero = gerador.nextInt((4 - 2) + 1) + 2; // Escolhe um número de 2 a 4
                            System.out.println("\nMacaco acertou um 'Ataque Rápido' em você.\n-" + mudarNumero + " HP para " + p1.nome);
                            p1.vida -= mudarNumero;
                            System.out.println(">>>");
                            enter01 = STRING.nextLine();
                        }

                        case 4, 5, 6 -> {
                            // 30%
                            mudarNumero = gerador.nextInt((7 - 5) + 1) + 5; // Escolhe um número de 5 a 7
                            System.out.println("\nMacaco acertou um 'Chute Negro' em você.\n-" + mudarNumero + " HP para " + p1.nome);
                            p1.vida -= mudarNumero;
                            System.out.println(">>>");
                            enter01 = STRING.nextLine();
                        }

                        case 7 -> {
                            // 10%
                            mudarNumero = gerador.nextInt((10 - 7) + 1) + 7; // Escolhe um número de 7 a 10
                            mudarNumero2 = gerador.nextInt((3 - 1) + 1) + 1; // Escolhe um número de 1 a 3
                            System.out.println("\nMacaco pega " + mudarNumero2 + " cacho(s) de bananas flamejantes, come e se cura.\n"
                                    + "+" + (mudarNumero * mudarNumero2) + " HP para macaco.");
                            p1.hpComputador += (mudarNumero * mudarNumero2);
                            System.out.println(">>>");
                            enter01 = STRING.nextLine();
                        }

                        case 8, 9 -> {
                            // 20%
                            mudarNumero = gerador.nextInt((5 - 4) + 1) + 4; // Escolhe 5 ou 4
                            mudarNumero2 = gerador.nextInt((6 - 2) + 1) + 2; // Escolhe de 2 a 6
                            System.out.println("\nMacaco atirou " + mudarNumero2 + " bananas flamejantes em você.\n"
                                    + "-" + (mudarNumero * mudarNumero2) + " HP para " + p1.nome);
                            p1.vida -= (mudarNumero * mudarNumero2);
                            System.out.println(">>>");
                            enter01 = STRING.nextLine();
                        }

                        case 10 -> {
                            // 10% = Ataque Especial do Macaco

                            mudarNumero = gerador.nextInt((26 - 20) + 1) + 20; // Escolhe um número de 20 a 26
                            mudarNumero2 = gerador.nextInt((8 - 5) + 1) + 5; // Escolhe um número de 5 a 8
                            System.out.println("\nMacaco suga sua vida, e lança uma energia escura e devastadora em você."
                                    + "\n+" + mudarNumero + " HP para o macaco.\n-" + mudarNumero2 + " HP para " + p1.nome + "\n");
                            p1.hpComputador += mudarNumero;
                            p1.vida -= mudarNumero2;
                            System.out.println(">>>");
                            enter01 = STRING.nextLine();
                        }
                    }
                    if (p1.hpComputador >= 0) {
                        escolhaAtaque = eventoRandom(); //"Random no intervalo 1-50 "
                        switch (escolhaAtaque) {

                            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 -> {
                                // 60%

                            }

                            case 31, 32, 33, 34, 35 -> {
                                // 10%
                                p1.magia += 3;

                                System.out.println("\nSem perceber, uma brisa leve e 'inspiradora' sopra aos arredores de " + p1.nome + ".");
                                System.out.println("+" + 3 + " de Magia para " + p1.nome);
                                System.out.println(">>>");
                                enter01 = STRING.nextLine();

                            }

                            case 36, 37, 38, 39, 40 -> {
                                // 10%
                                mudarNumero = gerador.nextInt((25 - 15) + 1) + 15; // Escolhe um número de 20 a 26
                                p1.furia += 30;
                                p1.vida -= mudarNumero;
                                System.out.println("Macacos que estão pendurados em locais altos da cidade, atiram bananas flamejantes em " + p1.nome + ".");
                                System.out.println(p1.nome + " se enfurece pela situação.");
                                System.out.println("+" + 30 + "% de Fúria para " + p1.nome);
                                System.out.println("-" + mudarNumero + " de HP para " + p1.nome);
                                System.out.println(">>>");
                                enter01 = STRING.nextLine();
                            }
                            case 41, 42, 43, 44, 45 -> {
                                // 10%
                                mudarNumero = gerador.nextInt((11 - 7) + 1) + 7; // Escolhe um número de 20 a 26

                                System.out.println(p1.nome + " ouve um barulho estranho ecoando do fundo do seu estômago..." + p1.nome + " está sentindo muita fome. " + p1.nome + " sente dor.");

                                System.out.println("-" + mudarNumero + " de HP para " + p1.nome);
                                System.out.println(">>>");
                                enter01 = STRING.nextLine();
                            }

                            case 46, 47, 48, 49, 50 -> {
                                // 10%

                                System.out.println("Uma 'flecha perdida' acerta " + p1.nome + ". Graças a desatenção de " + p1.nome + ", o Macaco agora está zuando com a sua cara. ");
                                System.out.println(p1.nome + " se enfurece pela situação.");
                                System.out.println("-" + 30 + " de HP para " + p1.nome);
                                System.out.println("+" + 100 + "% de Fúria para " + p1.nome);
                                System.out.println(">>>");
                                enter01 = STRING.nextLine();
                            }
                        }

                    }

                } else {
                    System.out.println("Inimigo derrotado\n");
                }
            }

            if (p1.vida <= 0) {
                System.out.println("\nVocê foi derrotado pelo macaco. >>>");
                enter01 = STRING.nextLine();
                System.out.println("Macaco Flamejante Dourado do Sol Negro: No fim...você não deu nem pro cheiro. >>>\n");
                enter01 = STRING.nextLine();
                System.out.println("Macaco Flamejante Dourado do Sol Negro: Eu até poderia ser piedoso, mas deixar a escória viva não é do meu feitio. >>>\n");
                enter01 = STRING.nextLine();
                System.out.println("Macaco Flamejante Dourado do Sol Negro: Morra!!! >>>\n");
                enter01 = STRING.nextLine();
                System.out.println("Puts... você morreu. >>>");
                enter01 = STRING.nextLine();
                endGame();

            }

            if (p1.hpComputador <= 0) {
                System.out.println("Você derrotou o macaco. >>>\n");
                enter01 = STRING.nextLine();
                System.out.println("Macaco Flamejante Dourado do Sol Negro: Argh... >>>\n");
                enter01 = STRING.nextLine();
                System.out.println("Macaco Flamejante Dourado do Sol Negro: Não consigo acreditar que fui derrotado pela escória... >>>\n");
                enter01 = STRING.nextLine();
                System.out.println("Macaco Flamejante Dourado do Sol Negro: Você irá ter um árduo caminho pela frente, então recomendo que treine mais >>>\n");
                enter01 = STRING.nextLine();
                System.out.println("Macaco Flamejante Dourado do Sol Negro: Caso contrário, os seres monstruosos desse reino... vão trucidar você, " + p1.nome + "! >>>\n");
                enter01 = STRING.nextLine();
                System.out.println(p1.nome + ": Mas que... como diabos você sabe o meu nome? >>>\n");
                enter01 = STRING.nextLine();
                System.out.println("Macaco Flamejante Dourado do Sol Negro: Ai minha barriga, morri. >>>\n");
                enter01 = STRING.nextLine();
                endGame();
            }

        }
        return 0;
    } //fecha o Int Batalha = Toda a luta

    int ataquesSimplesMenu() {
        Scanner leitor = new Scanner(System.in);
        String enter01;
        Scanner STRING = new Scanner(System.in);
        System.out.println("Opções de Ataque:");
        System.out.println("(1) - Sequência de Golpes ");
        System.out.println("(2) - Diable Jambe ");
        System.out.println("(3) - Concentração ");
        System.out.println("(4) - Descrições de cada Ataque");
        System.out.println("(5) - Status Gerais de " + p1.nome + "\n====================");
        return leitor.nextInt();

    }

    public void ataquesSimples() {

        Scanner STRING = new Scanner(System.in);
        String enter01;
        Random gerador = new Random();
        escolhaAtaque = ataquesSimplesMenu();

        switch (escolhaAtaque) {

            case 1 -> {

                mudarNumero = gerador.nextInt((6 - 4) + 1) + 4; // Dano dos Socos
                mudarNumero2 = gerador.nextInt((5 - 3) + 1) + 3; // Quantidade de Socos

                System.out.println("\n" + p1.nome + " conseguiu acertar " + mudarNumero2 + " golpes no macaco.");
                System.out.println(""
                        + "-" + (mudarNumero * mudarNumero2 + p1.furia / 10) + " HP para o Macaco.");
                p1.hpComputador -= (mudarNumero * mudarNumero2) + (p1.furia / 10);
                System.out.println(">>>");
                enter01 = STRING.nextLine();

            }

            case 2 -> {

                mudarNumero = gerador.nextInt((20 - 17) + 1) + 17; // Dano do Chute

                System.out.println("\n" + p1.nome + " aplicou um chute poderoso no macaco.");
                System.out.println("-" + (mudarNumero + p1.furia / 10) + " HP para o Macaco.");
                p1.hpComputador -= (mudarNumero + p1.furia / 10);
                System.out.println(">>>");
                enter01 = STRING.nextLine();
            }

            case 3 -> {
                // Aumento dos Atributos
                p1.furia += 10;
                p1.vida += 5;
                p1.magia += 1;
                System.out.println("\n" + p1.nome + " respira, busca equílibrio e se sente mais forte! ");
                System.out.println("+" + 10 + "% de Furia");
                System.out.println("+" + 5 + " de HP");
                System.out.println("+" + 1 + " de Magia");
                System.out.println(">>>");
                enter01 = STRING.nextLine();

            }

            case 4 -> {

                System.out.println("\nDESCRIÇÕES:"
                        + "\nSequência de Golpes: " + p1.nome + " desfere de 3 a 5 socos no oponente. Cada soco oscila dentre 4 e 6 de Dano. (Mais o Bônus de Fúria)  "
                        + "\nDiable Jambe: " + p1.nome + " aplica um chute coberto de chamas, causando de 17 a 20 de Dano. (Mais o Bônus de Furia) "
                        + "\nConcentração: " + p1.nome + " se concentra rapidamente em reunir o máximo de energia que conseguir em pouco tempo. Aumenta sua Fúria em 10%, ganha 10 de HP e 1 de Magia. >>>");
                enter01 = STRING.nextLine();
                ataquesSimples();
            }

            case 5 -> {
                p1.StatusGeralP1();
                System.out.println(">>>");
                enter01 = STRING.nextLine();
                ataquesSimples();
            }

            default -> {
                System.out.println("Opção inválida.\n");
                System.out.println(">>>");
                enter01 = STRING.nextLine();
                ataquesSimples();
            }

        }

    }

    //////////////////////XXXXXXXXXXXXXXXXXXXXXXX/////////////////////
    int ataquesFuriaMenu() {  //Menu de Ações durante a luta.
        Scanner leitor = new Scanner(System.in);
        String enter01;
        Scanner STRING = new Scanner(System.in);
        System.out.println("Opções de Fúria:");
        System.out.println("## Fúria Atual: " + p1.furia + "% ##");
        System.out.println("(1) - Berserker ");
        System.out.println("(2) - Fury Of Titans ");
        System.out.println("(3) - Twinsanity ");
        System.out.println("(4) - Descrições de cada Ataque");
        System.out.println("(5) - Status Gerais de " + p1.nome + "\n====================");
        return leitor.nextInt();

    }

    public void ataquesFuria() {

        Scanner STRING = new Scanner(System.in);
        String enter01;
        Random gerador = new Random();
        escolhaAtaque = ataquesFuriaMenu();

        switch (escolhaAtaque) {

            case 1 -> {
                berserker();
            }

            case 2 -> {

                System.out.println("\n" + p1.nome + " materializa toda sua fúria em uma energia avermelhada na palma de sua mão, arremessando-a no adversário.");
                System.out.println("-" + p1.furia / 2 + " HP para o Macaco.");
                System.out.println("-" + p1.furia + "% Fúria para " + p1.nome);

                p1.hpComputador -= p1.furia / 2;
                p1.setFuria(0);
                System.out.println(">>>");
                enter01 = STRING.nextLine();
            }

            case 3 -> {

                p1.furia += 50;
                System.out.println("\n" + p1.nome + " canaliza sua própria insanidade, aumentando sua fúria. ");
                System.out.println("+" + 50 + "% de Fúria");
                System.out.println(">>>");
                enter01 = STRING.nextLine();
            }

            case 4 -> {

                System.out.println("\nDESCRIÇÕES:"
                        + "\nBerserker: Tenta cobrir seu corpo com sua própria fúria, para realizar um poderoso ataque. Pode ser bem-sucedido, mal-sucedido ou falho.  "
                        + "\nFury of Titans: " + p1.nome + " imita um golpe que viu um guerreiro fazendo uma vez e usa toda sua fúria canalizada, para causar muito dano no adversário.  "
                        + "\nTwinsanity: " + p1.nome + " respira fundo, e se lembra de memórias que causam um gatilho de raiva em você. Aumenta sua Fúria em 50%. >>>");
                enter01 = STRING.nextLine();
                ataquesFuria();

            }

            case 5 -> {
                p1.StatusGeralP1();
                System.out.println(">>>");
                enter01 = STRING.nextLine();
                ataquesFuria();

            }

            default -> {
                System.out.println("Opção inválida.\n");
                System.out.println(">>>");
                enter01 = STRING.nextLine();
                ataquesFuria();
            }

        }

    }

    public void berserker() {

        Random gerador = new Random();
        escolhaAtaque = ataqueRandom();

        switch (escolhaAtaque) {

            case 1, 2 -> {

                mudarNumero = gerador.nextInt((30 - 25) + 1) + 25; // Escolhe um número de 30 a 25
                p1.ADDFuriaNIVEL0();
                System.out.println("\n" + p1.nome + " aplicou um ataque de fúria berserker muito bem sucedido!");
                System.out.println(""
                        + "-" + mudarNumero + " HP para o Macaco.\n"
                        + "+" + p1.mudarFuria + "% de Furia para " + p1.nome);
                p1.hpComputador -= mudarNumero;
                System.out.println(">>>");
                enter01 = STRING.nextLine();

            }

            case 3, 4, 5 -> {

                mudarNumero = gerador.nextInt((20 - 15) + 1) + 15; // Escolhe um número de 20 a 15

                System.out.println("\n" + p1.nome + " aplicou um ataque de fúria berserker.");
                System.out.println("-" + mudarNumero + " HP para o Macaco.");
                p1.hpComputador -= mudarNumero;
                System.out.println(">>>");
                enter01 = STRING.nextLine();
            }

            case 6, 7, 8 -> {

                System.out.println("\n" + p1.nome + " tentou aplicar um ataque de fúria berserker, mas falhou.");
                System.out.println(">>>");
                enter01 = STRING.nextLine();
            }

            case 9 -> {
                mudarNumero = gerador.nextInt((20 - 10) + 1) + 10; // Escolhe um número de 20 a 1
                System.out.println("\nO corpo de " + p1.nome + " não aguentou usar a fúria. " + p1.nome + " sente os danos da tentativa frustrada.");
                System.out.println("-" + mudarNumero + " HP para " + p1.nome);
                p1.vida -= mudarNumero;
                System.out.println(">>>");
                enter01 = STRING.nextLine();
            }

            case 10 -> {
                mudarNumero = gerador.nextInt((20 - 15) + 1) + 15; // Escolhe um número de 20 a 15

                System.out.println("\n" + p1.nome + " acerta o golpe de fúria no macaco, mas sem controle, acaba sofrendo parte do dano.");
                System.out.println("-" + mudarNumero + "HP para " + p1.nome);
                System.out.println("-" + mudarNumero + "HP para o Macaco");
                p1.vida -= mudarNumero;
                p1.hpComputador -= mudarNumero;
                System.out.println(">>>");
                enter01 = STRING.nextLine();
            }
        }

    }

    //////////////////////XXXXXXXXXXXXXXXXXXXXXXX/////////////////////
    int ataquesMagiaMenu() {  //Menu de Ações durante a luta.
        Scanner leitor = new Scanner(System.in);
        String enter01;
        Scanner STRING = new Scanner(System.in);
        System.out.println("Opções de Feitiço:");
        System.out.println("## Magia Atual: " + p1.magia + " ##");
        System.out.println("(1) - Desintegrate ");
        System.out.println("(2) - Healing ");
        System.out.println("(3) - Full Healing ");
        System.out.println("(4) - Arcane Powers ");
        System.out.println("(5) - Circle of Death ");
        System.out.println("(6) - Descrições de cada Ataque ");
        System.out.println("(7) - Status Gerais de " + p1.nome + "\n====================");
        return leitor.nextInt();

    }

    public void ataquesMagia() {

        Scanner STRING = new Scanner(System.in);
        String enter01;
        Random gerador = new Random();
        escolhaAtaque = ataquesMagiaMenu();

        switch (escolhaAtaque) {

            case 1 -> {
                //DESINTEGRATE 2 de magia
                if (p1.magia > 1) {
                    System.out.println("\n" + p1.nome + " conjura um feitiço proíbido, que caso tenha êxito, irá devastar com a vida do oponente. >>>");
                    enter01 = STRING.nextLine();
                    desintegrate();
                    p1.magia -= 2;

                } else {

                    System.out.println(p1.nome + " não tem a quantidade de magia necessária para realizar o feitiço 'Desintegrate'. >>>");
                    enter01 = STRING.nextLine();
                    ataquesMagia();
                }
            }

            case 2 -> {
                //HEALING 1 de magia
                if (p1.magia > 0) {
                    mudarNumero = gerador.nextInt((15 - 10) + 1) + 10; // Escolhe um número de 15 a 10
                    System.out.println("\n" + p1.nome + " conjura um feitiço de cura simples");
                    System.out.println("+" + mudarNumero + " HP para " + p1.nome);
                    System.out.println("-" + 1 + " de Magia para " + p1.nome + ", por utilizar a magia 'Desintegrate'.\n");
                    p1.hpComputador -= mudarNumero;
                    p1.magia -= 1;
                    System.out.println(">>>");
                    enter01 = STRING.nextLine();

                } else {

                    System.out.println(p1.nome + " não tem a quantia de magia necessária para realizar o feitiço 'Healing'. >>>");
                    enter01 = STRING.nextLine();
                    ataquesMagia();
                }
            }

            case 3 -> {
                //FULL HEALING 4 de magia
                if (p1.magia > 3) {
                    p1.vida += 65;
                    System.out.println("\n" + p1.nome + " conjura um feitiço de cura utilizando muita magia!");
                    System.out.println("+" + 65 + " HP para " + p1.nome);
                    p1.magia -= 4;
                    System.out.println(">>>");
                    enter01 = STRING.nextLine();
                } else {

                    System.out.println(p1.nome + " não tem a quantia de magia necessária para realizar o feitiço 'Full Healing'. >>>");
                    enter01 = STRING.nextLine();
                    ataquesMagia();
                }
            }

            case 4 -> {
                // ANCIENT POWERS 12 de magia

                System.out.println("\n" + p1.nome + " tenta conjurar forças arcanas antigas, para receber uma grande ajuda contra seu adversário.");
                System.out.println(">>>");
                enter01 = STRING.nextLine();

                if (p1.magia > 11) {
                    p1.magia -= 12;
                    arcanePowers();

                } else {

                    System.out.println(p1.nome + " não tem a quantia de magia necessária para realizar o feitiço 'Arcane Powers'.");
                    System.out.println(">>>");
                    enter01 = STRING.nextLine();
                    ataquesMagia();
                }
            }

            case 5 -> {
                // CIRCLE OF DEATH 20 de magia

                System.out.println("\n" + p1.nome + " se prepara para realizar um ritual antigo, extremamente poderoso...porém, perigoso.");
                System.out.println(">>>");
                enter01 = STRING.nextLine();

                if (p1.magia > 19) {
                    p1.magia -= 20;
                    circleofDeath();

                } else {

                    System.out.println(p1.nome + " não tem a quantia de magia necessária para realizar o feitiço 'Circle of Death'.");
                    System.out.println(">>>");
                    enter01 = STRING.nextLine();
                    ataquesMagia();
                }

            }

            case 6 -> {
                // DESCRIÇÕES
                System.out.println("\nDESCRIÇÕES:"
                        + "\nDesintegrate: Gasta 2 de Magia. " + p1.nome + " tenta conjurar um feitiço antigo e proíbido, capaz de dileracerar o oponente, causando de 45 a 60 de Dano. Possui 60% de êxito total. "
                        + "\nHealing: Gasta 1 de Magia. " + p1.nome + " conjura um feitiço de cura, recuperando de 10 a 15 de HP. "
                        + "\nFull Healing: Gasta 4 de Magia. " + p1.nome + " conjura um feitiço de cura utilizando uma grande quantia de magia, recupera 65 de HP. "
                        + "\nArcane Powers: Gasta 12 de Magia. " + p1.nome + " tenta conjurar um feitiço extremamente poderoso. Pode obter 1 desses benefícios: ganho de Vida, Fúria, Magia ou Causar Dano no oponente. 10% de errar.  "
                        + "\nCircle of Death: Gasta 20 de Magia. " + p1.nome + " realiza um feitiço mortal. Colocando sua própria vida e a do oponente em um ritual da morte. Você tem 50% de chance causar ou receber 350 de Dano.  \n>>>");
                enter01 = STRING.nextLine();
                ataquesMagia();

            }

            case 7 -> {
                p1.StatusGeralP1();
                System.out.println(">>>");
                enter01 = STRING.nextLine();
                ataquesMagia();

            }

            default -> {
                System.out.println("Opção inválida.\n");
                System.out.println(">>>");
                enter01 = STRING.nextLine();
                ataquesMagia();
            }

        }

    }

    public void desintegrate() {

        Random gerador = new Random();
        escolhaAtaque = ataqueRandom();

        switch (escolhaAtaque) {

            case 1, 2, 3, 4, 5, 6 -> {

                mudarNumero = gerador.nextInt((50 - 35) + 1) + 35; // Escolhe um número de 60 a 45
                p1.ADDFuriaNIVEL0();
                System.out.println(p1.nome + " conjurou a magia 'Desintegrate' com êxito!");
                System.out.println("-" + mudarNumero + " HP para o Macaco.\n");
                System.out.println("-" + 2 + " de Magia para " + p1.nome + ", por utilizar a magia 'Desintegrate'.\n");
                p1.hpComputador -= mudarNumero;
                System.out.println(">>>");
                enter01 = STRING.nextLine();

            }

            case 7, 8, 9, 10 -> {

                System.out.println(p1.nome + " tentou conjurar a magia 'Desintegrate', mas falhou.");
                System.out.println(">>>");
                enter01 = STRING.nextLine();
            }

        }

    }

    public void arcanePowers() {

        Random gerador = new Random();
        escolhaAtaque = ataqueRandom();

        switch (escolhaAtaque) {

            case 1, 2 -> {

                mudarNumero = gerador.nextInt((80 - 65) + 1) + 65; // Escolhe um número de 80 a 65

                System.out.println(p1.nome + " conjurou uma magia arcana antiga com sucesso! Energias poderosas circundam seu oponente e causam um grande dano.");
                System.out.println("-" + mudarNumero + " HP para o Macaco.\n");
                System.out.println("-" + 12 + " de Magia para " + p1.nome + ", por utilizar a magia 'Arcane Powers'.\n");
                p1.hpComputador -= mudarNumero;
                System.out.println(">>>");
                enter01 = STRING.nextLine();

            }

            case 3, 4 -> {

                mudarNumero = gerador.nextInt((400 - 250) + 1) + 250; // Escolhe um número de 400 a 250

                System.out.println(p1.nome + " conjurou uma magia arcana antiga com sucesso! Energias poderosas circundam você e aumentam brutalmente sua energia de fúria.");
                System.out.println("+" + mudarNumero + "% de Fúria para " + p1.nome);
                System.out.println("-" + 12 + " de Magia para " + p1.nome + ", por utilizar a magia 'Arcane Powers'.\n");
                p1.furia += mudarNumero;
                System.out.println(">>>");
                enter01 = STRING.nextLine();

            }

            case 5, 6 -> {

                mudarNumero = gerador.nextInt((120 - 80) + 1) + 80; // Escolhe um número de 120 a 80

                System.out.println(p1.nome + " conjurou uma magia arcana antiga com sucesso! Energias poderosas circundam você e regeneram muito do seu HP.");
                System.out.println("+" + mudarNumero + " de HP para " + p1.nome);
                System.out.println("-" + 12 + " de Magia para " + p1.nome + ", por utilizar a magia 'Arcane Powers'.\n");
                p1.vida += mudarNumero;
                System.out.println(">>>");
                enter01 = STRING.nextLine();
            }

            case 7, 8 -> {

                mudarNumero = gerador.nextInt((21 - 16) + 1) + 16; // Escolhe um número de 16 a 21

                System.out.println(p1.nome + " conjurou uma magia arcana antiga com sucesso! Energias poderosas circundam você e lhe concedem muita magia!");
                System.out.println("+" + mudarNumero + " de Magia para " + p1.nome);
                System.out.println("-" + 12 + " de Magia para " + p1.nome + ", por utilizar a magia 'Arcane Powers'.\n");
                p1.magia += mudarNumero;

                System.out.println(">>>");
                enter01 = STRING.nextLine();

            }
            case 9 -> {

                mudarNumero = gerador.nextInt((300 - 200) + 1) + 200; // Escolhe um número de 300 a 200
                mudarNumero2 = gerador.nextInt((100 - 60) + 1) + 60; // Escolhe um número de 100 a 60
                System.out.println(p1.nome + " conjurou uma magia arcana antiga com êxito máximo! Energias poderosas descem do céu, lhe abençoam e causam dano no oponente.");
                System.out.println("+" + mudarNumero2 + " de HP para " + p1.nome);
                System.out.println("+" + mudarNumero + "% de Fúria para " + p1.nome);
                System.out.println("+" + 15 + " de Magia para " + p1.nome);
                System.out.println("-" + 40 + " de HP para o Macaco");
                System.out.println("-" + 12 + " de Magia para " + p1.nome + ", por utilizar a magia 'Arcane Powers'.\n");

                p1.magia += 15;
                p1.hpComputador -= 40;
                p1.vida += mudarNumero2;
                p1.mudarFuria += mudarNumero;
                System.out.println(">>>");
                enter01 = STRING.nextLine();

            }

            case 10 -> {

                System.out.println(p1.nome + " tentou conjurar uma magia arcana antiga, mas falhou miseravelmente. ");
                System.out.println(">>>");
                enter01 = STRING.nextLine();

            }

        }

    }

    public void circleofDeath() {

        Random gerador = new Random();
        escolhaAtaque = ataqueRandom();

        switch (escolhaAtaque) {

            case 1, 2, 3, 4, 5, 6, 7 -> {

                System.out.println(p1.nome + " conseguiu realizar o ritual 'Circle of Death'. Um comissal da morte emerge do chão, e acerta um golpe utilizando uma foice, em seu oponente.");
                System.out.println("-" + 450 + " HP para o Macaco.\n");
                System.out.println("-" + 20 + " de Magia para " + p1.nome + ", por utilizar a magia 'Circle of Death'.\n");
                p1.hpComputador -= 450;
                System.out.println(">>>");
                enter01 = STRING.nextLine();

            }

            case 8, 9, 10 -> {

                System.out.println(p1.nome + " tentou realizar o ritual 'Circle of Death', porém falhou. Um comissal da morte irritado emerge do chão, e acerta um golpe em " + p1.nome + ", utilizando uma foice.");
                System.out.println("-" + 450 + " HP para " + p1.nome + ".\n");
                System.out.println("-" + 20 + " de Magia para " + p1.nome + ", por utilizar a magia 'Circle of Death'.\n");
                p1.vida -= 450;
                System.out.println(">>>");
                enter01 = STRING.nextLine();
            }

        }

    }

///COMPLEMENTOS IMPORTANTES DE JOGO///
//## SAIR DO JOGO ##//
    void exitGame() {
        Scanner STRING = new Scanner(System.in);
        String enter;

        System.out.print("\nObrigado por jogar! Como o jogo ainda está em desenvolvimento\n"
                + "Eu conto com a sua paciência, caso algo tenha dado errado.\n"
                + "Caso tenha detestado, sinta-se a vontade para não voltar mais! >>>\n");
        enter = STRING.nextLine();
        System.out.print("Feito por: Leonardo Dihl de Souza. (Com menções honrosas para: Sara Schneider, Vinícius Souza e Natã Porsch.)\nadeus.");

    }

    void endGame() {
        Scanner STRING = new Scanner(System.in);
        String enter;
        System.out.print("\nObrigado por jogar! Como o jogo ainda está em desenvolvimento\n"
                + "Eu conto com a sua paciência, caso algo tenha dado errado.\n"
                + "Caso tenha detestado, sinta-se a vontade para não voltar mais! >>>\n");
        enter = STRING.nextLine();
        System.out.print("Feito por: Leonardo Dihl de Souza. (Com menções honrosas para: Sara Schneider, Vinícius Souza e Natã Porsch.)\nadeus.");
        System.exit(0);

    }

    void resumo() {
        System.out.println("\nVocê é uma pessoa peculiar, desde criança notou ter o dom de canalizar diferentes forças.");
        System.out.println("Sendo capaz de canalizar sua própria fúria, conseguindo utilizar magia e aprendendo rápido.");
        System.out.println("Treinou por anos e anos, para poder colocar seu nome nas páginas de história.");
        System.out.println("Sem saber ao certo, qual caminho pretende seguir, seja o foco na magia ou dominar fúria.");
        System.out.println("Você decide começar a escrever sua história para valer! E se joga de coração e alma no mundo.");
        System.out.println("Seguindo um mapa que herdou de seus já falecidos pais aventureiros, você acaba se perdendo... >>>");
        enter01 = STRING.nextLine();
        menu();
    }

}
