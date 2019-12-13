import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] nums = new int[3];
		int n = 0;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Digite um número:");
			nums[i] = leia.nextInt();
		}
		
		for (int i = 0; i < nums.length; i++) {
			
			int diferente = 0;
			
			for (int j = 0; j < nums.length; j++) {
			 	if(nums[i] != nums[j]) {
			 		diferente++;
			 	}
			}
			if(diferente >= 2) {
				n++;
				System.out.println("O vetor na posição: " + i);
			}
		}
		
	}
}

