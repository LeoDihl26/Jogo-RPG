# Jogo RPG
Este é um projeto de um jogo simples em Java, utilizando Orientados a Objetos.

## Descrição Do Jogo 
O jogo se situa em "Kymera Kingdom", com o jogador podendo escolher seu nome logo no início, assim como sua classe (mago ou guerreiro), cada uma possuindo atributos, cujo valor varia de classe para classe.
- Vida.  
- Força.  
- Magia.  
- Fúria. 


## Iniciando O Jogo
Ao iniciar o jogo, você verá as seguintes opções:
>¨¨¨¨Kymera Kingdom: O Início da jornada.¨¨¨¨  
>
>Sempre que ler '>>>' aperte 'enter' para prosseguir.
>
>Qual o seu nome?
>
>Qual classe deseja escolher?
>  
>(1) | Mago    
>(2) | Guerreiro

Após dar um nome e uma classe ao seu personagem, você irá receber e ver seus atributos respectivos a classe escolhida.      
EXEMPLO:

#### -> Classe: Mago  
#### -> Nome: Leonardo  
#### -> Vida: 80  
#### -> Força: 6      
#### -> Magia: 8  
#### -> Furia: 0  

Prosseguindo, o jogo irá desenvolver uma curta e simples história, com pequenos diálogos, até o fim do código. Algumas decisões impactam diretamente na história e nos atributos do seu personagem.     
EXEMPLO: 

                (1)                            (2)            
     |    PLACA DA ESQUERDA    |   |     PLACA DA DIREITA     |
     | Caminho mais rápido até |   | Caminho turbulento até a |
     | Kymera Kingdom. Calmo   |   | cidade de Kymera Kingdom |
     | sereno, se escutam sons |   | Não recomendado para os  |
     | angelicais no caminho.  |   | fracos de coração.       |

Dependendo do caminho que você escolher (digitando o nº da placa), você irá obter uma sequência diferente de diálogos, interagindo com personagens diferentes e que no final, irão aumentar ou diminuir alguns dos atributos.     
> ## Placa 1  
> ###### EXEMPLO DE DIÁLOGO:  
> "Dumble Porta: Entendo...EXPELIANUS!!! (Dumble Porta lança um feitiço em você.)"
> 
> ###### EXEMPLO DE MUDANÇA DE ATRIBUTOS:  
> "+ 3 de Magia"       
> "+ 15 de HP"

> ## Placa 2  
> ###### EXEMPLO DE DIÁLOGO:  
> "Bruxa Carcomida: AZARATH... METRION... ZINTHOS!"
> 
> ###### EXEMPLO DE MUDANÇA DE ATRIBUTOS:  
> "- 20 de HP"       
> "+ 40% de Fúria"

## Começando A Batalha
Após chegar ao fim do caminho escolhido, você irá poder conferir seus Status Atuais ou seguir para a o evento de Luta:

        (1) | Explorar a Cidade 
        (2) | Ver Status
        
Escolhendo "Explorar a Cidade", uma nova sequência de diálogos irão aparecer, e você será direcionado para o início da luta. EXEMPLO DE UM DOS MENUS:

        ("(1) - Ataques Básicos");
        ("(2) - Golpes de Furia");   
        ("(3) - Feitiços");    

Cada uma dessas escolhas abre um menu diferente, com diferentes opções de golpes. Alguns de aumento próprio de atributos, ou formas diferentes de causar dano no oponente.

        MENU: ATAQUES BÁSICOS                  MENU: GOLPES DE FÚRIA                 MENU: FEITIÇOS                            
        ("(1) - Sequência de Golpes ");        ("(1) - Berserker ");                 ("(1) - Desintegrate ");      
        ("(2) - Diable Jambe ");               ("(2) - Fury Of Titans ");            ("(2) - Healing ");                
        ("(3) - Concentração ");               ("(3) - Twinsanity ");                ("(3) - Full Healing ");            
        ("(4) - Descrições de cada Ataque");   ("(4) - Descrições de cada Ataque");  ("(4) - Arcane Powers ");                
        ("(5) - Status Gerais de (nome)");     ("(5) - Status Gerais de (nome)");    ("(5) - Circle of Death ");               
                                                                                     ("(6) - Descrições de cada Ataque "); 
                                                                                     ("(7) - Status Gerais de (nome)");     
# Estrutura do Projeto #
O projeto é composto pelas seguintes classes:  

```RpgProject```: É a classe principal onde a execução do programa começa.

---
```Personagem```: Esta classe possui a grande maioria das variáveis e alguns métodos que serão usadas na classe 'Aventura', onde a principal parte do código acontece  

---
```Player1```: Classe que funciona como um constructor, e irá mostrar as estatísticas iniciais do personagem, logo após a escolha entre as classes. 

---
```Inventário```: Não implementada ainda. Irá conter e guardar os itens que serão usados ao longo do código e da luta. 

---
```Conexão```:  Serve para fazer a conexão do java com quaisquer tabelas criadas no banco de dados.  

---
```Aventura```: Classe onde acontecem todos os diálogos. É onde acontece a batalha e também onde estão diversos métodos, relacionados ao próprio sistema de batalha.

# Pré-requisitos  
Java 8 ou superior  
MySQL  
Conector JDBC para MySQL  


# Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.  

# Licença  
Este projeto está licenciado sob a MIT License.  

# Contato

Autor: Leonardo Dihl de Souza  
E-mail: leodihl@gmail.com
Telefone: (51) 992416676
