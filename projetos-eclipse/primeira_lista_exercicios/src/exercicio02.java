import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double area = 3.14159 * (Math.pow(raio, 2));
		
		System.out.println("ENTRADA: ");
		System.out.println(raio);
		System.out.println("SAÍDA: ");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", area);
		
		sc.close();
		
	}

}
