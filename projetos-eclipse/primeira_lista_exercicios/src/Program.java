import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int soma = num1 + num2;
		
		System.out.println("ENTRADA: ");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("SAÍDA:\nSOMA = " + soma);
		
		sc.close();
	}
	
}
