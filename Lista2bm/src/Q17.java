import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] a1 = new int[30];
		int[] a2 = new int[30];
		int[] intersecao = new int[30];

		for (int i = 0; i < a1.length; i++) {
			System.out.println("Digite os valores do primeiro vetor:");
			a1[i] = leia.nextInt();
		}

		for (int i = 0; i < a2.length; i++) {
			System.out.println("Digite os valores do segundo vetor:");
			a2[i] = leia.nextInt();
		}

		for (int i = 0; i < intersecao.length; i++) {
			if(a1[i] == a2[i]){
				intersecao[i] = a1[i];
			}
		}

		System.out.println("Os números iguais são: "); 

		for (int i = 0; i < intersecao.length; i++) {
			if(a1[i] == a2[i]) {
				System.out.println(intersecao[i] + " ");

			}

		}

	}
}