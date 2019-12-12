public class Livro {
  
    private String titulo;
    private String editora;
    private String autor;
    private double preco;
    
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getEditora(){
        return this.editora;
    }
    public void setEditora(String editora){
        this.editora = editora;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public String toString(){
        return "O nome do livro é: " + titulo
                +"\nO livro pertence a editora: " + editora
                +"\nO autor(a) é: " + autor
                +"\nO livro custou " + preco + " reais";
    }
}
