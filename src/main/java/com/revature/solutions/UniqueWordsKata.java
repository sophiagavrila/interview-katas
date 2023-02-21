package com.revature.solutions;

import java.util.List;
import java.util.stream.Collectors;

public class UniqueWordsKata {

    /**
     * Write a method called filterUniqueWords that takes in a list of strings and returns a new
     * list of strings containing only the unique words from the original list. Your solution
     * MUST use the Stream API to filter out duplicates and create a new list of unique words.
     *
     * For example, if the input list is ["Java", "Python", "JavaScript", "C++", "Python"],
     * your method should return ["Java", "Python", "JavaScript", "C++"], since "Python"
     * appears more than once in the original list.
     */
    public static List<String> filterUniqueWords(List<String> words) {
        return words.stream()
                .distinct()
                .collect(Collectors.toList());
    }

}
