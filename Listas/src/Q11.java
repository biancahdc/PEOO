import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um n�mero");
		int num = leia.nextInt();

		int cont = 0;
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				cont++;
			
			}
			
		}
		if(cont == 2) {
			System.out.println(num + " � primo");
		}else {
			System.out.println(num + " n�o � primo");
		}

	}

}
