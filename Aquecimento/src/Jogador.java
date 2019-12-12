public class Jogador {

    private String nome;
    private String matricula;
    private String posicao;
    private double altura;
    private double peso;

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPosicao() {
        return this.posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Informações do jogador:"
                + "\nNome: " + nome
                + "\nMatricula: " + matricula
                + "\nPosição: " + posicao
                + "\nAltura: " + altura + " m"
                + "\nPeso: " + peso + " kg";
    }
}
