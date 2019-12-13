
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Produto prod1 = new Produto(700, "Violino");
        Produto prod2 = new Produto(800, "Piano");
        Compra compra = new Compra();
        
        System.out.println("Digite seu nome:");
        String nome = leia.nextLine();
        System.out.println("Digite seu número de telefone");
        String num = leia.nextLine();
        System.out.println("Digite seu logradouro:");
        String logradouro = leia.nextLine();
        System.out.println("Digite sua cidade:");
        String cidade = leia.nextLine();
        System.out.println("Digite seu estado:");
        String estado = leia.nextLine();
        
        Endereco endereco = new Endereco(logradouro, cidade, estado);
        Pessoa pessoa = new Pessoa(nome, endereco, num);
       
        System.out.println("Digite que prodouto você quer comprar:"
                           + "\nViolino: 700"
                           + "\nPiano: 800"
                           + "\nDigite o código do produto que você quer comprar:");
        int codigo = leia.nextInt();
        
        switch(codigo){
            case 700:
                compra.comprar(pessoa, prod1);
                System.out.println(compra.verificarCompra());
                break;
            case 800:
                compra.comprar(pessoa, prod2);
                System.out.println(compra.verificarCompra());
                break;
            default:
                System.out.println("Compra não efetuada, pois o produto não existe...");
                break;
        }
    }
}
