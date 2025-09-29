package com.streamsApi.codes;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestWord {
     public static void main(String []args){

         String s = "I am learning java programming";

         String secondLongest= Arrays.stream(s.split("\\s+"))
                 .filter(word ->!word.isEmpty()) // ignore empty words
                 .sorted(Comparator.comparing(String::length)
                 .reversed()) // sort by length descending
                 .skip(1).findFirst() // skip the first (longest word)
                 .orElse("No second largest word");

         System.out.println("The largest String is : " + secondLongest);
     }
}
