package com.revature.challenges;

import org.junit.jupiter.api.Test;

import static com.revature.challenges.StringKata.reverseWords;
import static org.junit.jupiter.api.Assertions.*;

class StringKataTest {

    @Test
    public void testReverseWords1() {
        assertEquals("olleH dlrow", reverseWords("Hello world"));
    }

    @Test
    public void testReverseWords2() {
        assertEquals("sihT si a ecnetnes", reverseWords("This is a sentence"));
    }

    @Test
    public void testReverseWords3() {
        assertEquals("gnitnuocca erawtfos mroftalP retaerg eht htiw rellortnoC",
                reverseWords("accounting software Platform greater the with Controller"));
    }

    @Test
    public void testReverseWords4() {
        assertEquals("gnirts a si sihT", reverseWords("string a is This"));
    }

    @Test
    public void testReverseEmptyString() {
        assertEquals("", reverseWords(""));
    }
}