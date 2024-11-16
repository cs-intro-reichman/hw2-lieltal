// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int numberOfTerms = Integer.parseInt(args[0]);

		double sum = 0.0;

		double term = 0.0;
		for(int i = 0; i < numberOfTerms; i++) {
			if(i % 2 == 0) {
				term = 1.0 / (i * 2 + 1);

			}
			else {
				term = -1.0 / (i * 2 + 1);
			}
			sum += term;
		}
		sum *= 4;


		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + sum);
	}
}
