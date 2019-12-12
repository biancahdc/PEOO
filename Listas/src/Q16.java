import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int acm = 0;
		int soma = 0;
		int quo = 0;
		int resto = 0;
		
		System.out.println("Digite um número:");
		int n1 = leia.nextInt();
		System.out.println("Digite um número:");
		int n2 = leia.nextInt();
		
		while(acm < n1)  {
			acm += n2;
			quo++;
			resto = n1 - acm;
		}
		
		if(resto != 0) {
			resto += n2;
			quo--;
		}
		
		System.out.println("O quociente é " + quo);
		System.out.println("O resto é: " + resto);
	}

}
