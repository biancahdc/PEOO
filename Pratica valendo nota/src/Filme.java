public class Filme {

    private String nome;
    private String genero;
    private int duracao;
    private int classificacao;
    private String diretor;
    private String distribuidora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String toString() {
        return "Informações do filme um:"
                + "\nNome do filme: " + nome
                + "\nGênero: " + genero
                + "\nDuração: " + duracao + " min"
                + "\nClassificação: " + classificacao + " anos"
                + "\nDiretor: " + diretor
                + "\nDistribuidora: " + distribuidora;
    }

}
