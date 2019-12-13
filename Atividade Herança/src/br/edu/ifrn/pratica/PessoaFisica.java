package br.edu.ifrn.pratica;


public class PessoaFisica extends Pessoa{
    private String cpf, rg, dataNascimento;

    public PessoaFisica() {}

    public PessoaFisica(String cpf, String rg, String dataNascimento, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\n-----------------------------" 
                + "\n" + nome + " é uma pessoa física. " + "\nCPF: " 
                + cpf + "\nRG: " + rg + "\nData de nascimento: " + dataNascimento;
    }
}
