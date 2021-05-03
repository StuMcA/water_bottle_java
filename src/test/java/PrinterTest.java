import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer laserJet;

    @Before
    public void before() {
        laserJet = new Printer(15, 50);
    }

    @Test
    public void hasPagesLeft() {
        assertEquals(15, laserJet.getPages());
    }

    @Test
    public void canPrint() {
        laserJet.print(4, 3);
        assertEquals(3, laserJet.getPages());
        assertEquals(38, laserJet.getTonerVolume(), 0.01);
    }

    @Test
    public void notEnoughPaper() {
        laserJet.print(4, 4);
        assertEquals(15, laserJet.getPages());
        assertEquals(50, laserJet.getTonerVolume(), 0.01);
    }

    @Test
    public void hasToner() {
        assertEquals(50, laserJet.getTonerVolume(), 0.01);
    }

    @Test
    public void notEnoughToner() {
        Printer laserJetTwo = new Printer(100, 10);
        laserJetTwo.print(5, 3);
        assertEquals(100, laserJetTwo.getPages());
        assertEquals(10, laserJetTwo.getTonerVolume(), 0.01);
    }
}

