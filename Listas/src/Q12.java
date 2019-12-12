import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		//Jonanthan me ajudou 
		
		System.out.println("Digite um número: ");
		int n1 = leia.nextInt();
		System.out.println("Digite um número: ");
		int n2 = leia.nextInt();
		
		int acm = n1;
		
		System.out.print(n1 + " x " + n2 + " = " + n1 );
		
		for (int i = 1; i < n2; i++) {
			acm = n1 + acm;
			System.out.print(" + " + n1);
		
		}
		
		System.out.println(" = " + acm);

	}

}
