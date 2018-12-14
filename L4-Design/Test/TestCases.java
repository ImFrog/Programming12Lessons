import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCases {

    private IntegerSet mySet;
    private Dummy dum;

    @Before
    public void setup() {
        dum = new Dummy();
        mySet = new IntegerSet();
    }

    @Test
    public void testDummy(){
        dum = new Dummy();
        assertEquals(10, dum.num());
    }

    @Test
    public void testNumDoesNotExists() {
        assertEquals(0, mySet.size());
        mySet.insert(10);
        assertEquals(1, mySet.size());
        assertTrue(mySet.contains(10));
    }

    @Test
    public void testNumAlreadyExists() {
        assertEquals(0, mySet.size());
        mySet.insert(10);
        assertEquals(1, mySet.size());
        assertTrue(mySet.contains(10));
        mySet.insert(10);
        assertEquals(1, mySet.size());
    }

    @Test
    public void testRemovingNum() {
        assertEquals(0, mySet.size());
        mySet.insert(10);
        assertEquals(1, mySet.size());
        mySet.remove(10);
        assertEquals(0, mySet.size());
    }
}
