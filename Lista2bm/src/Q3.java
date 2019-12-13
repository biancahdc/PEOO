import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int[] nums = new int[20]; 
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Digite um número: ");
			nums[i] = leia.nextInt();
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " é par");
			}else {
				System.out.println(i + " é ímpar");
			}
		}

	}

}
