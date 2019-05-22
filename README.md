
package pi;

import java.util.Scanner;

public class Pi {

    static void menu() {
        System.out.println("1)Intruções");
        System.out.println("2)Jogar");
        System.out.println("3)Pontos");
        System.out.println("4)Sair");                   
    }
    static void instrucao(){
        System.out.println("Você deve responder corretamente as perguntas, se aparecer game over você perde");
    }
    static void perguntas(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o nome do seu personagem ?");
        String nome;
        nome = ler.nextLine();
        System.out.println("Olá "+nome+"");
        System.out.println("Você deve escolhar uma caminho, esquerda ou direita");
        System.out.println("      |   |");
        System.out.println("      |   |");
        System.out.println("      |   |");
        System.out.println(" ------    --------");
        System.out.println(" ------    --------");
        System.out.println("Qual caminho ? pra esquerda ou direita ?");
        String caminho = ler.nextLine();
        switch(caminho){
            case "esquerda":
                System.out.println("quanto é 50-10");
                System.out.println("1) 2");
                System.out.println("2) 10");
                System.out.println("3) 18");
                System.out.println("4) 20");
                System.out.println("5) 6");
                int alternativa1 = ler.nextInt();
                if(alternativa1 == 30){
                    System.out.println("Parabéns "+nome);
                    int ponto = 2;
                    pontos(ponto);
                    System.out.println("Você tem "+ponto);
                    System.out.println("Agora vamos para a próxima pergunta");
                    System.out.println("quanto é 44+6");
                    System.out.println("1) 2");
                    System.out.println("2) 10");
                    System.out.println("3) 18");
                    System.out.println("4) 50");
                    System.out.println("5) 6");
                    int alternativa2 = ler.nextInt();
                    
                }else
                    System.out.println("GAME OVER");
                break;
            case "direita":
                System.out.println("quanto é 40-40");
                System.out.println("1) 0");
                System.out.println("2) 10");
                System.out.println("3) 18");
                System.out.println("4) 20");
                System.out.println("5) 6");
                break;
        }           
   
    }
    static int pontos(int ponto){
        System.out.println("Você ganhou 2 pontos");
        return ponto;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem vindo ao Quiz Matématico");
        System.out.println("Neste jogo você ira responder uma série de perguntas");
        menu();
        System.out.println("Escolha uma opção");
        int opcao = ler.nextInt();             
        if(opcao == 1){
            instrucao();
            menu();
            System.out.println("Escolha uma opção sem ser a 1");
            int opcao2 = ler.nextInt();
            if(opcao2 == 2){
                perguntas();                
            }else if(opcao2 == 3){
                System.out.println("Você ainda não tem pontos");
                menu();
                
            }            
        }else if(opcao == 2){
            perguntas();
        }else if(opcao == 3){
            System.out.println("Você ainda não tem pontos");
        }
        
    }
    
}
