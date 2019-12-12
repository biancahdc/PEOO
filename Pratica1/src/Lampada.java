public class Lampada {

    private String tipo;
    private int potencia;
    private boolean acesa;
    
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public int getPotencia(){
        return this.potencia;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public boolean getAcesa(){
        return this.acesa;
    }
    public void setAcesa(boolean acesa){
        this.acesa = acesa;
    }
    
    public String toString(){
        return "O tipo da lâmpada é: " + tipo
                +"\nA lâmpada tem " + potencia + " Wats"
                +"\nA lâmpada está acesa? " + acesa;
    }
}
