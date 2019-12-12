import java.util.Scanner;

public class TesteLivro {

    public static void main(String[] args) {
        Livro l1 = new Livro();
        Scanner leia = new Scanner(System.in);

        l1.titulo = "'O que Deus diz sobre as mulheres'";
        l1.autor = "Kathleen Nielson";
        l1.genero = "cristão";
        l1.pags = 247;

        System.out.println("Informações do livro: ");
        System.out.println("O nome do livro é " + l1.titulo);
        System.out.println("O nome do(a) autor(a) é " + l1.autor);
        System.out.println("O gênero do livro é " + l1.genero);
        System.out.println("O livro tem " + l1.pags + " páginas");
        System.out.println("O livro está aberto? " + l1.estaAberto());
        System.out.println("(" + l1.lendo() + ")");

        Livro l2 = new Livro();

        System.out.println("------------------------------------");

        l2.titulo = "'A seleção'";
        l2.autor = "Kiera Cass";
        l2.genero = "romance";
        l2.pags = 368;

        System.out.println("Informações do livro: ");
        System.out.println("O nome do livro é " + l2.titulo);
        System.out.println("O nome do(a) autor(a) é " + l2.autor);
        System.out.println("O gênero do livro é " + l2.genero);
        System.out.println("O livro tem " + l2.pags + " páginas");
        System.out.println("O livro está aberto? " + l2.estaFechado());
        System.out.println("(" + l2.naoEstaLendo() + ")");
    }
}
