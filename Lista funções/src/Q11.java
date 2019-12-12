import java.util.Scanner;

public class Q11 {

	public static String[][] print(String matriz[][]) {
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
		return matriz;
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número de linhas");
		int linha = leia.nextInt();
		System.out.println("Digite o número de colunas");
		int coluna = leia.nextInt();

		String[][] matriz = new String[linha][coluna];

		for (int i = 0; i < matriz.length; i++) {
			for (int k = 0; k < matriz.length; k++) {
				System.out.println("Digite o que você quer armazenar na matriz");
				matriz[i][k] = leia.next();
			}
		}
		
		print(matriz);
	}

}
