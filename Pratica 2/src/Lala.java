/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linda
 */
import java.util.Scanner;
public class Lala {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String[] lanches = new String[5];
		
		for (int i = 0; i < lanches.length; i++) {
			lanches[i] = leia.next();
			
			System.out.println(lanches[i]);
		}
	}

}


