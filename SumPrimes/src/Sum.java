import java.io.IOException;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("Say how many primes you want to calculate");
		Scanner sc = new Scanner(System.in);
		int nrcalculate = sc.nextInt();
		
		CalculatePrime cp = new CalculatePrime();
		System.out.println("The sum of the "+nrcalculate+" first prime numbers is: "+ cp.somaPrimos(nrcalculate));
		
		
	}

}
