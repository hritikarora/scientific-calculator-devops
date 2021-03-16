import calc.calculate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class calcTest {

    calculate cal = new calculate();

    private static final double DELTA = 1e-15;


    @Test
    public void factTruePositiveTest() {
        assertEquals("Factorial for true positive", 3628800.0, cal.fact(10.0), DELTA);
    }

    @Test
    public void factFalsePositiveTest() {
        assertNotEquals("Factorial for false positive",20.0, cal.fact(5.0), DELTA);
    }

    @Test
    public void powTruePositiveTest() {
        assertEquals("Power for true positive",100.0, cal.pow(10.0, 2.0), DELTA);
    }

    @Test
    public void powFalsePositiveTest() {
        assertNotEquals("Power for false positive",20.0, cal.pow(10.0, 2.0), DELTA);
    }

    @Test
    public void sqrtTruePositiveTest() {
        assertEquals("Square root for true positive",5.0, cal.sqrt(25.0), DELTA);
    }

    @Test
    public void sqrtFalsePositiveTest() {
        assertNotEquals("Square root for false positive",5.0, cal.sqrt(80.0), DELTA);
    }

    @Test
    public void logTruePositiveTest() {
        assertEquals("Natural logarithm for true positive",3.4011973816621555, cal.log(30.0), DELTA);
    }

    @Test
    public void logFalsePositiveTest() {
        assertNotEquals("Natural logarithm for false positive",5.0, cal.log(50.0), DELTA);
    }

}