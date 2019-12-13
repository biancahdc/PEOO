
package br.edu.ifrn.atvd;

public class Moto implements IVeiculo{
    
    int consumoLitro;
    int capacidadeTotal;
    int tanque;

    public Moto(int consumoLitro, int capacidadeTotal, int tanque) {
        this.consumoLitro = consumoLitro;
        this.capacidadeTotal = capacidadeTotal;
        this.tanque = tanque;
    }

    public Moto() {
    }

    public int getConsumoLitro() {
        return consumoLitro;
    }

    public void setConsumoLitro(int consumoLitro) {
        this.consumoLitro = consumoLitro;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    @Override
    public String andar(int distancia) {
        int qntdLitros = distancia/consumoLitro;
        
        if(tanque - qntdLitros >= 0 && tanque != 0){
            tanque -= qntdLitros;
            return "A moto percorreu " + distancia + " km";
        }else{
            return "Tu até pode ir, mas vai ficar no prego :/";
        }
    }

    @Override
    public String abastecer(int litros) {
        if(tanque + litros <= capacidadeTotal){
            tanque += litros;
            return "Você abasteceu a moto com " + litros + "L";
        }else{
            return "Impossível colocar essa quantidade de gasolina!";
        }
    }

    @Override
    public int consultarTanque() {
        return tanque;
    }
    
    
}
