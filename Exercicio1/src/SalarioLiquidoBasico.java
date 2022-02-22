import java.util.Scanner;
public class SalarioLiquidoBasico {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float hora, d, s;
		int aulas;
		
		
		System.out.println("Digite o valor da hora aula: ");
		hora = leia.nextFloat();
		
		System.out.println("Digite a quantidade de aulas dadas: ");
		aulas = leia.nextInt();
		
		System.out.println("Digite o desconto:");
		d = leia.nextFloat();
		
		s = hora*aulas;
		s = s-(s/100*d);
		
		System.out.println(s);
		
	}
}
