
package vetor1;

import java.util.Scanner;

public class vetor6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetorA = new int [10];
        int[] vetorB = new int [vetorA.length];
        int[] vetorC = new int [vetorA.length];
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("[" +i+ "]:");
            vetorA[i] = ler.nextInt();               
        }
        for(int i = 0; i < vetorB.length; i++){
            System.out.print("[" +i+ "]:");
            vetorB[i] = ler.nextInt();               
        }
        for(int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        System.out.print("vetor A = ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i]+ " ");  
        }
        System.out.println("");
        
        System.out.print("vetor B = ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.print(vetorB[i]+ " ");          
        }
        System.out.println("");  
        
       System.out.print("vetor C = ");
        for(int i = 0; i<vetorC.length; i++){
            System.out.print(vetorC[i]+ " ");  
        }
        System.out.println("");
                          
         
    }
    
}
