
package br.edu.ifr.peoo.excecoes.p2;

public class Calc {
    public static double soma(double n1, double n2) {
        return n1 + n2;
    }

    public static double subt(double n1, double n2) {
        return n1 - n2;
    }

    public static double multi(double n1, double n2) {
        return n1 * n2;
    }

    public static int divi(int num1, int num2)  throws ArithmeticException {
       
        if(num2 == 0){
             throw new ArithmeticException("Impossível realizar operação, pois o numerador é 0!!");
        }
          return num1 / num2; 
    }

}
