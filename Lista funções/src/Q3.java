import java.util.Scanner;

public class Q3 {

	public static double area(double raio) {
		return Math.PI*Math.pow(raio, 2);
	}
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o raio do c�rculo");
		double raio = leia.nextDouble();
		
		System.out.println("A �rea do c�rculo �: " + area(raio));

	}

}
