import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TheatreTests {
    Theatre test;

    @Before public void setUp() {
        int[] firstRowAisleSeats = {2, 3, 10, 11};
        test = new Theatre(60, firstRowAisleSeats, 5);
    }

    @Test public void testPurchasedSeats() {
        test.purchaseSeat(10);
        assertEquals(test.getSize(), 59);
        assertTrue(test.isPurchased(10));
        test.purchaseSeat(10);
        assertEquals(test.getSize(), 59);
    }

    @Test public void testSeatReamining() {
        IntegerSet comparison = new IntegerSet();
        for (int i=0;i<60;i++) {
            comparison.insert(i+1);
        }
        test.purchaseSeat(15);
        comparison.remove(15);
        IntegerSet seatsRemaining = test.getSeatsRemaining();
        for (int i=1;i<seatsRemaining.size();i++) {
            if (i==15) {
                assertFalse(comparison.contains(i) || seatsRemaining.contains(i));
            } else {
                assertTrue(comparison.contains(i) && seatsRemaining.contains(i));
            }
        }
    }

    @Test public void testIsAisle() {
        assertTrue(test.isAisle(10));
        assertTrue(test.isAisle(27));
        assertFalse(test.isAisle(43));
        assertFalse(test.isAisle(36));
    }
}
