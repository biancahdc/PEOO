public class TesteCalc {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        double n1 = leia.nextDouble();
        
        System.out.println("Digite outro número:");
        double n2 = leia.nextDouble();
        
        System.out.println("Digite 1, se você quer somar os números");
        int op1 = leia.nextInt();
        System.out.println("Digite 2, se você quer subtrair os números");
        int op2 = leia.nextInt();
        System.out.println("Digite 3, se você quer multiplicar os números");
        int op3 = leia.nextInt();
        System.out.println("Digite 4, se você quer dividir os números");
        int op4 = leia.nextInt();
        
        if(op1 == 1){
            System.out.println("A soma do número " + n1 + " com o número " + n2 + " é " + Calculadora.soma(n1, n2));
        }else if(op2 == 2){
            System.out.println("A subtração do número " + n1 + " com o número " + n2 + " é " + Calculadora.subt(n1, n2));
        }else if(op3 == 3){
            System.out.println("A multiplicação do número " + n1 + " com o número " + n2 + " é " + Calculadora.multi(n1, n2));
        }else if(op4 == 4){
            System.out.println("A divisão do número " + n1 + " com o número " + n2 + " é " + Calculadora.divi(n1, n2));
        }
    }
}
