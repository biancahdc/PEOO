
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class TesteLista {
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<String>();
        
        lista.add("Bianca");
        lista.add("Hadassa");
        lista.add("Dantas");
        lista.add("Cavalcanti");
        
        System.out.println(lista);
        
        lista.add(1, "Linda");
        System.out.println(lista);
        
        if(lista.size() >= 3){
        
        String nome = lista.get(2);
        System.out.println("Nome: " + nome);
        }
        
        lista.remove("Linda");
        System.out.println(lista);
        
        for (String nome : lista){
            System.out.println(nome);
        }
        
        
    }
} 