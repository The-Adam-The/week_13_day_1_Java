package people;

import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    RollerCoaster rollerCoaster;

    @Before
    public void before(){

        visitor = new Visitor(14, 1.2, 40.0);
        rollerCoaster = new RollerCoaster("The Deathanator", 9);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void hasVisitedList() {
        assertEquals(Arrays.asList(), visitor.getVisitedAttractions());
    }

    @Test
    public void canAddToVisitedList(){
        visitor.addToVisitedAttractions(rollerCoaster);
        assertEquals(Arrays.asList(rollerCoaster), visitor.getVisitedAttractions());
    }
}
