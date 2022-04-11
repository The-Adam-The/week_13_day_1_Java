import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    Desktop desktop;

    @Before
    public void before(){
        desktop = new Desktop("Home PC", "Dell", "t99");

    }

    @Test
    public void canConnect(){
        assertEquals("connecting to network: CodeClan", desktop.connect("CodeClan"));
    }

}
