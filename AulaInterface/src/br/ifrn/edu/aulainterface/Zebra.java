package br.ifrn.edu.aulainterface;

public class Zebra implements Animal {
    private int listras;
    private double peso;
    
    public Zebra(int listras, double peso) {
        this.listras = listras;
        this.peso = peso;
    }

    
    public void nasca() {
        System.out.println("Nasce mais uma zebra");
    }
    
    public void passeie() {
        System.out.println("Galopa pelo campo");
    }
    
    public void durma() {
        System.out.println("Dorme em pé");
    }
    
    public double peso() {
        System.out.println("Essa zebra pesa " + peso + " kg");
        return peso;
    }
    
    public void contaListras() {
        System.out.println("Esta zebra tem " + listras + " listras");
    }
}
