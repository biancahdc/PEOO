import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] nums = new int[10];

		int maior = Integer.MIN_VALUE;
		int posicaoMaior = 0;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Digite um número: ");
			nums[i] = leia.nextInt();

			if(nums[i] > maior) {
				maior = nums[i];
				posicaoMaior = i;
			}

		} 
		
		System.out.println("O maior num é: " + maior + " e sua posição é: " + posicaoMaior);
		System.out.println("O valor que estava no último índice era: " + nums[nums.length - 1]);
		
		int temp = nums[posicaoMaior];
		nums[posicaoMaior] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		
		System.out.println("Depois de trocados o último número agora é: " + nums[nums.length - 1]);

	}

}
