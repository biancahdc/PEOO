import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in); 
	
		int i = 0;
		int acum = 0;
		
		for (i = 1; i <= 10; i++) {
			System.out.println("Digite um n�mero:");
			int num = leia.nextInt();
			
			if(num >= 0 && num <= 100) {
				System.out.println("Est� no intervalo de 0 a 100");
				acum++;
			}else {
				System.out.println("N�o est� no intervalo de 0 a 100");
			}
			
		}
		
		System.out.println("Est�o dentro do intervalo " + acum + " n�mero (s)");
		System.out.println("Est�o fora do intervalo " + (10 - acum) + " n�mero (s)");
		
	}

}
