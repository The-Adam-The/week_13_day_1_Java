import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before() {
        car = new Car("Toyota", "Corrolla");
    }

    @Test
    public void canMove(){
        car.move(10);
        assertEquals(10, car.getOdometerReading());
    }

    @Test
    public void canStart() { // NEW TEST
        assertEquals("Switch on the ignition.", car.start());
    }

    @Test
    public void canStop() { // NEW TEST
        assertEquals("Ease off the accelerator, apply the brake.", car.stop());
    }

}
