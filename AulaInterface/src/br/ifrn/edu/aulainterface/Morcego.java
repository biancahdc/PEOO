
package br.ifrn.edu.aulainterface;

 public class Morcego implements Animal {
    
    private double peso = 4.5; 
     
    public void nasca() {
    System.out.println("Nasce um lindo morcego");
    }
    public void passeie() {
    System.out.println("Voa de um lado para o outro");
    }
    public void durma() {
    System.out.println("Dorme de cabeça para baixo");
    }
    public double peso() {
      System.out.println("O peso do morcego é: " + peso);
      return peso;
    }
  }
