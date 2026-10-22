import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int cod1 = sc.nextInt();
		int numPecas1 = sc.nextInt();
		double valorUnit1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int numPecas2 = sc.nextInt();
		double valorUnit2 = sc.nextDouble();
		
		double valorPagar1 = valorUnit1 * numPecas1;
		double valorPagar2 = valorUnit2 * numPecas2;
		double valorTotal = valorPagar1 + valorPagar2;
		
		System.out.printf(Locale.US, "VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		sc.close();
	}

}
