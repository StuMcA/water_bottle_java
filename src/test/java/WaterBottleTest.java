import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle evian;

    @Before
    public void before() {
        evian = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, evian.getVolume());
    }

    @Test
    public void drink() {
        evian.drink();
        assertEquals(90, evian.getVolume());
    }

    @Test
    public void empty() {
        evian.empty();
        assertEquals(0, evian.getVolume());
    }

    @Test
    public void fillUp() {
        evian.fillUp();
        assertEquals(100, evian.getVolume());
    }
}
