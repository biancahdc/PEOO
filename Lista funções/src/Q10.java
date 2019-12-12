import java.util.Scanner;

public class Q10 {

	public static double encontra(double vetor[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Tente achar um valor do vetor");
		double x = leia.nextDouble();

		for (int i = 0; i < vetor.length; i++) {
			if(x == vetor[i]) {
				System.out.print("Esse número está na posição ");
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {

		double[] vetor = new double[] {0,7890.5,5,9.5,4,10,3,4.5,100};

		System.out.println(encontra(vetor));

	}

}

