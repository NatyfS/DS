import java.util.Scanner;
public class Preco {
	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 double precop, porcep, pm;
		 char op;
		
		 do {
			 System.out.println("Digite o preço do produto: ");
			 precop = leia.nextDouble();
			 
			 System.out.println("Escreva a margem do lucro: ");
			 porcep = leia.nextDouble();
			 porcep = (porcep/100) * precop;
			 pm = precop + porcep;
			 
			 System.out.println(" O preço do produto é:" + pm );
			 
			 System.out.println("Deseja continuar?S/N");
			 op = leia.next().charAt(0);
			 
		 }while (op == 'S');
		 leia.close();
	}
	
}
