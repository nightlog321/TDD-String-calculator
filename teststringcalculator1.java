package check;
import org.junit.Test;
public class teststringcalculator1 {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("check.teststringcalculator1");
    }

	@Test
	public void nulltest() {
		assertEquals(0, stringcalculator.add(""));
	}
}
