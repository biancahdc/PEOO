public class Serie {

    private String titulo;
    private String criadores;
    private String genero;
    private int temporadas;
    private double avaliacao;

    public Serie() {

    }

    public Serie(String titulo, String criadores, String genero, int temporadas, double avaliacao) {
        this.titulo = titulo;
        this.criadores = criadores;
        this.genero = genero;
        this.temporadas = temporadas;
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCriadores() {
        return criadores;
    }

    public void setCriadores(String criadores) {
        this.criadores = criadores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    @Override
    public String toString() {
        return "Informações da série " + titulo
                + "\nNome: " + titulo
                + "\nCriadores: " + criadores
                + "\nGênero: " + genero
                + "\nNúmero de temporadas: " + temporadas;
    }
}
