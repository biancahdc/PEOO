
package br.ifrn.edu.aulainterface;

import java.util.Scanner;

public interface TesteZoo {
    
    public static void cicloDeVida(Animal animal){
        animal.nasca();
        animal.passeie();
        animal.durma();
        animal.peso();
    }
    
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        
        Zebra z1 = new Zebra(102,99);
        Animal z2  = new Zebra(101,107);
        Morcego m1 = new Morcego();
        Ornitorrinco o1 = new Ornitorrinco(25);
        
        
        System.out.println("Informções dos animais:\n");
        System.out.println("ZEBRA:");
        cicloDeVida(z1);
        System.out.println("\nZEBRA 2:");
        cicloDeVida(z2);
        System.out.println("\nMORCEGO:");
        cicloDeVida(m1);
        System.out.println("\nORNITORRINCO:");
        cicloDeVida(o1);
        
    }
    
}
