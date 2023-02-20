package com.revature.solutions;

public class ReverseStringKata {

    /**
     * Write a Java method reverseWords(String sentence) that takes a sentence as input
     * and returns a new string with each word reversed while maintaining the original
     * word order in the sentence.
     *
     * A word is defined as a sequence of non-space characters.
     *
     * For example, if the input string is "This is a sentence", the output should be "sihT si a ecnetnes".
     */

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedSentence.append(reversedWord).append(" ");
        }
        return reversedSentence.toString().trim();
    }
}
