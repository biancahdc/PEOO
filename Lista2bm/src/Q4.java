import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double acm = 0;
		int cont = 0;
		
		double[] notas = new double[30];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite sua nota:");
			notas[i] = leia.nextDouble();
			acm += notas[i];
		}
		
		double media = acm/30;
		
		System.out.println("A média da turma é: " + media);
		
		System.out.println("As notas à seguir são as notas acima da média");
		
		for (int j = 0; j < notas.length; j++) {
			if(notas[j] >= media ){
				System.out.println(notas[j]);
				cont++;
			}
		}
		
		System.out.println("Tiveram " + cont + " alunos acima da média");
	}
}
