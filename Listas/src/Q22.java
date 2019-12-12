import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double acm = 0;
		double uni = 0;
		int pedido = 0;
		
		System.out.println("Cardápio virtual:\nCódigo: 100 Cachorro quente   Valor: 1,10\n"
						+ "Código: 101 Bauru simples     Valor: 1,30\n"
						+ "Código: 102 Bauru c/ovo       Valor: 1,50\n"
						+ "Código: 103 Hamburger         Valor: 1,10\n"
						+ "Código: 104 Cheeseburger      Valor: 1,30\n"
						+ "Código: 105 Refrigerante      Valor: 1,00\n"
						+ "Se não quiser mais fazer nenhum pedido, digite -1");
		
		while(pedido != -1){
			System.out.println("Digite o código do seu pedido:");
			pedido = leia.nextInt();
			
			if(pedido == -1) {
				break;
			}
			
			System.out.println("Quantas unidades?: ");
			uni = leia.nextInt();
			
			switch(pedido){
			case 100:
				acm += uni * 1.10;
				break;
			case 101:
				acm += uni * 1.30;
				break;
			case 102:
				acm += uni * 1.50;
				break;
			case 103:
				acm += uni * 1.10;
				break;
			case 104:
				acm += uni * 1.30;
				break;
			case 105:
				acm += uni * 1.00;
				break;
			default:
				break;
			}
		}
		
		System.out.println("O valor a ser pago é " + acm);

	}

}
