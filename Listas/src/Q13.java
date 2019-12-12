public class Q13 {

	public static void main(String[] args) {
		float chico = 1.50f; 
		float ze = 1.10f;
		
		int acm = 0;
		
		while(ze < chico) {
			chico += 0.03;
			ze += 0.05;
			acm++;
		}
		
		System.out.println(acm + " ano (s)");
		
	}

}
