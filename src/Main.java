import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		rFunctions R = new rFunctions();
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World!");
		
		int x = sc.nextInt();
		int size = sc.nextInt();
		float prob = sc.nextFloat();
		
		double result = R.dbinom(x, size, prob);
		System.out.println("Answer: " + result);
		
	}
}
