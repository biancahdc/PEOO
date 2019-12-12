import java.util.Scanner;

public class Q13 {

	public static int somaDiag(int[][] matriz) {

		int soma = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");

				if(i < j) {
					soma += matriz[i][j];
				}
			}

			System.out.println("");
		}

		System.out.println("A soma dos elementos acima da diagonal principal é: " + soma);

		return soma;
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a ordem da matriz:");
		int tam = leia.nextInt();

		int[][] matriz = new int[tam][tam];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Digite o que você quer digitar na posição " + i + "." + j);
				matriz[i][j] = leia.nextInt();
			}
		}

		somaDiag(matriz);

	}

}
