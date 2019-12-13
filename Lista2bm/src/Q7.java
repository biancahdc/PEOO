import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] vetorA = new int[] {0,1,2,3,4,5,6,7,8,9,10};
		boolean valorAchado = false;
		
		
		System.out.println("Digite um valor de 1 a 10");
		int x = leia.nextInt();

		for (int i = 0; i < vetorA.length; i++) {
			if(x == vetorA[i]){
				System.out.println("Valor encontrado!");
				valorAchado = true;
				break;
			}

		}
		
		if(valorAchado == false) {
			System.out.println("Valor não encontrado");
		}
	}
}
