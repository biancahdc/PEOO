
package br.edu.ifrn.atvd;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public Estagiario() {
      
    }

    @Override
    public double calcularSal() {
        return salario/2;
    }
    

    @Override
    public String toString() {
        return super.toString() + "\nFunção: Estagiário. " +"\nSalário: " + calcularSal();
    }
}
