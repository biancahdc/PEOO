import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int proximo=0,atual=0,anterior=1;
		int acm = 0; 

		System.out.println("Quantos termos você quer que apareça?");
		int termos = leia.nextInt();

		if(termos < 0){
			System.out.println("Digite um número maior que 0!!!!!");
		}else {
			System.out.print("0,");
			termos--;

			while(acm < termos){
				proximo = atual + anterior;			
				anterior = atual;
				atual = proximo;
				System.out.print(atual+",");
				acm++;
			}

		}

	}

}
