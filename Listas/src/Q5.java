import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int i = 1;
		boolean acabou = false;
		int media = 0;
		int acumulador = 0;
		
		while(!acabou) {
			System.out.println("Digite a idade do aluno:");
			int idade = leia.nextInt();
			acumulador += idade;
			System.out.println("Acabaram os alunos?(true ou false) ");
			acabou = leia.nextBoolean();
			if(acabou == false) {
				i++;
			}
		}
			media = acumulador/i;
			System.out.println("A média das idades dos alunos é: " + media);
	}

}
