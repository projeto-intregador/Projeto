
package projetofinal;

import java.util.Random;
import java.util.Scanner;

public class ProjetoFinal {
    /*
    * função que executa o menu    
    */
    static void menu() {       
    System.out.println("1)Objetivo");
    System.out.println("2)Jogar");
    System.out.println("3)Pontos");
    System.out.println("4)Sair");                   
}    
    /*
    * função que motra a instrução    
    */
    static void instrucao(){       
        System.out.println("Você deve responder corretamente as perguntas, se aparecer GAME OVER na tela você perde, conforme avança as perguntas ficam mais complicadas");
        System.out.println("Terá perguntas que você precisara de sorte, outras raciocínio lógico, pense muito bem antes de responder");
}
    /*
    * função para a proxima etapa   
    */   
    static void proximaEtapa(){        
        System.out.println("Agora vamos para a próxima pergunta");
        System.out.println("");
        System.out.println("____________________________________");
        System.out.println("");
}
    /*
    * função para os creditos finais na vitoria   
    */
    static void creditosFinal(){
        System.out.println("Você acumulou 10 pontos você ganhou 10 MILHÃOES DE REAIS");
        System.out.println("e se provou ser muito inteligênte");
        System.out.println("PARABÉNS espero ver você de novo");
        System.out.println("JOGO FEITO POR: Thiago Costa, Juliany Brigante, Lorraine Mendonça e Gabriel Henrique");        
    }
    /*
    * função para os creditos finais na derrota   
    */
    static void creditosDerrota(){
        System.out.println("Tente de novo");
        System.out.println("JOGO FEITO POR: Thiago Costa, Juliany Brigante, Lorraine Mendonça e Gabriel Henrique"); 
    }
    /*
    * inicio do jogo 
    */
static void inicio(){
    Scanner ler = new Scanner(System.in);
    System.out.println("Qual o nome do seu personagem ?");
    String nome;
    nome = ler.nextLine();
    System.out.println("Sua mãe: Olá "+nome);
    System.out.println("Sua mãe: Como foi seu dia na escola ? ");  
    String dia = ler.nextLine();
    System.out.println("Sua mãe: Ah entendi, tem uma coisa pra você no seu quarto");
    System.out.println("Mas o que é isso ?");
    System.out.println(".");
    System.out.println(".");
    System.out.println(".");   
    System.out.println("Uma carta ");
    System.out.println("________________________________________");
    System.out.println("| Olá "+nome+" nós do Quiz matematico   | ");
    System.out.println("| convidamos você para participar       | ");
    System.out.println("| do Quiz matématico você irá responder | ");
    System.out.println("| perguntas e terá que provar a sua     | ");
    System.out.println("| sua inteligencia se você deseja       | ");
    System.out.println("| participar o número da rua é 62+41    | ");
    System.out.println("| o resultado da soma é o número da rua | ");
    System.out.println("| acerte o número, nos vemos lá, tchau  | ");
    System.out.println("|_______________________________________|");
    System.out.println(nome+ ": Mãe preciso sair ");
    System.out.println("Sua mãe: Por que ?");
    String motivo = ler.nextLine();
    System.out.println("Sua mãe: ok");
    System.out.println("Agora você está na rua ");
    System.out.println("Você deve escolher o caminho até chegar no lugar certo");
    System.out.println("Digite o número da rua ou continuar ");
    System.out.println("AVISO: Se digitar o número errado irá perder ");
    System.out.println(".");
    System.out.println(".");
    System.out.println(".");  
    System.out.println("       |            |         ");
    System.out.println("_______|            |__________"); 
    System.out.println("Rua                        Rua ");
    System.out.println("103                       107  ");
    System.out.println("_______________________________"); 
    System.out.println(" ");
    System.out.println("Digite o número da rua");
    String nomeRua2 = ler.nextLine();      
    switch(nomeRua2){    
    /*
    * Decisão na rua 
    */        
        case"107":            
            System.out.println("Está rua não é a do programa Quiz matématico");
            System.out.println("GAME OVER");
            creditosDerrota();
            break;
        case"103":   
            System.out.println("CAMINHO CERTO, PARABÉNS");
            perguntas();
            break;
            default:
            System.out.println("Rua invalida");
             creditosDerrota();
     }          
       
}
    /*
    * Escolha de porta 
    */
static int porta(){
    Scanner ler = new Scanner(System.in);
    System.out.println("____________    ____________        ");
    System.out.println("|          |    |          |        ");
    System.out.println("|          |    |          |        ");
    System.out.println("|          |    |          |        ");
    System.out.println("|    1     |    |     2    |        ");
    System.out.println("|          |    |          |        ");
    System.out.println("|          |    |          |        ");
    System.out.println("|          |    |          |        ");
    System.out.println("|__________|    |__________|        "); 
    System.out.println("Escolha uma porta ");
    System.out.println("Cada porta leva para perguntas diferentes ");
    int portas = ler.nextInt();
    return portas;
}
    /*
    * Todas as perguntas 
    */
static void perguntas(){
    Scanner ler = new Scanner(System.in); 
    Random random = new Random();
    /*
    * porta 1 pergunta 1
    */    
    System.out.println("Olá você está no Quiz matématico agora");
    int porta = porta();      
    if(porta == 1){
    int vetor [] = new int [10];   
    System.out.println("Informe valores para este vetor de 10 posições");   
    for(int i = 0; i < vetor.length; i++){    
        System.out.print("["+i+"]:");
        vetor[i] = ler.nextInt();          
        }
        int soma = 0;
        for(int i = 0; i < vetor.length; i++){
            soma = soma + vetor[i];
        }
        System.out.println("Qual é a soma total dos valores do vetor ? ");
        int porta1questao1 = ler.nextInt();            
        if(porta1questao1 == soma){
            System.out.println("Parabéns você acertou a soma é "+soma);
            int ponto = 2;
            pontos(ponto);
                System.out.println("Você tem "+ponto+ " pontos");
                proximaEtapa(); 
                /*
                * porta 1 pergunta 2
                */  
                System.out.println("AVISO: Responda com o número da alternativa");
                System.out.println("Alguns meses tem 30 dias, outros tem 31,quantos meses tem 28 dias ?");
                System.out.println("1) Os 12 Meses tem 28 dias");
                System.out.println("2) 8 meses tem 28 dias");
                System.out.println("3) 6 meses tem 28 dias");
                System.out.println("4) 4 meses tem 28 dias");
                int porta1questao2 = ler.nextInt();
                if(porta1questao2 == 1){
                    System.out.println("Parabéns ");
                    pontos(ponto);
                    ponto = 4;
                    System.out.println("Você tem "+ponto+ " pontos agora");
                    proximaEtapa(); 
                    /*
                    * porta 1 pergunta 3
                    */  
                    int a = 98;
                    int b = 0;
                    while(b <= 10){                                                
                    int c = a*b;
                    System.out.println("Tabuada "+a+" X "+b+" = "+c);          
                    b++;
                }
                System.out.println("Qual é o proximo valor da tabuada ?");
                int porta1questao3 = ler.nextInt();
                if(porta1questao3 == 1078){
                    System.out.println("Parabéns você avançou para uma próxima etapa");  
                    pontos(ponto);
                    ponto = 6;
                    System.out.println("Você tem "+ponto+ " pontos agora");
                    proximaEtapa();
                    /*
                    * porta 1 pergunta 4
                    */  
                    System.out.println("AVISO: Responda com o número da alternativa");
                    System.out.println("25-[10+(7-4)]");
                    System.out.println("1) -12");
                    System.out.println("2) 13");
                    System.out.println("3) 15");
                    System.out.println("4) Nenhuma está certa");
                    int porta1questao4 = ler.nextInt();
                    if(porta1questao4 == 4){
                    pontos(ponto);
                    ponto = 8;
                    System.out.println("Você tem "+ponto+ " pontos agora");  
                    proximaEtapa();
                    /*
                    * porta 1 pergunta 5
                    */  
                    System.out.println("O MAIOR DESAFIO é esse");
                    System.out.println("Você devera acertar um número aleatorio, você tem 10 chutes para fazer");
                    System.out.println("AVISO: o número está entre 0 e 200");
                    boolean acertou = false;
                    int tentativas = 10;
                    int numeroSecreto = random.nextInt(200);
                    long chute = 0;
                    while(tentativas > 0 && acertou == false){
                        System.out.println("Qual o chute?");
                        chute = ler.nextLong();
                        if(numeroSecreto == chute){
                            System.out.println("VOCÊ ACERTOU");                           
                            creditosFinal();
                            acertou = true;
                        }else if(chute < numeroSecreto){
                            --tentativas;
                            System.out.println("Número muito pequeno "+tentativas+" tentativas restantes");
                        }else{  
                            --tentativas;                        
                           System.out.println("Número muito grande "+tentativas+" tentativas restantes");
                        }
                    }
                    }else{
                        System.out.println("GAME OVER");
                        creditosDerrota();
                    }
                  }else{
                      System.out.println("GAME OVER");
                      creditosDerrota();
                }
                }else{
                    System.out.println("GAME OVER");
                    creditosDerrota();
                }                
            }else{
            System.out.println("GAME OVER");
            creditosDerrota();
        }
                
                
        }                                     
            else{
            /*
            * porta 2 pergunta 1
            */ 
            System.out.println("AVISO: Responda com o número da alternativa");
            System.out.println("Qual o resultado de 100 elevado a 0 ?");
            System.out.println("1) 100");
            System.out.println("2) 0");
            System.out.println("3) 1");
            System.out.println("4) -100");
            System.out.println("5) Nenhuma das anteriores");
            int porta2questao1 = ler.nextInt();
            if(porta2questao1 == 3){
                System.out.println("Parabéns ");
                int ponto = 2;
                pontos(ponto);              
                System.out.println("Você tem "+ponto+ " pontos");
                proximaEtapa();
                /*
                * porta 2 pergunta 2
                */ 
                    int a = 58;
                    int b = 0;
                    while(b <= 10){                                                
                    int c = a*b;
                    System.out.println("Tabuada "+a+" X "+b+" = "+c);          
                    b++;
                }
                System.out.println("Qual é o proximo valor da tabuada ?");
                int porta2questao2 = ler.nextInt();
                if(porta2questao2 == 638){                  
                    System.out.println("Parabéns você avançou para uma próxima etapa");
                    ponto = 4;
                    pontos(ponto);
                    System.out.println("Você tem "+ponto+ " pontos agora");
                    proximaEtapa();
                    /*
                    * porta 2 pergunta 3
                    */ 
                    System.out.println("AVISO: Responda com o número da alternativa");
                    System.out.println("50-[37-(15-8)]");
                    System.out.println("1) 0");
                    System.out.println("2) 10");
                    System.out.println("3) 18");
                    System.out.println("4) 20");
                    System.out.println("5) 6"); 
                    int porta2questao3 = ler.nextInt();
                    if(porta2questao3 == 5){
                        System.out.println("Parabéns você avançou para uma próxima etapa");
                        ponto = 6;
                        pontos(ponto);
                        System.out.println("Você tem "+ponto+" pontos agora");
                        proximaEtapa();
                        /*
                        * porta 2 pergunta 4
                        */ 
                        System.out.println("Quantos segundos tem um dia ? ");
                        int porta2questao4 = ler.nextInt();
                        if(porta2questao4 == 86400){      
                        System.out.println("Parabéns você avançou para uma próxima etapa");
                        ponto = 8;
                        pontos(ponto);
                        System.out.println("Você tem "+ponto+ " pontos agora");
                        proximaEtapa();
                        /*
                        * porta 2 pergunta 5
                        */ 
                        System.out.println("O MAIOR DESAFIO é esse");                       
                        System.out.println("Você devera acertar um número aleatorio, você tem 10 chutes para fazer");
                        System.out.println("AVISO: o número está entre 0 e 200");
                        boolean acertou = false;
                        int tentativas = 10;
                        int numeroSecreto = random.nextInt(200);
                        long chute = 0;
                        while(tentativas > 0 && acertou == false){
                        System.out.println("Qual o chute?");
                        chute = ler.nextLong();
                        if(numeroSecreto == chute){
                            System.out.println("VOCÊ ACERTOU");
                            acertou = true;
                            creditosFinal();
                        }else if(chute < numeroSecreto){
                            --tentativas;
                            System.out.println("Número muito pequeno "+tentativas+" tentativas restantes");
                        }else{  
                            --tentativas;                        
                           System.out.println("Número muito grande "+tentativas+" tentativas restantes");
                        }
                        }   
                    }else{
                            System.out.println("GAME OVER");
                            creditosDerrota();
                        }
                    }else{
                        System.out.println("GAME OVER");
                        creditosDerrota();
                    }                  
                }else{
                    System.out.println("GAME OVER");
                    creditosDerrota();
                }
            }else{
                System.out.println("GAME OVER");
                creditosDerrota();
            }
            
    }           
}
/*
* pontos
*/
static int pontos(int ponto){
    System.out.println("Você ganhou 2 pontos");
    ponto = 2;
    return ponto;
}
/*
* main
*/
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);            
    System.out.println("BEM VINDO ao Quiz Matématico");
    System.out.println("Neste jogo você tera uma série de desafio envolvendo matématica ");
    System.out.println("Você tera que provar que é inteligente, você seguira um caminho muito difícil");
    System.out.println("tera que fazer algumas escolhas e se acertar todas as perguntas, ira se provar um gênio");
    menu();
    System.out.println("Escolha uma opção");
    int opcao = ler.nextInt();             
    if(opcao == 1){
        instrucao();   
        System.out.println("Escolha uma opção sem ser a 1");
        menu();
        int opcao2 = ler.nextInt();
        if(opcao2 == 2){
            inicio();                
        }else if(opcao2 == 3){
            System.out.println("Você ainda não tem pontos");
            System.out.println("Escolha uma opção sem ser a 3 ou 1");
            menu();  
            int opcao5 = ler.nextInt();
            if(opcao5 == 2){
                inicio();
            }
        }            
    }else if(opcao == 2){
        inicio();
    }else if(opcao == 3){
        System.out.println("Você ainda não tem pontos");
        System.out.println("Escolha uma opção sem ser a 3");
        menu();
        int opcao3 = ler.nextInt();
        if(opcao3 == 1){
            instrucao();
            System.out.println("Ecolha uma opção sem ser a 1 ou 3");
            menu();
            int opcao4 = ler.nextInt();
            if(opcao4 == 2){
            inicio();
        }
        }else{
            inicio();
        }
        
        if(opcao == 2){
            inicio();
        }
    }
    
}
}  