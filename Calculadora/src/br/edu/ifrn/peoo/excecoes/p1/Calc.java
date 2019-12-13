
package br.edu.ifrn.peoo.excecoes.p1;
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

    public static int divi(int num1, int num2) {
       try{
          return num1 / num2; 
       }
       catch(ArithmeticException ae){
           System.out.println("Impossível realizar operação!!");
           return 0;
       }
    }

}
