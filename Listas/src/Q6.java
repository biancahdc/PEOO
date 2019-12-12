import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int num = leia.nextInt();
		
		int i = num;
		int fator = 1;
		
		System.out.println("Calculando " + num + "!");
		
		do {
			fator = fator * i;
			i--;
		} 
		while(i > 0);
		System.out.println("O fatorial de " + num + " é " + fator);

	}

}
