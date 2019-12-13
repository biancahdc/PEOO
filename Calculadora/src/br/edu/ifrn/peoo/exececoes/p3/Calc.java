
package br.edu.ifrn.peoo.exececoes.p3;

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

    public static int divi(int num1, int num2)  throws DivideByZeroException{
       
        if(num2 == 0){
             throw new DivideByZeroException("Impossível realizar operação, pois o numerador é 0!!");
        }else{
          return num1 / num2; 
        }
    }
}