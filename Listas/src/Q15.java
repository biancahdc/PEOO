import java.util.Random;
import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Random aleatorio = new Random();

		int numRandom = aleatorio.nextInt(100);
		boolean desistir = false;

		System.out.println("Bem vindo!\nNesse programa voc� ir� tentar acertar um n�mero de 0 a 100 que foi gerado pelo sistema");
		int num = 0;
		System.out.println(numRandom);

		while(num != numRandom) {
			
			System.out.println("Digite um n�mero aleat�rio: ");
			num = leia.nextInt();
			
			if(num > numRandom) {
				System.out.println("O n�mero que voc� escolheu � maior do que o n�mero sorteado");
				System.out.println("Voc� quer desistir?");
				desistir = leia.nextBoolean();
				if(desistir == true) {
					System.out.println("Voc� perdeu!!!");
					break;
				}
			} else if(num < numRandom) {
				System.out.println("O n�mero que voc� escolheu � menor do que o n�mero sorteado");
				System.out.println("Voc� quer desistir?");
				desistir = leia.nextBoolean();
				if(desistir == true) {
					System.out.println("Voc� perdeu!!!");
					break;
				}

			}else{
				System.out.println("Voc� venceu!!!!");


			}

		}

	}
}
