
package br.edu.ifrn.atvd;

public abstract class Funcionario {
    
    protected String nome, cpf;
    protected double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Funcionario() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract double calcularSal();

    @Override
    public String toString() {
        return "Informações do funcionário: " + "\nNome: " + nome 
                + "\nCPF:" + cpf;
    }
}
