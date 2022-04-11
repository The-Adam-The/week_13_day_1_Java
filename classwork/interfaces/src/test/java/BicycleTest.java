import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BicycleTest {
    private Bicycle bicycle;

    @Before
    public void before() {
        bicycle = new Bicycle();
    }

    @Test
    public void hasDistanceAtBeginning() {
        assertEquals(0, bicycle.getDistanceTravelled());
    }

    @Test
    public void canMove(){
        bicycle.move(10);
        assertEquals(10, bicycle.getDistanceTravelled());
    }

    @Test
    public void canStop() { // NEW TEST
        assertEquals("Stop pedalling, apply the brakes", bicycle.stop());
    }
}