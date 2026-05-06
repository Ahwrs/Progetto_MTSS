package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void testConvert_1() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvert_3() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testConvert_4() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void testConvert_5() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void testConvert_9() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvert_10() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvert_40() {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    public void testConvert_50() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void testConvert_90() {
        assertEquals("XC", IntegerToRoman.convert(90));
    }

    @Test
    public void testConvert_100() {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testConvert_400() {
        assertEquals("CD", IntegerToRoman.convert(400));
    }

    @Test
    public void testConvert_500() {
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    public void testConvert_900() {
        assertEquals("CM", IntegerToRoman.convert(900));
    }

    @Test
    public void testConvert_1000() {
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_Zero_ThrowsException() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_Over1000_ThrowsException() {
        IntegerToRoman.convert(1001);
    }
}