
package br.edu.ifrn.peoo.excecoes.p1;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        double n1 = leia.nextDouble();
        
        System.out.println("Digite outro número:");
        double n2 = leia.nextDouble();
        
        System.out.println("Digite 1, se você quer somar os números"
                          +"\nDigite 2, se você quer subtrair os números"
                          +"\nDigite 3, se você quer multiplicar os números"
                          +"\nDigite 4, se você quer dividir os números"
                          +"\nDigite 5, se você quer fazer todas as operações");
        int op = leia.nextInt();
        
        int num1 = (int) n1;
        int num2 = (int) n2;
        
        switch(op){
            case 1:   
            System.out.println("A soma do número " + n1 + " com o número " + n2 + " é " + Calc.soma(n1, n2));
            break;
            
            case 2:
            System.out.println("A subtração do número " + n1 + " com o número " + n2 + " é " + Calc.subt(n1, n2));
            break;
            
            case 3:
            System.out.println("A multiplicação do número " + n1 + " com o número " + n2 + " é " + Calc.multi(n1, n2));
            break;
            
            case 4:
            System.out.println("A divisão do número " + n1 + " com o número " + n2 + " é " + Calc.divi(num1, num2));
            break;
            
            case 5:
            System.out.println("A soma do número " + n1 + " com o número " + n2 + " é " + Calc.soma(n1, n2));
            System.out.println("A subtração do número " + n1 + " com o número " + n2 + " é " + Calc.subt(n1, n2));
            System.out.println("A multiplicação do número " + n1 + " com o número " + n2 + " é " + Calc.multi(n1, n2));
            System.out.println("A divisão do número " + n1 + " com o número " + n2 + " é " + Calc.divi(num1, num2));
            break;
            
            default:
                System.out.println("Impossível realizar qualquer coisa fora estas.");
        }
    }
}
