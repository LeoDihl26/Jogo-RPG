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
>(1) | Mago\n"  
>(2) | Guerreiro\n\n"); 

Após dar um nome e uma classe ao seu personagem, você irá receber e ver seus atributos respectivos a classe escolhida. EXEMPLO:

#### -> Classe: Mago  
#### -> Nome: Leonardo  
#### -> Vida: 80  
#### -> Força: 6      
#### -> Magia: 8  
#### -> Furia: 0  

Prosseguindo, o jogo irá desenvolver uma curta e simples história, com pequenos diálogos, até o fim do código. Algumas decisões impactam diretamente na história e nos atributos do seu personagem. EXEMPLO: 
>                (1)                            (2)            
>     |    PLACA DA ESQUERDA    |   |     PLACA DA DIREITA     |
>     | Caminho mais rápido até |   | Caminho turbulento até a |
>     | Kymera Kingdom. Calmo   |   | cidade de Kymera Kingdom |
>     | sereno, se escutam sons |   | Não recomendado para os  |
>     | angelicais no caminho.  |   | fracos de coração.       |

Dependendo do número que você escolher, irá aparecer o seguinte status.
>1  
>
>Vida atual: 110

>2
>  
>wizard usou Poção de Cura.  
>Vida atual: 120

_( A **Mana** aumenta 10 de vida. )_  
_( A **Cura** aumenta 20 de vida. )_

Após isso, o código entrará na seleção de escolher poderes e mostrará os poderes disponíveis para uso, EXEMPLO:
>Escolha um poder para usar:  
>Poderes de wizard:
> 
>0. Bola de Fogo
>1. Raio
>2. Escudo Mágico
>3. Teleporte

Dependendo do poder que você escolher, mostrará na tela, que o poder escolhido foi usado. EXEMPLO:  
>Teleporte foi usado!

Assim, encerrando nosso código.

# Estrutura do Projeto 
O projeto é composto pelas seguintes classes:  

```Game1```: Classe principal onde a execução do programa começará.

---
```Poder```:  esta classe possui uma variável de instância privada 'nome', um construtor que inicializa esta variável, um método 'usar', que imprime uma mensagem na tela e um método getter getNome que permite acesso externo à 'nomevariável'.  

---
```Mago```: Mago é uma subclasse de Personagem, O construtor Mago inicializa um mago com um nome e quantidade de vida específicos, além de inicializar suas listas de inventário e poderes como listas vazias. Após isso, chama o método salvar() para salvar o mago no banco de dados.  

---
```Item```: Esta classe possui duas variáveis ​​de instância privadas nome e efeito, um construtor que inicializa essas variáveis, e dois métodos getter, getNome e getEfeito. Que permitem acesso externo a essas 
variáveis.  

---
```Conexão```:  Serve para fazer a conexão do java com a tabela criada no MySQLworkbanch.  

---
```Personagem```: Responsável por inicializar um objeto Personagem com um nome e um valor de vida especificados.  

# Pré-requisitos  
Java 8 ou superior  
MySQL  
Conector JDBC para MySQL  


# Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.  

# Licença  
Este projeto está licenciado sob a MIT License.  

# Contato

Autor: Vinícius Souza da Silva  
E-mail: vinicius.s.silveira.2015@gmail.com
