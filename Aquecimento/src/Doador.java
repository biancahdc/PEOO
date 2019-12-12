public class Doador {
   private String nome;
   private int idade;
   private String tipoSang;
   private double peso;
   
   public String getNome(){
       return this.nome;
   }
   public void setNome(String nome){
       this.nome = nome;
   }
   public int getIdade(){
       return this.idade;
   }
   public void setIdade(int idade){
       this.idade = idade;
   }
   public String getTipoSang(){
       return this.tipoSang;
   }
   public void setTipoSang(String tipoSang){
       this.tipoSang = tipoSang;
   }
   public double getPeso(){
       return this.peso;
   }
   public void setPeso(double peso){
       this.peso = peso;
   }
   
   public String toString(){
       return "Informações do doador:"
               +"\nNome: " + nome
               +"\nIdade: " + idade + " anos"
               +"\nTipo Sanguíneo: " + tipoSang
               +"\nPeso: " + peso + " kg";
   }
   
}
