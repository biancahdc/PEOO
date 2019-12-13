
package br.edu.ifrn.atvd;

public class Professor extends Funcionario{

    public Professor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public Professor() {
    }

    @Override
    public double calcularSal() {
        return salario * 3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFunção: Professor. " +"\nSalário: " + calcularSal();
    }
}
