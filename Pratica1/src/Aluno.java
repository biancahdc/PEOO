public class Aluno {
    String nome;
    String matricula;
    String curso;
    String email;
    String disciplina;
    boolean estudando;
    
    boolean estudando(){
        estudando = true;
        System.out.println(nome + " está estudando " + disciplina);
        return estudando;
    }
    
    boolean procrastinando(){
        estudando = false;
        System.out.println(nome + " está procrastinando.");
        return estudando;
    }
}
