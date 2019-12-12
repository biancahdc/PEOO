
import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        Aluno aluno = new Aluno();
        
        System.out.println("Digite seu nome:");
        String nome = leia.nextLine();
        System.out.println("Digite sua matrícula:");
        String matricula = leia.nextLine();
        System.out.println("Digite seu curso:");
        String curso = leia.nextLine();
        System.out.println("Digite sue email:");
        String email = leia.nextLine();
        System.out.println("Quais são as disciplinas que você paga?");
        String disciplinas = leia.nextLine();
        
        
        aluno.setNome(nome);
        aluno.setMatricula(matricula);
        aluno.setCurso(curso);
        aluno.setEmail(email);
        aluno.setDisciplinas(disciplinas);
        
        System.out.println("-------------------------------------------");
        System.out.println("Informações do alunos:\n" + aluno.toString());
        
        System.out.println("--------------------------------------------");
        
        Aluno aluno2 = new Aluno();
        
        aluno2.setNome("Bianca");
        aluno2.setMatricula("20181114010040");
        aluno2.setCurso("INFO");
        aluno2.setEmail("biancahadassa03@gmail.com");
        aluno2.setDisciplinas("Matemática, PEOO, História");
        
        System.out.println("Nome:" + aluno2.getNome());
        System.out.println("Matricula:" + aluno2.getMatricula());
        System.out.println("Curso:" + aluno2.getCurso());
        System.out.println("E-mail:" + aluno2.getEmail());
        System.out.println("Disciplinas:" + aluno2.getDisiciplinas());
    }
}
