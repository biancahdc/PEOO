import java.util.Scanner;

public class TesteJogador {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Jogador jog1 = new Jogador();
        
        System.out.println("Digite seu nome:");
        String nome = leia.nextLine();
        System.out.println("Digite sua matrícula:");
        String matricula = leia.nextLine();
        System.out.println("Digite sua posição");
        String posicao = leia.nextLine();
        System.out.println("Digite sua altura:");
        double altura = leia.nextDouble();
        System.out.println("Digite seu peso:");
        double peso = leia.nextDouble();
        
        
        jog1.setNome(nome);
        jog1.setMatricula(matricula);
        jog1.setPosicao(posicao);
        jog1.setAltura(altura);
        jog1.setPeso(peso);
        
        System.out.println("-------------------------------------------");
        System.out.println("Informações do jogador(a):\n" + jog1.toString());
        
        System.out.println("--------------------------------------------");
        
        Jogador jog2 = new Jogador();
        
        jog2.setNome("Mateus");
        jog2.setMatricula("20151114010087");
        jog2.setPosicao("Ala");
        jog2.setAltura(1.80);
        jog2.setPeso(80);
        
        System.out.println("Informações do jogador(a):");
        System.out.println("Nome: " + jog2.getNome());
        System.out.println("Matricula: " + jog2.getMatricula());
        System.out.println("Posição: " + jog2.getPosicao());
        System.out.println("Altura: " + jog2.getAltura() + " m");
        System.out.println("Peso: " + jog2.getPeso() + " kg");

    }
}
