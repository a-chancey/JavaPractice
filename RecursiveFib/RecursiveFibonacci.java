import java.util.Scanner;
public class RecursiveFibonacci{
	public static void main(String[] args){
		System.out.println("How many digits do you want to calculate up to?");
		int number = new Scanner(System.in).nextInt();
		if(number <= 0)
			throw new IllegalArgumentException("Please use a number larget than one");
	
	
		System.out.println ("Fibonacci sequence up to " + number + " places: ");
		for(int i = 1; i <= number; i++){
			System.out.print (calculate(i) + " ");
		}
		
		
	}
	
	public static int calculate(int i) {
	int results;
	if (i==1 || i == 2)
		return 1;
	
	return calculate(i - 1) + calculate(i - 2) ;
	
	}
	

}