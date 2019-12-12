
package br.edu.ifrn.atvd;

public interface IVeiculo {
  
    public String andar(int distancia); 
    public String abastecer(int litros);
    public int consultarTanque();
}
