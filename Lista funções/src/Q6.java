import java.util.Scanner;

public class Q6 {
	
	public static int fatorial(int num) {
		int i = num;
		int fator = 1;
		
		System.out.println("Calculando " + num + "!");
		
		while(i > 0) {
			fator *= i;
			i--;
		}
		System.out.println("O fatorial de " + num + " é " + fator);
		
		return fator;
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = leia.nextInt();

		fatorial(num);
	}

}
