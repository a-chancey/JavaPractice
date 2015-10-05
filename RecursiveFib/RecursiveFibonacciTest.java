import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursiveFibonacciTest {
	@Test
	public void TestOne() {
		RecursiveFibonacci recFib = new RecursiveFibonacci();
		
		int results = recFib.calculate(1);
		assertEquals(1, results);
	}
	@Test
	public void TestTen() {
		RecursiveFibonacci recFib = new RecursiveFibonacci();
		int results = recFib.calculate(10);
		assertEquals(55 , results);
		
	}
}