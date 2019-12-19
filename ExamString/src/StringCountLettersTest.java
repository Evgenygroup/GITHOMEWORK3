import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCountLettersTest {

    private StringCountLetters s;

    @Before
    public void init() {
        s = new StringCountLetters();
    }

    @Test
    public void testZeroLength() {
        assertEquals(0, s.maxLength(""));
    }

    @Test
    public void testZeroLength1() {
        assertEquals(1, s.maxLength("a"));
    }

    @Test
    public void testZeroLength2() {
        assertEquals(1, s.maxLength("ab"));
    }

    @Test
    public void testZeroLengthStartwithMax() {
        assertEquals(4, s.maxLength("aaaabbccc"));
    }

    @Test
    public void testZeroLengthEndswithMax() {
        assertEquals(5, s.maxLength("bbbaaccccc"));
    }

    @Test
    public void testZeroLengthWithMaxInTheMiddle() {
        assertEquals(6, s.maxLength("bbbaaaaaaccc"));
    }


}
