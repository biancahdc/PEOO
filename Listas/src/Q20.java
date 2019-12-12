import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int acm = 0;
		int num = 0;
		int qPares = 0;
		int qImpares = 0;

		while(num != -1){
			System.out.println("Digite um número. Digite -1 para parar");
			num = leia.nextInt();
			
			if(num != -1) {
				if(num % 2 == 0){
					acm += 1;
					qPares = acm;
				}else{
					qImpares++;
				}
			}
			
		}
		
		System.out.println("Pares: " + qPares);
		System.out.println("Impares: " + qImpares);
	}

}



