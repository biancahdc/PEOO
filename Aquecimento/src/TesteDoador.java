import java.util.Scanner;

public class TesteDoador {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Doador doador1 = new Doador();
        
        System.out.println("Digite seu nome:");
        String nome = leia.nextLine();
        System.out.println("Digite sua idade:");
        int idade = leia.nextInt();
        System.out.println("Digite seu tipo sanguíneo:");
        String tipoSang = leia.next();
        System.out.println("Digite seu peso:");
        double peso = leia.nextDouble();
        
        doador1.setNome(nome);
        doador1.setIdade(idade);
        doador1.setTipoSang(tipoSang);
        doador1.setPeso(peso);
        
        System.out.println("--------------------------------");
        System.out.println("Informações do doador:");
        System.out.println("Nome: " + doador1.getNome());
        System.out.println("Idade: " + doador1.getIdade());
        System.out.println("Tipo sanguíneo: " + doador1.getTipoSang());
        System.out.println("Peso: " + doador1.getPeso());
        
        System.out.println("-------------------------------");
        
        Doador doador2 = new Doador();
        
        doador2.setNome("Bianca");
        doador2.setIdade(15);
        doador2.setTipoSang("O-");
        doador2.setPeso(60);
        
        System.out.println(doador2.toString());
    }
}
