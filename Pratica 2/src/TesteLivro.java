
import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Livro livro = new Livro();
    
        livro.setTitulo("A abolição do homem");
        livro.setAutor("C.S Lewis");
        livro.setEditora("Thomas Nelson");
        livro.setPreco(40);
        
        System.out.println(livro.toString());
        
        System.out.println("------------------------------");
        
        Livro livro2 = new Livro();
        
        livro2.setTitulo("A seleção");
        livro2.setAutor("Kiera Cass");
        livro2.setEditora("Bianca");
        livro2.setPreco(30);
        
        System.out.println("O nome do livro é:" + livro2.getTitulo());
        System.out.println("O livro pertence a editora:" + livro2.getAutor());
        System.out.println("O autor(a) é:" + livro2.getEditora());
        System.out.println("O livro custou" + livro2.getPreco());
    }
}
