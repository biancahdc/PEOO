import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite um número: ");
			num[i] = leia.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		

	}

}
