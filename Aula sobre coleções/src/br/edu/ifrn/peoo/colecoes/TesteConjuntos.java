
package br.edu.ifrn.peoo.colecoes;

import java.util.HashSet;

public class TesteConjuntos {
    
    public static void main(String[] args) {
       
        HashSet<String> lab63 = new  HashSet<String>();
        
        System.out.println(lab63);
        
        System.out.println(lab63.add("Bianca"));
        System.out.println(lab63.add("bianca".toLowerCase()));
        System.out.println(lab63.add("Evelyn Beatriz"));
        System.out.println(lab63.add("Ellen"));
       
        System.out.println(lab63);
        
        System.out.println(lab63.remove("Ellen".toLowerCase()));
        
        HashSet<String> lab2 = new HashSet<String>();
        
        lab2.add("Andrielly");
        lab2.add("Vinicius");
        lab2.add("Bianca");
        
        HashSet<String> intersecao = (HashSet<String>) lab2.clone();
        
        intersecao.retainAll(lab63);
        
        System.out.println("\n" + lab63);
        System.out.println(lab2);
        System.out.println(intersecao);
        
        
    }
}
