import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int num = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		double valorHora = sc.nextDouble();
		
		double calculoSalario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f%n", calculoSalario);
		
		sc.close();
		
	}

}
