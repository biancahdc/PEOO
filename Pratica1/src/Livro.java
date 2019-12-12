public class Livro {

    String titulo;
    String autor;
    String genero;
    int pags;
    boolean aberto;
    boolean ler;

    boolean estaAberto() {
        aberto = true;
        return aberto;
    }

    boolean estaFechado() {
        aberto = false;
        return aberto;
    }

    boolean lendo() {
        ler = true;
        System.out.println("Lendo...");
        return ler;
    }

    boolean naoEstaLendo() {
        ler = false;
        System.out.println("Não está sendo lido.");
        return ler;
    }

}
