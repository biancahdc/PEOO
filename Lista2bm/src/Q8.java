import java.util.Random;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random num = new Random();
		
		int[] faces = new int[6];
	
		System.out.println("Quantas vezes você quer rolar o dado?");
		int rolar = leia.nextInt();
		
		for (int i = 0; i < rolar; i++) {
			int n = num.nextInt(5) + 1;
			faces[n - 1]++;
		}
		for (int i = 0; i < faces.length; i++) {
			System.out.println("Face " + (i + 1) + " : " + faces[i]);
		}
	}

}
