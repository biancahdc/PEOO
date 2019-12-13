public class Pessoa {
    
    private String nome;
    private Endereco endereco;
    private String num;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, Endereco endereco, String num){
        this.nome = nome;
        this.endereco = endereco;
        this.num = num;
    }
   
    //nome
    public String consultaNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    //endereco
    public Endereco consultaEndereco(){
        return endereco;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    //num
    public String getNum(){
        return num;
    }
    
    public void setNum(String num){
        this.num = num;
    }
}
