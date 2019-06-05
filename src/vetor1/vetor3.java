
package vetor1;

import java.util.Scanner;

public class vetor3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);          
        int [] vetorA = new int [15];
        int [] vetorB = new int [vetorA.length];
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("[" +i+ "]: ");
            vetorA[i] = ler.nextInt();
            vetorB[i] = vetorA[i]*vetorA[i];
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
            
        
    }
}
