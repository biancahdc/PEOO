import java.util.Scanner;

public class Q4 {

	public static double divi(double num) {
		int cont = 0;

		for (int i = 1; i <= num; i++) {
			if(num % i == 0){
				cont++;
			}
		}
		return cont;
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero positivo:");
		double num = leia.nextDouble();
		
		System.out.println("Esse n�mero tem " + divi(num) + " divisores");
	}

}
