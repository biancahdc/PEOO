import java.util.Scanner;

public class Q5 {
	public static boolean divi(double num) {
		int cont = 0;

		for (int i = 1; i <= num; i++) {
			if(num % i == 0){
				cont++;
			}
		}
		if(cont == 2) {
			System.out.println("Esse n�mero � primo");
			return true;
		}else {
			System.out.println("Esse n�mero n�o � primo");
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero positivo:");
		double num = leia.nextDouble();

		divi(num);
	}

}
