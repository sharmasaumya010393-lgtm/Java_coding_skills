package com.streamsApi.codes;

import java.util.Arrays;

public class OccurenceOfEachWord {

    public static void main (String [] args){

        String sentence = "How are you? how is it going?";

        long count = Arrays.stream(sentence.toLowerCase().split("\\W+"))
                .filter(word -> word.equals("how"))
                .count();

        System.out.println("The count of how is : " +count);

    }

}
