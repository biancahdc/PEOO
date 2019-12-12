import java.util.Scanner;

public class Q9 {

	public static boolean encontra(double vetor[]) {
		Scanner leia = new Scanner(System.in);
		
		boolean valorAchado = false;

		System.out.println("Tente achar um valor do vetor");
		double x = leia.nextDouble();

		for (int i = 0; i < vetor.length; i++) {
			if(x == vetor[i]) {
				System.out.println("Valor encontrado!");
				valorAchado = true;
				break;
			}
		}
		
		if(valorAchado == false) {
			System.out.println("Valor não encontrado!");
		}
		return valorAchado;
	}

	public static void main(String[] args) {

		double[] vetor = new double[] {0,7,5,9,4,10,3,45,100};
		
		encontra(vetor);

	}

}
