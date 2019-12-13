import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int [] multi = new int[10];
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Digite um valor: ");
			vetor1[i] = leia.nextInt();
		}
		for (int i = 0; i < vetor2.length; i++) {
			System.out.println("Digite um valor para o segundo vetor: ");
			vetor2[i] = leia.nextInt();
		}
		for (int i = 0; i < multi.length; i++) {
			multi[i] = vetor1[i] * vetor2[i];
			System.out.println(multi[i]);
		}
		
	}

}
