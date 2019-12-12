public class Aluno {
    
    private String nome;
    private String matricula;
    private String curso;
    private String email;
    private String disciplinas;
    
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getDisiciplinas(){
        return this.disciplinas;
    }
    public void setDisciplinas(String disciplinas){
        this.disciplinas = disciplinas;
    }
    
    public String toString(){
        return "Nome: " + nome
                +"\nMatricula: " + matricula
                +"\nCurso: " + curso
                +"\nE-mail: " + email
                +"\nDisciplinas: " + disciplinas;
    }
}
