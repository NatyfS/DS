import java.util.Scanner;
public class SomaDeAeB {
	 public static void main (String [] args){
	        Scanner leia = new Scanner(System.in);
	        final int TAM = 10;
	        int  a[], b[], c[], i;
	        
	        a = new int [TAM];
	        b = new int [TAM];
	        c = new int [TAM];
	        
	        for (i=0; i<TAM; i++){
	            System.out.println("Digite o valor do vetor A" + " ["+i+"]");
	            a[i] = leia.nextInt();
	        }
	        
	         for (i=0; i<TAM; i++){
	        	 System.out.println("Digite o valor do vetor B" + " ["+i+"]");
	            b[i] = leia.nextInt();
	        }
	        
	        for (i=0; i<TAM; i++) {
	        System.out.print("C= ");
	            c[i] = a[i] + b[i];
	        System.out.print(c[i]+ " ");
	          }
	   }
}
	   

