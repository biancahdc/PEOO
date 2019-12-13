import java.util.Random;
public class Q9 {

	public static void main(String[] args) {
		Random num = new Random();
		
		int[] alunos = new int[90];
		
		int contMaior = 0, contMenor = 0;
		
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = num.nextInt(310);
			
			if(alunos[i] > 100){
				contMaior++;
			}
			if(alunos[i] < 10){
				contMenor++;
			}
		}
		for (int i = 0; i < alunos.length; i++) {
			System.out.print(alunos[i] + " ");
		}
		System.out.println(" ");
		System.out.println(contMaior + " alunos acessaram a internet por mais de 100 horas");
		System.out.println(contMenor + " alunos acessaram a internet por menos de 10 horas");
	}

}
