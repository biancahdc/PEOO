import java.util.Scanner;

public class Q8 {
	public static void inverso(String[] vetor) {
		
		for (int i = vetor.length - 1; i >= 0; i--) {
			System.out.print(vetor[i]);
		}
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor");
		int tam = leia.nextInt();
		
		String vetor[] = new String[tam];	
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite alguma coisa:");
			vetor[i] = leia.next(); 
		}
		
		inverso(vetor);

	}
}
