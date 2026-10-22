import java.util.Scanner;
import java.util.Locale;

public class exercicio_06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double areaTrianguloRetangulo = a * c;
		double areaCirculo = 3.14159 * Math.pow(c, 2);
		double areaTrapezio = ((a + b) * c) / 2;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;
		
		System.out.printf(Locale.US, "TRIANGULO: %.3f%n", areaTrianguloRetangulo);
		System.out.printf(Locale.US, "CIRCULO: %.3f%n", areaCirculo);
		System.out.printf(Locale.US, "TRAPEZUI: %.3f%n", areaTrapezio);
		System.out.printf(Locale.US, "QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf(Locale.US, "RETANGULO: %.3f%n", areaRetangulo);
		
		
		sc.close();
	}
}
