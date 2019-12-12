
public class Q {
	public static void main(String[] args) {
		double nataA = 0.05;
		double nataB = 0.02;
		double paisA = 5000000;
		double paisB = 7000000;
		int acm = 0;
		
		while(paisB > paisA) {
			paisA = paisA * nataA;
			paisB = paisB * nataB;
			acm++;
		}
		
		System.out.println(acm + " anos");
	}
}
