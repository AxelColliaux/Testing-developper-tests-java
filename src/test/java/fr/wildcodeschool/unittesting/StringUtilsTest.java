package fr.wildcodeschool.unittesting;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testVowels() {
        assertEquals("aeiouy", StringUtils.vowels("abcdefghijklmnopqrstuvwxyz"));
        assertEquals("aeiou", StringUtils.vowels("aeiou"));
        assertEquals("AEIOU", StringUtils.vowels("AEIOU"));
        assertEquals("", StringUtils.vowels("bcdfg"));
        assertEquals("", StringUtils.vowels(""));
        assertEquals("AEIOUY", StringUtils.vowels("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVowelsWithException() {
        StringUtils.vowels(null);
    }

    @Test
    public void testUniqueVowels() {
        assertEquals("aeiouy", StringUtils.uniqueVowels("abcdefghijklmnopqrstuvwxyz"));
        assertEquals("aeiouy", StringUtils.uniqueVowels("aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz"));
        assertEquals("", StringUtils.uniqueVowels("bcdfg"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUniqueVowelsWithNullInput() {
        StringUtils.uniqueVowels(null);
    }
}
