
public class rFunctions {
	
	
	public int factorial(int n) {
		int result = 1;
		
		for(int i = 1; i <= n; i++) 
			result *= i;
		
		return result;
	}
	
	public int combination(int n, int r) {
		int result = 0;
		
		result = factorial(n)/(factorial(r)*factorial(n-r));
		
		return result;
	}
	
	public int permutation(int n, int r) {
		int result = 0;
		
		result = factorial(n)/factorial(n-r);
		
		return result;
	}
	
	public double dbinom(int x, int size, float prob) {
		double result = combination(size, x)*Math.pow(prob, x)*Math.pow(1-prob, size-x);
		
		return result;
	}
}
