import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro");
		int n = leia.nextInt();
		
		int x = 1;
		boolean encontrou = false;
		while(!encontrou) {
			if(x*x > n) {
				System.out.println(x);	
				encontrou = true;
			}
			x++;
		}

	}

}
