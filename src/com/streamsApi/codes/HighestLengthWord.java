package com.streamsApi.codes;

import java.util.Arrays;
import java.util.Comparator;

public class HighestLengthWord {

    public static void main(String[] args) {

        String s = "I am learning java";
        String ans = Arrays.stream(s.split(" "))
                .filter(word -> !word.isEmpty())
                .max(Comparator.comparing(String::length))
                .orElse("No words found");

        System.out.println("The longest string is : " + ans);
    }
}