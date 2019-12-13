import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] nums = new int[20];

		int temp = 0;

		for (int i = 0; i < nums.length; i++) {
			System.out.println("Digite um número: ");
			int index = nums.length - i - 1;
			nums[index] = leia.nextInt();
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("[%d]", nums[i]);
		}
		

	}

}
