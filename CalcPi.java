// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);

		double sum = 0.0;
		double sign = 1.0;

		for (int k = 0; k < n; k++) {
			sum += sign / (2.0 * k + 1);
			sign = -sign;
		}

		double piApprox = 4 * sum;
		System.out.println("pi according to java: " + Math.PI);
		System.out.println("pi, approximated:   " + piApprox);
	}
}
