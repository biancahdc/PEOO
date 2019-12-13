
package br.edu.ifrn.peoo.exececoes.p3;

public class DivideByZeroException extends Exception{

    public DivideByZeroException() {
        super("Impossível realizar operação!!");
    }

    public DivideByZeroException(String message) {
        super(message);
    }
}
