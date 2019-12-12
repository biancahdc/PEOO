
import java.util.Scanner;

public class TesteCalc {
    
    public static void main(String[] args) {
        
        Calculadora c1 = new Calculadora();
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        double num1 = leia.nextDouble();
        System.out.println("Digite um número: ");
        double num2 = leia.nextDouble();
        
        System.out.println("O resultado da soma é: " + c1.somar(num1, num2));
        System.out.println("O resultado da subtração é: " + c1.subtrair(num1, num2));
        System.out.println("O resultado da multiplicação é: " + c1.multiplicar(num1, num2));
        System.out.println("O resultado da divisão é: " + c1.dividir(num1, num2));
        
        System.out.println("---------------------------------");
        
        Calculadora c2 = new Calculadora();
        
        System.out.println("Digite um número: ");
        double numero1 = leia.nextDouble();
        System.out.println("Digite um número: ");
        double numero2 = leia.nextDouble();
        
        System.out.println("O resultado da soma é: " + c1.somar(numero1, numero2));
        System.out.println("O resultado da subtração é: " + c1.subtrair(numero1, numero2));
        System.out.println("O resultado da multiplicação é: " + c1.multiplicar(numero1, numero2));
        System.out.println("O resultado da divisão é: " + c1.dividir(numero1, numero2));
}
}
