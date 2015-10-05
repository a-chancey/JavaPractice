import java.util.Scanner;

public class RecursiveFactorial {
	public static void main(String[] args) {
		
	}
		int results;
	public int calculate(int i) {
		int results;
		if (i == 1 || i == 0) {
			return 1;
		}
		
		results = i * calculate(i - 1);
		return results;
	}
	
}