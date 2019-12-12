import java.util.Scanner;

public class Q14 {

	public static double[] print(double[][] matriz, int num) {
		Scanner leia = new Scanner(System.in);

		double[] vetor = new double[matriz.length];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i == num) {
					vetor[j] = matriz[i][j];
					System.out.print(vetor[j] + " | ");
				}
			}
		}
		return vetor;
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a ordem da matriz:");
		int tam = leia.nextInt();

		double[][] matriz = new double[tam][tam];

		System.out.println("Digite um número inteiro positivo entre 0 e o número da ordem da matriz:");
		int num = leia.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Digite algo para a linha " + i + " e coluna " + j);
				matriz[i][j] = leia.nextDouble();
			}
		}
		
		print(matriz,num);
	}

}
