import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int matri = 0;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int media = 0;
		int acm = 0;
		int cont = 0;
		int apro = 0;
		int repro = 0;
	 	
		while(matri != 9999){
			System.out.println("Digite sua matricula, se quiser parar digite 9999");
			matri = leia.nextInt();
			if(matri != 9999) {
				System.out.println("Digite sua nota 1:");
				n1 = leia.nextInt();
				System.out.println("Digite sua nota 2:");
				n2 = leia.nextInt();
				System.out.println("Digite sua nota 3:");
				n3 = leia.nextInt();
				cont++;
				
				media =  ((2 * n1) + (3* n2) + (4* n3))/9;
				
				if(media >= 5){
					System.out.println("Matrícula: " + matri);
					System.out.println("A média final é: " + media);
					System.out.println("APROVADO,UHU");
					acm++;
					apro = acm;
				}else {
					System.out.println("Matrícula: " + matri);
					System.out.println("A média final é: " + media);
					System.out.println("REPROVADO");
					acm++;
					repro++;
				}
			}else {
				break;
			}
		}
		
		System.out.println(cont + " alunos");
		System.out.println(apro + " aprovados");
		System.out.println(repro + " reprovados");

	}

}


