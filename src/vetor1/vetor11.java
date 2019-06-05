
package vetor1;

import java.util.Scanner;

public class vetor11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [10];
        for(int i = 0; i<vetorA.length; i++){
            System.out.print("[" +i+ "]:");
            vetorA[i] = ler.nextInt();
        }
        int cont = 0;
        for(int i = 0; i<vetorA.length; i++){
            if(vetorA[i] % 2 == 0){
                cont++;
            }
        }
        System.out.print("vetor A = ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i]+ " ");  
        }
        System.out.println("");
            
            System.out.println("Quantidade de números pares "+cont);
        
    }
    
}
