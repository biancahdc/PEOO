import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in); 
	
		int i = 0;
		int acum = 0;
		
		for (i = 1; i <= 10; i++) {
			System.out.println("Digite um número:");
			int num = leia.nextInt();
			
			if(num >= 0 && num <= 100) {
				System.out.println("Está no intervalo de 0 a 100");
				acum++;
			}else {
				System.out.println("Não está no intervalo de 0 a 100");
			}
			
		}
		
		System.out.println("Estão dentro do intervalo " + acum + " número (s)");
		System.out.println("Estão fora do intervalo " + (10 - acum) + " número (s)");
		
	}

}
