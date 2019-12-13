public class Compra {
    
    private Pessoa pessoa;
    private Produto produto;
    
    public Compra(){
    
    }
    
    public void comprar(Pessoa pessoa, Produto produto){
        this.pessoa = pessoa;
        this.produto = produto;
    }
    
    public String verificarCompra(){
        return pessoa.consultaNome() + " comprou "
               + produto.consultaNome() + " . Endereço: "
               + pessoa.consultaEndereco().consultaLogradouro();
    }
}