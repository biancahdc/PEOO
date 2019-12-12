import java.util.Random;

public class Q14 {
	//Vinicius me ajudou
	public static void main(String[] args) {
		Random aleatorio = new Random();

		for (int i = 0; i <= 20; i++) {
			int numRandom = aleatorio.nextInt(3000);
			if(numRandom % 11 == 5) {
				System.out.println(numRandom);
			}
		}
		
	}

}
