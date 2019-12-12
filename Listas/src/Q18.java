
public class Q18 {

	public static void main(String[] args) {
		int numero = 0; 
		int acm = 0;
		int setimo = 0;
		int vigesimo = 0;
		
		while(numero != -1){
			int cont = 0;
			numero++;
			
			for (int i = 1; i <= numero; i++) {
				if(numero % i  == 0) {
					cont++;
				}
			}
			
			if(cont == 2) {
				acm++;
				
				if(acm == 7){
					setimo = numero;
					System.out.println("O setimo num é: " + setimo);
				}
				
				if(acm == 21){
					vigesimo = numero;
					System.out.println("O vigesimo num é: " + vigesimo);
					break;
				}
			}
		
		}
		
		System.out.println("O resultado é: " + (vigesimo - setimo));
		
	 }
}

