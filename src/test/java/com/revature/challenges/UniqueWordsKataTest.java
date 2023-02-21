package com.revature.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.revature.challenges.UniqueWordsKata.filterUniqueWords;
import static org.junit.jupiter.api.Assertions.*;

class UniqueWordsKataTest {

    @Test
    public void testFilterUniqueWordsReturnsCorrectResult() {
        List<String> words = Arrays.asList("Java", "Python", "JavaScript", "C++", "Python");
        List<String> expectedUniqueWords = Arrays.asList("Java", "Python", "JavaScript", "C++");
        List<String> actualUniqueWords = filterUniqueWords(words);
        assertEquals(expectedUniqueWords, actualUniqueWords);
    }

    @Test
    public void testFilterUniqueWordsWithCapitalLettersReturnsCorrectResult() {
        List<String> words = Arrays.asList("dog", "cat", "Cat", "cat", "mouse", "dog");
        List<String> expectedUniqueWords = Arrays.asList("dog", "cat", "Cat", "mouse");
        List<String> actualUniqueWords = filterUniqueWords(words);
        assertEquals(expectedUniqueWords, actualUniqueWords);
    }

    @Test
    public void testFilterUniqueWordsReturnsEmptyListForEmptyInput() {
        List<String> words = Arrays.asList();
        List<String> expectedUniqueWords = Arrays.asList();
        List<String> actualUniqueWords = filterUniqueWords(words);
        assertEquals(expectedUniqueWords, actualUniqueWords);
    }

}