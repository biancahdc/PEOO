import java.util.Scanner;

public class Q2 {

	public static double peri(double raio) {
		return 2*Math.PI*raio;
	}
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o raio do c�rculo");
		double raio = leia.nextDouble();
		
		System.out.println("O per�metro do c�rculo �: " + peri(raio));
	}

}
