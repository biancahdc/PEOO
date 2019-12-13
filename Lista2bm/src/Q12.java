import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] a1 = new int[10];
		int[] a2 = new int[10];
		
		int acm = 0;
		
		for (int i = 0; i < a1.length; i++) {
			System.out.println("Digite um número: ");
			a1[i] = leia.nextInt();
			a2[i] = a1[i] * a1[i] * a1[i];
			System.out.println(a2[i]);
		}
		
	}

}
