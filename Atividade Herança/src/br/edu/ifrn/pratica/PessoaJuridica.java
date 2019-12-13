package br.edu.ifrn.pratica;


public class PessoaJuridica extends Pessoa {
    private String cnpj, inscEstadual, inscMunicipal;

    public PessoaJuridica() {}

    public PessoaJuridica(String cnpj, String inscEstadual, String inscMunicipal, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.inscMunicipal = inscMunicipal;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public String getInscMunicipal() {
        return inscMunicipal;
    }

    public void setInscMunicipal(String inscMunicipal) {
        this.inscMunicipal = inscMunicipal;
    }

    @Override
    public String toString() {
        return super.toString() + "\n--------------------" 
                + "\n" + nome + " é uma pessoa jurídica." + "\nCNPJ: " + cnpj 
                + "\nInscição Estadual: " + inscEstadual + "\nInscrição Municipal:" + inscMunicipal;
    }
}
