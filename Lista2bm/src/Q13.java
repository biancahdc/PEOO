import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] a1 = new int[8];
		int[] a2 = new int[8];
		int[] temp = new int[8];
		
		for (int i = 0; i < a1.length; i++) {
			System.out.println("Digite um número: ");
			a1[i] = leia.nextInt();
		}
		
		for (int j = 0; j < a2.length; j++) {
			System.out.println("Digite um número para o segundo vetor: N");
			a2[j] = leia.nextInt();
		}
		
		temp = a1;
		a1 = a2;
		a2 = temp;
		
		for (int i = 0; i < a1.length; i++) {
			System.out.println("A1:" + a1[i]);
		}
		for (int i = 0; i < a2.length; i++) {
			System.out.println("A2:" + a2[i] );
		}
	}

}
