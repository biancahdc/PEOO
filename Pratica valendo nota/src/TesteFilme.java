import java.util.Scanner;

public class TesteFilme {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Filme filme1 = new Filme();

        System.out.println("Qual é o nome do filme?");
        String nome = leia.nextLine();
        System.out.println("Qual é o gênero do filme?");
        String genero = leia.nextLine();
        System.out.println("Qual a duração do filme?");
        int duracao = leia.nextInt();
        System.out.println("Qual a classificação do filme?");
        int classificacao = leia.nextInt();
        System.out.println("Quem é o diretor do filme?");
        String diretor = leia.next();
        System.out.println("Qual distribuidora produziu esse filme?");
        String distribuidora = leia.next();

        filme1.setNome(nome);
        filme1.setGenero(genero);
        filme1.setDuracao(duracao);
        filme1.setClassificacao(classificacao);
        filme1.setDiretor(diretor);
        filme1.setDistribuidora(distribuidora);

        System.out.println("-----------------------------------------");

        System.out.println(filme1.toString());

        System.out.println("-----------------------------------------");

        Filme filme2 = new Filme();

        filme2.setNome("Matrix");
        filme2.setGenero("Ficção científica");
        filme2.setDuracao(136);
        filme2.setClassificacao(14);
        filme2.setDiretor("Lana Wachowski e Lilly Wachowski");
        filme2.setDistribuidora("Warner Bros");

        System.out.println("Informações do filme dois:");
        System.out.println("Nome: " + filme2.getNome());
        System.out.println("Gênero: " + filme2.getGenero());
        System.out.println("Duração: " + filme2.getDuracao() + " min");
        System.out.println("Classificação: " + filme2.getClassificacao() + " anos");
        System.out.println("Diretor: " + filme2.getDiretor());
        System.out.println("Distribuidora: " + filme2.getDistribuidora());

    }
}
