import java.util.Scanner;

public class Q12 {

	public static int maior(int matriz[][]) {

		int maior = Integer.MIN_VALUE;


		for (int k = 0; k < matriz.length; k++) {
			for (int k2 = 0; k2 < matriz.length; k2++) {
				if(matriz[k][k2] > maior) {
					maior = matriz[k][k2];
				}
			}
		}

		System.out.println("O maior num da matriz é: " + maior);
		return maior;
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a quantidade de linhas");
		int linhas = leia.nextInt();

		System.out.println("Digite a quantidade de colunas");
		int colunas = leia.nextInt();

		int[][] matriz = new int[linhas][colunas];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Digite um número que vai ficar na linha " + i + " e coluna " + j);
				matriz[i][j] = leia.nextInt();
			}
		}

		maior(matriz);

	}

}
