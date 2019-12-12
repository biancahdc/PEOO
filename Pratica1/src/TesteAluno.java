
public class TesteAluno {
    public static void main(String[] args) {
     
        Aluno a1 = new Aluno();
    
        a1.nome = "Bianca";
        a1.curso = "Informática";
        a1.matricula = "2018.11140100.40";
        a1.email = "biancahadassa03@gmail.com";
        a1.disciplina = "PEOO";
        
        System.out.println("O nome do(a) aluno(a) é " + a1.nome);
        System.out.println("O curso de " + a1.nome + " é " + a1.curso);
        System.out.println("A matrícula de " + a1.nome + " é " + a1.matricula);
        System.out.println("O email de " + a1.nome + " é "+ a1.email);
        System.out.println(a1.estudando());
        
        System.out.println("------------------------------------");
        
        Aluno a2 = new Aluno();
    
        a2.nome = "Hadassa";
        a2.curso = "Informática";
        a2.matricula = "2017.11140100.01";
        a2.email = "hadassadonativa@gmail.com";
        a2.disciplina = "Biologia";
        
        System.out.println("O nome do(a) aluno(a) é " + a2.nome);
        System.out.println("O curso de " + a2.nome + " é " + a2.curso);
        System.out.println("A matrícula de " + a2.nome + " é " + a2.matricula);
        System.out.println("O email de " + a2.nome + " é "+ a2.email);
        System.out.println(a2.estudando());
    }
}
