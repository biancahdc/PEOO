import java.util.Scanner;

public class TesteSerie {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
/*
        System.out.println("Digite o título da série:");
        String titulo = leia.nextLine();
        System.out.println("Digite os nomes dos criadores:");
        String criadores = leia.nextLine();
        System.out.println("Digite o gênero da série:");
        String genero = leia.nextLine();
        System.out.println("Digite a quantidade de temporadas:");
        int temporadas = leia.nextInt();

        Serie s1 = new Serie(titulo, criadores, genero, temporadas);

        System.out.println(" ");
        System.out.println("--------------------------------------");
        System.out.println("Informações da série " + s1.getTitulo());
        System.out.println("Nome: " + s1.getTitulo());
        System.out.println("Criadores: " + s1.getCriadores());
        System.out.println("Gênero: " + s1.getGenero());
        System.out.println("Temporadas: " + s1.getTemporadas());
        System.out.println("----------------------------------------");
        */
        Serie s2 = new Serie();

        
        System.out.println("Digite o título da série:");
        String titulo = leia.nextLine();
        System.out.println("Digite os nomes dos criadores:");
        String criadores = leia.nextLine();
        System.out.println("Digite o gênero da série:");
        String genero = leia.next();
        System.out.println("Digite a quantidade de temporadas:");
        int temporadas = leia.nextInt();

        s2.setTitulo(titulo);
        s2.setCriadores(criadores);
        s2.setGenero(genero);
        s2.setTemporadas(temporadas);

        System.out.println(" ");
        System.out.println("--------------------------------------");
        System.out.println("Informações da série " + s2.getTitulo());
        System.out.println("Nome: " + s2.getTitulo());
        System.out.println("Criadores: " + s2.getCriadores());
        System.out.println("Gênero: " + s2.getGenero());
        System.out.println("Temporadas: " + s2.getTemporadas());
        System.out.println("-------------------------------------");
        
        Serie s3 = new Serie();

        s3.setTitulo("Friends");
        s3.setCriadores("David Crane e Marta Kauffman");
        s3.setGenero("Comédia");
        s3.setTemporadas(10);

        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println(s3.toString());

    }
}
