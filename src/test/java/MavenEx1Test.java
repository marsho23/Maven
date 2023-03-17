
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.demo.Factorial;
public class MavenEx1Test {
	
	private Factorial factorial = new Factorial();
	
	@Test
	void testFactoiral() {
		assertEquals("5!",this.factorial.calcFactorial(120));
	}
	
	@Test
	void testFactorial2() {
		assertEquals("NONE",this.factorial.calcFactorial(150));
	}
}
