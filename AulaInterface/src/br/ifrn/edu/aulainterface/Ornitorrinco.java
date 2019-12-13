
package br.ifrn.edu.aulainterface;

public class Ornitorrinco implements Animal {
    private double peso;

    public Ornitorrinco(double peso) {
        this.peso = peso;
    }

    public void nasca() {
        System.out.println("Quebra o ovo para sair");
    }
    
    public void passeie() {
        System.out.println("Anda e nada de um lado para o outro");
    }
    
    public void durma() {
        System.out.println("Dorme dentro de túneis durante o dia");
    }
    
    public double peso() {
        System.out.println("Esse ornitorrinco pesa " + peso + " kg");
        return peso;
    }
}
