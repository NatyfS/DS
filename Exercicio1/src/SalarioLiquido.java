import java.util.Scanner;
public class SalarioLiquido {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int aula;
		double desconto, salario;
		float hora;
		
		System.out.println("Digite o valor da hora aula:");
		hora = leia.nextFloat();
		System.out.println("Digite a quantidade de aulas dadas: ");
		
		aula = leia.nextInt();
		salario = hora*aula;
		
		if(salario<=1212.00) {
			desconto = 7.5;
		}else if(salario >=1212.01 && salario <=2427.35) {
			desconto = 9;
		}else if(salario >=2427.36 && salario <=3641.03) {
			desconto = 12;
		}else if(salario >=3641.04 && salario <=7087.22) {
			desconto = 14;
		}else if(salario >=7087.23 && salario <=12136.79) {
			desconto = 14.5;
		}else if(salario >=12136.80 && salario <=24273.57) {
			desconto = 16.5;
		}else if(salario >=24273.58 && salario <=47333.46) {
			desconto = 19;
		}else {
			desconto= 22;
		}
		salario = salario-(salario/100*desconto);
		System.out.println("O valor do sálario líquido é de: " +salario);
	
	}
}
