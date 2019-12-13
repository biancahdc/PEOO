
package br.edu.ifrn.atvd;

public class Diretor extends Funcionario{
    
    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public Diretor() {
    }

    @Override
    public double calcularSal() {
        return salario * 5; 
    }

    @Override
    public String toString() {
        return super.toString() + "\nFunção: Diretor. " +"\nSalário: " + calcularSal();
    } 
}
