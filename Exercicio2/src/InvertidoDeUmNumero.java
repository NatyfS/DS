import java.util.Scanner;
public class InvertidoDeUmNumero {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o numero de 3 algarismos:");
		
		int numInverte = 498;
		int numInvertido = 0;
		
		while (numInverte >0) {
			numInvertido = numInvertido * 10;
			numInvertido = numInvertido + (numInverte % 10);
			numInverte = numInverte /10;
		}
		System.out.println(numInvertido);
				
	}
}

