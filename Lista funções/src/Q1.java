import java.util.Scanner;
public class Q1 {

	static double soma(double num1, double num2 ) {
		return num1 + num2;
	}

	static double sub(double num1, double num2){
		return num1-num2;
	}

	static double multi(double num1, double num2) {
		return num1*num2;
	}

	static double divi(double num1, double num2) {
		return num1/num2;
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		double num1 = leia.nextDouble();
		System.out.println("Digite um n�mero: ");
		double num2 = leia.nextDouble();

		System.out.println("A soma dos n�meros �: " + soma(num1, num2));
		System.out.println("A subtra��o dos n�meros �: " + sub(num1, num2));
		System.out.println("A multiplica��o dos n�meros �: " + multi(num1, num2));
		System.out.println("A divis�o dos n�meros �: " + divi(num1, num2));
	}

}
