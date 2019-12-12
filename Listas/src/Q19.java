import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int cont = 0;
		int acm = 0;
		int num = 0;
		int media = 0;

		while(num != 9999){
			cont++;
			System.out.println("Digite um número. Digite 9999 para parar");
			num = leia.nextInt();
			if(num != 9999) {
				acm += num;
				media = acm/cont;
			}
		}
		System.out.println("A soma é: " + acm);
		System.out.println("A média é: " + media);
	}

}
