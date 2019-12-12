import java.util.Random;
import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Random aleatorio = new Random();

		int numRandom = aleatorio.nextInt(100);
		boolean desistir = false;

		System.out.println("Bem vindo!\nNesse programa você irá tentar acertar um número de 0 a 100 que foi gerado pelo sistema");
		int num = 0;
		System.out.println(numRandom);

		while(num != numRandom) {
			
			System.out.println("Digite um número aleatório: ");
			num = leia.nextInt();
			
			if(num > numRandom) {
				System.out.println("O número que você escolheu é maior do que o número sorteado");
				System.out.println("Você quer desistir?");
				desistir = leia.nextBoolean();
				if(desistir == true) {
					System.out.println("Você perdeu!!!");
					break;
				}
			} else if(num < numRandom) {
				System.out.println("O número que você escolheu é menor do que o número sorteado");
				System.out.println("Você quer desistir?");
				desistir = leia.nextBoolean();
				if(desistir == true) {
					System.out.println("Você perdeu!!!");
					break;
				}

			}else{
				System.out.println("Você venceu!!!!");


			}

		}

	}
}
