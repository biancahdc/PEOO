import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int[] nums = new int[20];
		
		int indiceMenor = 0;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Digite um número: ");
			nums [i] = leia.nextInt();
		}
		
		int maiorDiferenca = Integer.MIN_VALUE;  
		
		for (int i = 0; i < nums.length - 1; i++) {
			if(Math.abs((nums[i] - nums[i + 1])) > maiorDiferenca) {
				maiorDiferenca = Math.abs((nums[i] - nums[i + 1]));
				indiceMenor = i;
			}
		}
			System.out.println("A maior diferença é: " + maiorDiferenca + " e o seu indice é: " + (indiceMenor + 1));
		
	}

}
