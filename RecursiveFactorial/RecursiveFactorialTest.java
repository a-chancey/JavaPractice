import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursiveFactorialTest {
	@Test
	public void TestThree(){
		RecursiveFactorial recFact = new RecursiveFactorial();
		int results = recFact.calculate(3);
		assertEquals(6, results);
		}
	
	@Test
	public void testOne() {
		RecursiveFactorial recFact = new RecursiveFactorial();
		int results = recFact.calculate(1);
		assertEquals(1, results);
	}
	
	@Test
	public void testTen(){
		RecursiveFactorial recFact = new RecursiveFactorial();
		int results = recFact.calculate(10);
		assertEquals(3628800, results);
	}
		
}