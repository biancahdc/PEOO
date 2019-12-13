import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
	
		double[] nums = new double[10];

		double maior = Integer.MIN_VALUE;
		double menor = Integer.MAX_VALUE;
		int posicaoMaior = -1;
		int posicaoMenor = -1;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Digite um número: ");
			nums[i] = leia.nextDouble();
			
			if(nums[i] > maior) {
				maior = nums[i];
				posicaoMaior = i;
			}if(nums[i] < menor) {
				menor = nums[i];
				posicaoMenor = i;
			}
		}
		
		System.out.println("O maior num é: " + maior + " e sua posição é: " + posicaoMaior);
		System.out.println("O menor num é: " + menor + " e sua posição é: " + posicaoMenor);
	}

}
