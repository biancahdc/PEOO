import java.util.Scanner;

public class Q15 {

	public static String[] String(String[][] matriz) {

		String[] vetor = new String[3];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i == j) {
					for (int j2 = 0; j2 < vetor.length; j2++) {
						if(vetor[j2] == null) {
							vetor[j2] = matriz[i][j];
							break;
						}
					}
				}
			}
		}

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " | ");
		}

		return vetor;

	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String[][] matriz = new String[3][3];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Digite o que você quer digitar na posição " + i + "." + j);
				matriz[i][j] = leia.next();
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}

			System.out.println("");
		}
		
		String(matriz);
	}

}
