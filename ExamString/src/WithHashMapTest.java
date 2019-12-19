import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithHashMapTest {

    private WithHashMap w;

    @Before
    public void init() {
        w = new WithHashMap();
    }

    @Test
    public void testZeroLength() {
        assertEquals(0, w.maxLength(""));
    }

    @Test
    public void testZeroLength1() {
        assertEquals(1, w.maxLength("a"));
    }

    @Test
    public void testZeroLength2() {
        assertEquals(1, w.maxLength("ab"));
    }

    @Test
    public void testZeroLengthStartwithMax() {
        assertEquals(4, w.maxLength("aaaabbccc"));
    }

    @Test
    public void testZeroLengthEndswithMax() {
        assertEquals(5, w.maxLength("bbbaaccccc"));
    }

    @Test
    public void testZeroLengthWithMaxInTheMiddle() {
        assertEquals(6, w.maxLength("bbbaaaaaaccc"));
    }


}
