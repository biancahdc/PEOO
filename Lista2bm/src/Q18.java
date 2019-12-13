import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] a1 = new int[3];
		int[] a2 = new int[3];
		int[] uniao = new int[3];
		
		for (int i = 0; i < a1.length; i++) {
			System.out.println("Digite um valor para o 1 vetor");
			a1[i] = leia.nextInt();
		}
		
		for (int i = 0; i < a2.length; i++) {
			System.out.println("Digite um valor para o 2 vetor");
			a2[i] = leia.nextInt();
		}
		
		for (int i = 0; i < uniao.length; i++) {
			if(a1[i] == a2[i]){
				uniao[i] = a1[i];
			}
		}
		
		System.out.println("O vetor resultante é: ");
		for (int i = 0; i < uniao.length; i++) {
			System.out.println(uniao[i] + " ");
		}

	}

}
